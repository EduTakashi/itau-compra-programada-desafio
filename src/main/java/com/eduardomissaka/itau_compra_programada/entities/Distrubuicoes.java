package com.eduardomissaka.itau_compra_programada.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_distribuicoes")
public class Distrubuicoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ordem_compra_id", referencedColumnName = "id")
    private Custodias ordemCompraId;

    @ManyToOne
    @JoinColumn(name = "custodia_filhote_id", referencedColumnName = "id")
    private Custodias custodiaFilhoteId;

    private String ticker;
    private int quantidade;
    private double precoUnitario;
    private Date dataDistribuicao;
}
