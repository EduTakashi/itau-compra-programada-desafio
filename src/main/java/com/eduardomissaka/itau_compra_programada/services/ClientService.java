package com.eduardomissaka.itau_compra_programada.services;

import com.eduardomissaka.itau_compra_programada.dtos.ClientDTO;
import com.eduardomissaka.itau_compra_programada.entities.Client;
import com.eduardomissaka.itau_compra_programada.entities.ContasGraficas;
import com.eduardomissaka.itau_compra_programada.entities.Custodias;
import com.eduardomissaka.itau_compra_programada.enuns.ContasGraficasEnum;
import com.eduardomissaka.itau_compra_programada.exceptions.ValorMensalMinimoException;
import com.eduardomissaka.itau_compra_programada.repositories.ClientRepository;
import com.eduardomissaka.itau_compra_programada.repositories.ContasGraficasRepository;
import com.eduardomissaka.itau_compra_programada.repositories.CustodiasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
public class ClientService {

    private static final double VALOR_MINIMO = 100.0;

    @Autowired
    private ClientRepository repository;

    @Autowired
    private ContasGraficasRepository contasGraficasRepository;

    @Autowired
    private CustodiasRepository custodiasRepository;

    @Transactional
    public ClientDTO insert(ClientDTO dto) {
        // RN-003: validar valor mínimo
        if (dto.getValorMensal() == null || dto.getValorMensal() < VALOR_MINIMO) {
            throw new ValorMensalMinimoException(
                "O valor mensal mínimo é R$ " + VALOR_MINIMO + ". Valor informado: " + dto.getValorMensal());
        }

        Client client = new Client();
        client.setName(dto.getName());
        client.setEmail(dto.getEmail());
        client.setCpf(dto.getCpf());
        client.setValorMensal(dto.getValorMensal());
        client.setAtivo(true);
        client.setDataAdesao(LocalDate.now());
        client = repository.save(client);

        // RN-004: criar Conta Gráfica Filhote automaticamente vinculada ao cliente
        ContasGraficas contaGrafica = new ContasGraficas();
        contaGrafica.setClientId(client);
        contaGrafica.setTipo(ContasGraficasEnum.FILHOTE);
        contaGrafica.setDataCriacao(LocalDate.now());
        contaGrafica = contasGraficasRepository.save(contaGrafica);

        // RN-004: criar Custódia Filhote vinculada à conta gráfica
        Custodias custodia = new Custodias();
        custodia.setContaGrafica(contaGrafica);
        custodia.setQuantidade(0);
        custodia.setPrecoMedio(0.0);
        custodia.setDataUltimaAtualizacao(LocalDate.now());
        custodiasRepository.save(custodia);

        return new ClientDTO(client);
    }

    @Transactional
    public ClientDTO updateValorMensal(Long id, Double valorMensal) {
        if (valorMensal == null || valorMensal < VALOR_MINIMO) {
            throw new ValorMensalMinimoException(
                "O valor mensal mínimo é R$ " + VALOR_MINIMO + ". Valor informado: " + valorMensal);
        }

        Client client = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Cliente não encontrado com ID: " + id));

        client.setValorMensal(valorMensal);
        client = repository.save(client);

        return new ClientDTO(client);
    }
}
