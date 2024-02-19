package co.edu.uniquindio.PrincipiosSOLID.model.model2;

import java.util.List;

public class MainEquipoFutbol {
    public static void main(String[] args) {
        // instanciamos las clases
        EquipoFutbol equipoFutbol = new EquipoFutbol();
        Portero portero = new Portero();portero.setNombre("Roger");portero.setPosicion("portero");
        Defensor defensor = new Defensor();defensor.setNombre("Andres");defensor.setPosicion("sagero central");
        Mediocampista mediocampista = new Mediocampista();mediocampista.setNombre("Felipe");mediocampista.setPosicion("Mediocampista ofensivo");
        Delantero delantero = new Delantero();delantero.setNombre("Jorge");delantero.setPosicion("Extremo izquierdo");
        
        //agregamos a la lista
        equipoFutbol.getListaJugadoresDeFutbol().add(portero);
        equipoFutbol.getListaJugadoresDeFutbol().add(defensor);
        equipoFutbol.getListaJugadoresDeFutbol().add(mediocampista);
        equipoFutbol.getListaJugadoresDeFutbol().add(delantero);

        //principio responsabilidad unica
        RecojeBolas recojeBolas = new RecojeBolas();
        recojeBolas.recogerBalon();

        //principio de liskov
        imprimirNombreJugadores(equipoFutbol.getListaJugadoresDeFutbol());

        //principio abierto cerrado
        imprimirEntrenamientoJugadores(equipoFutbol.getListaJugadoresDeFutbol());

    }
    //metodo para ejemplo de principio de liskov
    public static void imprimirNombreJugadores(List<JugadorFutbol> listaJugadoresFutbol){
        for (JugadorFutbol jugadorFutbol : listaJugadoresFutbol){
            System.out.println("El nombre del jugador es: " + jugadorFutbol.getNombre());
        }
    }
    public static void imprimirEntrenamientoJugadores(List<JugadorFutbol> listaJugadoresFutbol){
        for (JugadorFutbol jugadorFutbol : listaJugadoresFutbol){
            jugadorFutbol.entrenar();
        }
    }

}
