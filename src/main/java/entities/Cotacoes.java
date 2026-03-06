package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "tb_cotacoes")
public class Cotacoes {

    private Long id;
    private Date dataPregao;
    private String ticker;
    private double precoAbertura;
    private double precoFechamento;
    private double precoMaximo;
    private double precoMinimo;
}
