package com.eduardomissaka.itau_compra_programada.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_itens_cesta")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItensCesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cesta_id", referencedColumnName = "id")
    private CestasRecomendacao cestasId;
    private String ticker;
    private Double percentual;

}
