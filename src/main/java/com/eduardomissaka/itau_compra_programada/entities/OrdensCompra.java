package com.eduardomissaka.itau_compra_programada.entities;

import com.eduardomissaka.itau_compra_programada.enuns.OrdensCompraEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "tb_ordens_compra")
public class OrdensCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "custodia_id", referencedColumnName = "id")
    private Custodias custodiasId;

    private String ticker;
    private int quantidade;
    private double precoUnitario;
    private OrdensCompraEnum tipoMercado;
    private Date dataExecucao;

}
