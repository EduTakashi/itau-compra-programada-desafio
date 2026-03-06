package com.eduardomissaka.itau_compra_programada.repositories;

import com.eduardomissaka.itau_compra_programada.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
