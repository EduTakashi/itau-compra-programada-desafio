package entities;

import enuns.ContasGraficasEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_contas_graficas")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ContasGraficas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client clientId;

    @OneToMany(mappedBy = "contaGraficaId")
    private List<Custodias> custodias;

    private String numeroConta;
    private ContasGraficasEnum tipo;
    private Date DataCriacao;

}
