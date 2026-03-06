package com.eduardomissaka.itau_compra_programada.entities;

import com.eduardomissaka.itau_compra_programada.enuns.RebalanceamentosEnum;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

public class Rebalanceamentos {

    private Long id;

    private RebalanceamentosEnum tipo;

    @ManyToOne
    @JoinColumn(name = "client_idRebalanceamentos", referencedColumnName = "id")
    private Client clientId;

    private String tickerVendido;
    private String tickerComprado;
    private Double valorVenda;
    private Date dataRebalanceamento;
}
