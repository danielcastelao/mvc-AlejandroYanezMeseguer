package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.view.View;

public class ObservarVelocidad implements Observer{
    public void update(Coche arg) {
        System.out.println("La velocidad ha sido alterada: " + arg.getVelocidad());
        View.muestraVelocidad(arg.getMatricula(), arg.getVelocidad());


    }
}
