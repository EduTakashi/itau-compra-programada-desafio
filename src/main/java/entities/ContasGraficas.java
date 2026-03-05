package entities;

import enuns.TipoEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "tb_contas_graficas")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ContasGraficas {

    private Long id;
    private Long ClientId;
    private String numeroConta;
    private TipoEnum tipo;
    private Date DataCriacao;
}
