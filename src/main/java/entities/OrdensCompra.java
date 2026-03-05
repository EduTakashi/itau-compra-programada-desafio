package entities;

import enuns.TipoMercado;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

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
    private TipoMercado tipoMercado;
    private Date dataExecucao;

}
