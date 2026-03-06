package com.eduardomissaka.itau_compra_programada.repositories;

import com.eduardomissaka.itau_compra_programada.entities.Cotacoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CotacoesRepository extends JpaRepository<Cotacoes, Long> {
}

