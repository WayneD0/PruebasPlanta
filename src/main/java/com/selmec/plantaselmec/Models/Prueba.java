package com.selmec.plantaselmec.Models;
// Generated Oct 30, 2014 5:43:43 PM by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Prueba generated by hbm2java
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "prueba", catalog = "casetapruebas")
public class Prueba extends Pruebabase implements java.io.Serializable {

    private Ensamble ensamble;
    private int tipo;
    private EstadoPrueba estatus;
    private Integer aprueba;
    private Date dtAprueba;
    private Integer apruebaSupervisor;
    private Date dtApruebaSupervisor;
    private Set cargasubitas = new HashSet(0);

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EnsambleID", nullable = false)
    public Ensamble getEnsamble() {
        return this.ensamble;
    }

    public void setEnsamble(Ensamble ensamble) {
        this.ensamble = ensamble;
    }

    @Column(name = "Tipo", nullable = false)
    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Column(name = "Estatus", nullable = false)
    public EstadoPrueba getEstatus() {
        return this.estatus;
    }

    public void setEstatus(EstadoPrueba estatus) {
        this.estatus = estatus;
    }

    @Column(name = "Aprueba")
    public Integer getAprueba() {
        return this.aprueba;
    }

    public void setAprueba(Integer aprueba) {
        this.aprueba = aprueba;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dtAprueba", length = 19)
    public Date getDtAprueba() {
        return this.dtAprueba;
    }

    public void setDtAprueba(Date dtAprueba) {
        this.dtAprueba = dtAprueba;
    }

    @Column(name = "ApruebaSupervisor")
    public Integer getApruebaSupervisor() {
        return this.apruebaSupervisor;
    }

    public void setApruebaSupervisor(Integer apruebaSupervisor) {
        this.apruebaSupervisor = apruebaSupervisor;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dtApruebaSupervisor", length = 19)
    public Date getDtApruebaSupervisor() {
        return this.dtApruebaSupervisor;
    }

    public void setDtApruebaSupervisor(Date dtApruebaSupervisor) {
        this.dtApruebaSupervisor = dtApruebaSupervisor;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "prueba")
    public Set<Cargasubita> getCargasubitas() {
        return this.cargasubitas;
    }

    public void setCargasubitas(Set<Cargasubita> cargasubitas) {
        this.cargasubitas = cargasubitas;
    }

}
