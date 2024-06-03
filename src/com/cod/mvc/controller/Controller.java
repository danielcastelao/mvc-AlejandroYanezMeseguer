package com.cod.mvc.controller;

import com.cod.mvc.model.Model;

public class Controller{

    // Instancia del modelo
    Model model = Model.getInstancia();

    /**
     * Constructor. Inicializamos el controller
     * Creamos los observadores que necesitamos
     * @param miModel
     */
    public Controller(Model miModel){

        // instanciamos al observador de la velocidad
        ObserverVelocidad observoVelocidad = new ObserverVelocidad();
        miModel.addObserver(observoVelocidad);

        // instanciamos un segundo observador para el limite de velocidad
        ObserverLimite observoLimite = new ObserverLimite();
        miModel.addObserver(observoLimite);

        // instanciamos un tercer observador para subir la velocidad
        ObserverSubirVelocidad observerSubirVelocidad= new ObserverSubirVelocidad(miModel);
        miModel.addObserver(observerSubirVelocidad);

        // instanciamos un tercer observador para subir la velocidad
        ObserverBajarVelocidad observerBajarVelocidad= new ObserverBajarVelocidad(miModel);
        miModel.addObserver(observerBajarVelocidad);
    }

    /**
     * Crea un coche
     * @param nombre del coche
     * @param matricula del coche
     */
    public void crearCoche(String nombre, String matricula){
        model.crearCoche(nombre, matricula);
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula del coche
     * @param velocidad nueva
     */
    public void cambiarVelocidad(String matricula, Integer velocidad){
        model.cambiarVelocidad(matricula, velocidad);
    }

    /**
     * Sube la velocidad de un coche
     * @param matricula del coche
     * @param v velocidad a subir
     */
    public void subirVelocidad(String matricula, Integer v){
        model.subirVelocidad(matricula, v);
    }

    /**
     * baja la velocidad de un coche
     * @param matricula del coche
     * @param v velocidad a subir
     */
    public void bajarVelocidad(String matricula, Integer v){
        model.bajarVelocidad(matricula, v);
    }

}