package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import com.cod.mvc.view.View;

public class ObserverBajarVelocidad implements Observer{

    //creamos instancia de model
    Model model = Model.getInstancia();
    private static final int BAJAR = 10;

    /**
     * Este es el observador de subir velocidad
     * @param model
     */
    public ObserverBajarVelocidad(Model model) {
        this.model = model;
    }

    /**
     * update de subir velocidad
     * @param arg Coche al que se le actualizó la velocidad
     */
    @Override
    public void update(Coche arg) {
        View.muestraVelocidad(arg.matricula, arg.velocidad - BAJAR);
    }


}
