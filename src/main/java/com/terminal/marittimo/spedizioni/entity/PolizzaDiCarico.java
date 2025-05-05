package com.terminal.marittimo.spedizioni.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PolizzaDiCarico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "viaggio_id")
    private Viaggio viaggio;

    @ManyToOne
    @JoinColumn(name = "fornitore_id")
    private Fornitore fornitore;

    @ManyToOne
    @JoinColumn(name = "porto_carico_id")
    private Porto portoCarico;

    @ManyToOne
    @JoinColumn(name = "porto_destinazione_id")
    private Porto portoDestinazione;

    private String tipologiaMerce;
    private double peso; // Peso in kg
    private int giorniFranchigia;

    // Costruttori
    public PolizzaDiCarico() {}

    public PolizzaDiCarico(Viaggio viaggio, Fornitore fornitore, Porto portoCarico, Porto portoDestinazione,
                           String tipologiaMerce, double peso, int giorniFranchigia) {
        this.viaggio = viaggio;
        this.fornitore = fornitore;
        this.portoCarico = portoCarico;
        this.portoDestinazione = portoDestinazione;
        this.tipologiaMerce = tipologiaMerce;
        this.peso = peso;
        this.giorniFranchigia = giorniFranchigia;
    }

    // Getter e Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Viaggio getViaggio() {
        return viaggio;
    }

    public void setViaggio(Viaggio viaggio) {
        this.viaggio = viaggio;
    }

    public Fornitore getFornitore() {
        return fornitore;
    }

    public void setFornitore(Fornitore fornitore) {
        this.fornitore = fornitore;
    }

    public Porto getPortoCarico() {
        return portoCarico;
    }

    public void setPortoCarico(Porto portoCarico) {
        this.portoCarico = portoCarico;
    }

    public Porto getPortoDestinazione() {
        return portoDestinazione;
    }

    public void setPortoDestinazione(Porto portoDestinazione) {
        this.portoDestinazione = portoDestinazione;
    }

    public String getTipologiaMerce() {
        return tipologiaMerce;
    }

    public void setTipologiaMerce(String tipologiaMerce) {
        this.tipologiaMerce = tipologiaMerce;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getGiorniFranchigia() {
        return giorniFranchigia;
    }

    public void setGiorniFranchigia(int giorniFranchigia) {
        this.giorniFranchigia = giorniFranchigia;
    }
}
