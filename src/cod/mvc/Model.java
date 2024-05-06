package cod.mvc;

import java.util.ArrayList;

public class Model {

    ArrayList<Coche> parkin = new ArrayList<Coche>();

    public Coche crearCoche(String matricula, String modelo, int velocidad){

        Coche coche = new Coche(matricula,modelo,velocidad);
        parkin.add(coche);
        return coche;

    }

    public Coche getCoche(String matricula){

        for(Coche coche : parkin){

            if (coche.matricula.equals(matricula)){

                return coche;

            }
        }
        return null;
    }



}
