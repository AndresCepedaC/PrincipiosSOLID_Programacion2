package co.edu.uniquindio.PrincipiosSOLID.model.model2;

public class Delantero extends JugadorFutbol implements IEntrenador{
    public Delantero() {
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenando tiros al arco... ");
    }

    @Override
    public void darInstrucciones() {
        System.out.println("Tienes que atacar al espacio... ");
    }
}
