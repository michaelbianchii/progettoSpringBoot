package com.terminal.marittimo.spedizioni.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class BuonoDiConsegna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "polizza_id")
    private PolizzaDiCarico polizza;

    private double pesoRitirato; // Peso in kg

    // Costruttori
    public BuonoDiConsegna() {}

    public BuonoDiConsegna(Cliente cliente, PolizzaDiCarico polizza, double pesoRitirato) {
        this.cliente = cliente;
        this.polizza = polizza;
        this.pesoRitirato = pesoRitirato;
    }

    // Getter e Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public PolizzaDiCarico getPolizza() {
        return polizza;
    }

    public void setPolizza(PolizzaDiCarico polizza) {
        this.polizza = polizza;
    }

    public double getPesoRitirato() {
        return pesoRitirato;
    }

    public void setPesoRitirato(double pesoRitirato) {
        this.pesoRitirato = pesoRitirato;
    }
}
