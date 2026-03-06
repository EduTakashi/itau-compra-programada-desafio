package com.eduardomissaka.itau_compra_programada.dtos;


import com.eduardomissaka.itau_compra_programada.entities.Client;

import java.time.LocalDate;

public class ClientDTO {

    private String name;
    private String email;
    private String cpf;
    private Double valorMensal;
    private boolean ativo;
    private LocalDate dataAdesao;


    public ClientDTO(){
    }

    public ClientDTO(String name, String email, String cpf, Double valorMensal) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.valorMensal = valorMensal;
    }

    public ClientDTO(Client entity){
        name = entity.getName();
        email = entity.getEmail();
        cpf = entity.getCpf();
        valorMensal = entity.getValorMensal();
        ativo = entity.isAtivo();
        dataAdesao = entity.getDataAdesao();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(Double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDate getDataAdesao() {
        return dataAdesao;
    }

    public void setDataAdesao(LocalDate dataAdesao) {
        this.dataAdesao = dataAdesao;
    }
}
