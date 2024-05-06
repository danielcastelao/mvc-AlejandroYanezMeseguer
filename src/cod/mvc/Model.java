package cod.mvc;

import java.util.ArrayList;

public class Model {

    ArrayList<Coche> parkin = new ArrayList<Coche>();

    /**
     * Metodo crear coche que a partir de los siguientes parametros crea un coche y lo añade al parking
     * @param matricula
     * @param modelo
     * @param velocidad
     * @return coche
     */
    public Coche crearCoche(String matricula, String modelo, int velocidad){

        Coche coche = new Coche(matricula,modelo,velocidad);
        parkin.add(coche);
        return coche;

    }

    /**
     * Metodo getcoche que en base a la matricula devuelve el coche al que le corresponde o null si no existe
     * @param matricula
     * @return coche
     */
    public Coche getCoche(String matricula){

        for(Coche coche : parkin){

            if (coche.matricula.equals(matricula)){

                return coche;

            }
        }
        return null;
    }

    /**
     * Metodo cambiarVelocidad que cambia la velocidad al coche que corresponde a la matricula
     * @param matricula
     * @param velocidad
     * @return velocidad
     */
    public Integer cambiarVelocidad(String matricula, int velocidad){

        for(Coche coche : parkin){

            if(coche.getMatricula().equals(matricula)){

                coche.setVelocidad(velocidad);

            }
        }
        return velocidad;
    }

    /**
     * Metodo get velocidad que devuelve la velocidad del coche que corresponde a la matricula que se le pasa
     * @param matricula
     * @return coche.getVelocidad
     */
    public Integer getVelocidad(String matricula){

        for(Coche coche : parkin){

            if(coche.getMatricula().equals(matricula)){

                return coche.getVelocidad();

            }
        }

        return null;
    }

}
