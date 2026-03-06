package com.eduardomissaka.itau_compra_programada.entities;

import com.eduardomissaka.itau_compra_programada.enuns.EventoEnum;
import jakarta.persistence.*;

import java.time.LocalDate;
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
    private LocalDate dataEvento;

}
