package com.terminal.marittimo.spedizioni.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class RegistroRitiri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "buono_consegna_id")
    private BuonoDiConsegna buonoConsegna;

    @ManyToOne
    @JoinColumn(name = "camion_id")
    private Camion camion;

    @ManyToOne
    @JoinColumn(name = "autista_id")
    private Autista autista;

    private LocalDate dataRitiro;
    private double pesoRitirato; // Peso in kg

    // Costruttori
    public RegistroRitiri() {}

    public RegistroRitiri(BuonoDiConsegna buonoConsegna, Camion camion, Autista autista, LocalDate dataRitiro, double pesoRitirato) {
        this.buonoConsegna = buonoConsegna;
        this.camion = camion;
        this.autista = autista;
        this.dataRitiro = dataRitiro;
        this.pesoRitirato = pesoRitirato;
    }

    // Getter e Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BuonoDiConsegna getBuonoConsegna() {
        return buonoConsegna;
    }

    public void setBuonoConsegna(BuonoDiConsegna buonoConsegna) {
        this.buonoConsegna = buonoConsegna;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    public Autista getAutista() {
        return autista;
    }

    public void setAutista(Autista autista) {
        this.autista = autista;
    }

    public LocalDate getDataRitiro() {
        return dataRitiro;
    }

    public void setDataRitiro(LocalDate dataRitiro) {
        this.dataRitiro = dataRitiro;
    }

    public double getPesoRitirato() {
        return pesoRitirato;
    }

    public void setPesoRitirato(double pesoRitirato) {
        this.pesoRitirato = pesoRitirato;
    }
}
