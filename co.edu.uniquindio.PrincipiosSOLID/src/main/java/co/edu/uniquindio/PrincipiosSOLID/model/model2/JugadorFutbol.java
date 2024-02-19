package co.edu.uniquindio.PrincipiosSOLID.model.model2;

public abstract class JugadorFutbol implements IJugador {
    //como le aplico a la clase abstracta la interface
    //es como si se leaplicara a las clases con herencia
    private String nombre;
    private String posicion;

    public JugadorFutbol() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public abstract void entrenar();
}
