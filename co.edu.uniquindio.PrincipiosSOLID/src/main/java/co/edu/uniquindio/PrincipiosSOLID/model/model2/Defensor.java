package co.edu.uniquindio.PrincipiosSOLID.model.model2;

public class Defensor extends JugadorFutbol implements IEntrenador{

    public Defensor() {
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenando cabesaso... ");
    }

    @Override
    public void darInstrucciones() {
        System.out.println("Pasa el jugador o el balon, pero nunca los dos...");
    }
}
