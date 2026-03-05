package entities;

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
@Table(name = "tb_cestas_recomendacao")
public class CestasRecomendacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean Ativa;
    private Date dataCriacao;
    private Date dataDesativacao;

    @OneToMany(mappedBy = "cestasId")
    private List<ItensCesta> itens;
}
