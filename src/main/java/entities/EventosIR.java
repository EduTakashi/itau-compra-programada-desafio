package entities;

import enuns.EventoEnum;
import jakarta.persistence.*;

import java.util.Date;

public class EventosIR {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_idEventosIR", referencedColumnName = "id")
    private Client clientId;

    private EventoEnum tipo;
    private Double valorBase;
    private Double valorIR;
    private boolean publicadoKafka;
    private Date dataEvento;

}
