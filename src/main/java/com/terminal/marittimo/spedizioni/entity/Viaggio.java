package com.terminal.marittimo.spedizioni.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Viaggio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nave_id")
    private Nave nave;

    @ManyToOne
    @JoinColumn(name = "porto_partenza_id")
    private Porto portoPartenza;

    @ManyToOne
    @JoinColumn(name = "porto_arrivo_id")
    private Porto portoArrivo;

    private LocalDate dataPartenza;
    private LocalDate dataArrivo;

    // Costruttori
    public Viaggio() {}

    public Viaggio(Nave nave, Porto portoPartenza, Porto portoArrivo, LocalDate dataPartenza, LocalDate dataArrivo) {
        this.nave = nave;
        this.portoPartenza = portoPartenza;
        this.portoArrivo = portoArrivo;
        this.dataPartenza = dataPartenza;
        this.dataArrivo = dataArrivo;
    }

    // Getter e Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Nave getNave() {
        return nave;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

    public Porto getPortoPartenza() {
        return portoPartenza;
    }

    public void setPortoPartenza(Porto portoPartenza) {
        this.portoPartenza = portoPartenza;
    }

    public Porto getPortoArrivo() {
        return portoArrivo;
    }

    public void setPortoArrivo(Porto portoArrivo) {
        this.portoArrivo = portoArrivo;
    }

    public LocalDate getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(LocalDate dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public LocalDate getDataArrivo() {
        return dataArrivo;
    }

    public void setDataArrivo(LocalDate dataArrivo) {
        this.dataArrivo = dataArrivo;
    }
}
