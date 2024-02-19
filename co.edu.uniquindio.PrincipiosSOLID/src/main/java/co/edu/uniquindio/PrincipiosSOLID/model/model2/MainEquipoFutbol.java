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

        System.out.println(" responsabilidad unica \n");
        //principio responsabilidad unica
        RecojeBolas recojeBolas = new RecojeBolas();
        recojeBolas.recogerBalon();
        System.out.println("\n Liskov \n");

        //principio de liskov
        imprimirNombreJugadores(equipoFutbol.getListaJugadoresDeFutbol());
        System.out.println("\n abierto/cerrado \n");

        //principio abierto cerrado
        imprimirEntrenamientoJugadores(equipoFutbol.getListaJugadoresDeFutbol());
        System.out.println("\n  invercion de dependencias \n");

        //principio de invercion de dependencias
        imprimirPosicionesJugador(equipoFutbol.getListaJugadoresDeFutbol());
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
    //metodo para principio de invercion de dependencias
    public static void imprimirPosicionesJugador(List<JugadorFutbol> listaJugadores){
        for (JugadorFutbol jugadorFutbol : listaJugadores){
            jugadorFutbol.Jugar();
        }
    }
}
