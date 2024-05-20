package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.view.View;

public class ObservarVelocidad implements Observer{
    public void update(Coche arg) {
        System.out.println("La velocidad ha sido alterada: " + arg.getVelocidad());
        /**
         * le decimos a la vista que muestre la velocidad
         */
        View.muestraVelocidad(arg.getMatricula(), arg.getVelocidad());


    }
}
