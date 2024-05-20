package cod.mvc.controller;

import cod.mvc.model.Model;

public class Controller {

    static Model modelo = new Model();
    public static void logicaPrograma() {

        /**
         * instanciamos el observador
         */
        ObservarVelocidad observoVelocidad = new ObservarVelocidad();
        modelo.addObserver(observoVelocidad);

        /**
         * creamos coches
         */
        Model.crearCoche("1234-UH", "Seat", 140);
        Model.crearCoche("1235-UH", "Citroen", 90);
        Model.crearCoche("9876-AB", "Audi", 230);

        /**
         * le cambiamos la velocidad
         */
        modelo.cambiarVelocidad("9876-AB", 40);
    }
}