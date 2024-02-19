package co.edu.uniquindio.PrincipiosSOLID.model.model2;

public class Portero extends JugadorFutbol implements IEntrenador{
    public Portero() {
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenando reflejos y estirada... ");
    }

    @Override
    public void darInstrucciones() {
        System.out.println("En los mano a mano no debes de esperar que remate, tienes que salir a achicar... ");
    }
}
