package co.edu.uniquindio.PrincipiosSOLID.model.model2;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.List;

public class EquipoFutbol {
    private String nombre;
    private String anoFundacion;
    private List<JugadorFutbol> listaJugadoresDeFutbol = new ArrayList<>();

    public EquipoFutbol() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnoFundacion() {
        return anoFundacion;
    }

    public void setAnoFundacion(String anoFundacion) {
        this.anoFundacion = anoFundacion;
    }

    public List<JugadorFutbol> getListaJugadoresDeFutbol() {
        return listaJugadoresDeFutbol;
    }

    public void setListaJugadoresDeFutbol(List<JugadorFutbol> listaJugadoresDeFutbol) {
        this.listaJugadoresDeFutbol = listaJugadoresDeFutbol;
    }
}
