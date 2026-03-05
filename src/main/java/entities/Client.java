package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = "tb_clients")
public class Client {

    private Long id;
    private String name;
    private String cpf;
    private String email;
    private Double valorMensal;
    private boolean Ativo;
    private Date DataAdesao;
}
