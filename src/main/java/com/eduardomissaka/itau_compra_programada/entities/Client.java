package com.eduardomissaka.itau_compra_programada.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "tb_clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String cpf;

    private String email;

    @Column(precision = 10, scale = 2)
    private Double valorMensal;

    private boolean Ativo;

    private LocalDate DataAdesao;

    @OneToOne(mappedBy = "clientId")
    private ContasGraficas contasGraficas;

    @OneToMany(mappedBy = "clientId")
    private List<EventosIR> eventosList;

    @OneToMany(mappedBy = "clientId")
    private List<Rebalanceamentos> rebalanceamentosList;
}
