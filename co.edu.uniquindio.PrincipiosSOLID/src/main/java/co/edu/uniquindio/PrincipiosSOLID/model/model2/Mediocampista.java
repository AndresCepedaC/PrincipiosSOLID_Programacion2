package co.edu.uniquindio.PrincipiosSOLID.model.model2;

public class Mediocampista extends JugadorFutbol implements IEntrenador{
    public Mediocampista() {
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenando pases al espacio...");
    }

    @Override
    public void darInstrucciones() {
        System.out.println("Tienes que dar mas pases al espacio...");
    }
}
