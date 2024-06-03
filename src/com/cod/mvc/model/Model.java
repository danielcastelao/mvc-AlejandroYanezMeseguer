package com.cod.mvc.model;

import com.cod.mvc.controller.Observer;

import java.util.ArrayList;


/**
 * Vamos a usar la interface Observable
 * El Model será el encargado de notificar a los observadores
 */
public class Model implements Observable {
    // array de coches
    static ArrayList<Coche> parking = new ArrayList<>();

    // para los observadores
    private static final ArrayList<Observer> observers = new ArrayList<Observer>();

    // Singleton
    //instancia única de la clase
    private static Model instancia = null;

    // Constructor privado
    private Model() {}


    // Método para obtener la única instancia de la clase
    public static Model getInstancia() {
        if (instancia == null) {
            instancia = new Model();
        }
        return instancia;
    }

    // Métodos de la interfaz Observable
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Método para eliminar un observador
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    /**
     * Notifica a los observadores
     * Se ejecutara el método update() de cada observador
     * @param coche
     */
    @Override
    public void notifyObservers(Coche coche) {
        for (Observer observer : observers) {
            observer.update(coche);
        }
    }


    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula){
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public Coche getCoche(String matricula){
        Coche aux = null;
        // recorre el array buscando por matricula
        for (Coche e: parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     * Método que cambia la velocidad, por lo tanto
     * tendrá que avisar al controlador que ha cambiado
     *
     * @param matricula identificador del coche
     * @param v nueva velocidad
     */
    public void cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;

        // lo notificamos a todos los observadores
        notifyObservers(getCoche(matricula));

        // ya no retornamos la nueva velocidad
        // porque vamos a utilizar el patron observer
        // return getCoche(matricula).velocidad;
    }

    /**
     * Devuelve la velocidad según la matrícula
     * @param matricula identificador del coche
     * @return velocidad del coche actual
     */
    public Integer getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }

    /**
     * Sube la velocidad de un coche
     * @param matricula identificador del coche
     * @param incremento cantidad a subir
     */
    public void subirVelocidad(String matricula, Integer incremento) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(coche.getVelocidad() + incremento);
            notifyObservers(coche);
        }
    }
}
