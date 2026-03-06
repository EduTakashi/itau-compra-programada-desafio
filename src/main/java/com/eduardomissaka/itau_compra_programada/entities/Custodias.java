package com.eduardomissaka.itau_compra_programada.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_custodias")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Custodias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
        @JoinColumn(name = "conta_grafica_id", referencedColumnName = "id")
    private ContasGraficas contaGrafica;

    private String ticker;
    private int quantidade;
    private double precoMedio;
    private LocalDate dataUltimaAtualizacao;

    @OneToMany(mappedBy = "ordemCompraId")
    private List<Distrubuicoes> ordemCompra;
    @OneToMany(mappedBy = "custodiaFilhoteId")
    private List<Distrubuicoes> custodiaFilhote;

    @OneToMany(mappedBy = "id")
    private List<OrdensCompra> ordensCompra;

}
