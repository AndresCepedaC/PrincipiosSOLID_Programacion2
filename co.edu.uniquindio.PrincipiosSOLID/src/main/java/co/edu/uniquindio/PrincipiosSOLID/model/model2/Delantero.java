package co.edu.uniquindio.PrincipiosSOLID.model.model2;

public class Delantero extends JugadorFutbol implements IEntrenador, INutricion{
    //Esta clase tendria implementados IEntrenador, IJugador y INutricion
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

    @Override
    public void hacerDieta() {
        System.out.println("Haciendo dieta sugerida");
    }

    @Override
    public void Jugar() {
        System.out.println("Jugando como delantero");
    }
}
