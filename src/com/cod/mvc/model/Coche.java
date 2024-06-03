package com.cod.mvc.model;

public class Coche {
    public String matricula;
    public String modelo;
    public Integer velocidad;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }

    /**
     * getter de velocidad
     * @return velocidad
     */
    public Integer getVelocidad() {
        return velocidad;
    }

    /**
     * setter de velocidad
     * @param velocidad
     */
    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
}
