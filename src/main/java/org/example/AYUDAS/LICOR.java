package org.example.AYUDAS;

import java.time.LocalDate;

public class LICOR {
   private String TIPO;
   private Integer VALOR;
   private LocalDate CADUCIDAD;
   private Double gradoDealchool;
   private LocalDate FABRICACION;

    public LICOR() {
    }

    public LICOR(String TIPO, Integer VALOR, LocalDate CADUCIDAD, Double gradoDealchool, LocalDate FABRICACION) {
        this.TIPO = TIPO;
        this.VALOR = VALOR;
        this.CADUCIDAD = CADUCIDAD;
        this.gradoDealchool = gradoDealchool;
        this.FABRICACION = FABRICACION;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public Integer getVALOR() {
        return VALOR;
    }

    public void setVALOR(Integer VALOR) {
        this.VALOR = VALOR;
    }

    public LocalDate getCADUCIDAD() {
        return CADUCIDAD;
    }

    public void setCADUCIDAD(LocalDate CADUCIDAD) {
        this.CADUCIDAD = CADUCIDAD;
    }

    public Double getGradoDealchool() {
        return gradoDealchool;
    }

    public void setGradoDealchool(Double gradoDealchool) {
        this.gradoDealchool = gradoDealchool;
    }

    public LocalDate getFABRICACION() {
        return FABRICACION;
    }

    public void setFABRICACION(LocalDate FABRICACION) {
        this.FABRICACION = FABRICACION;
    }
}

