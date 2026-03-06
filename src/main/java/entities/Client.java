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
@Table(name = "tb_clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String cpf;

    private String email;
    private Double valorMensal;

    @Column(columnDefinition = "BOOLEAN DEFAULT true")
    private boolean Ativo;
    private Date DataAdesao;

    @OneToOne(mappedBy = "clientId")
    private ContasGraficas contasGraficas;

    @OneToMany(mappedBy = "clientId")
    private List<EventosIR> eventosList;
}
