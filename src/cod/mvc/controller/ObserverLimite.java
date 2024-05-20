package cod.mvc.controller;

import cod.mvc.model.Coche;

public class ObserverLimite {

    final static int LIMITE = 120;

    public void update(Coche coche) {
        if (coche.getVelocidad() > LIMITE) {
            System.out.println("El coche con matricula " + coche.getMatricula() + " ha superado el limite de velocidad");
        }
    }
}
