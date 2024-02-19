package co.edu.uniquindio.PrincipiosSOLID.model.model2;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.List;

public class EquipoFutbol {
    private String nombre;
    private String anoFundacion;
    private List<Delantero> listaDelanteros = new ArrayList<>();
    private List<Mediocampista> listaMediocampistas = new ArrayList<>();
    private List<Defensor> listaDefensores = new ArrayList<>();
    private List<Portero> listaPorteros = new ArrayList<>();
    private List<RecojeBolas> listaRecojeBolas = new ArrayList<>();

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

    public List<Delantero> getListaDelanteros() {
        return listaDelanteros;
    }

    public void setListaDelanteros(List<Delantero> listaDelanteros) {
        this.listaDelanteros = listaDelanteros;
    }

    public List<Mediocampista> getListaMediocampistas() {
        return listaMediocampistas;
    }

    public void setListaMediocampistas(List<Mediocampista> listaMediocampistas) {
        this.listaMediocampistas = listaMediocampistas;
    }

    public List<Defensor> getListaDefensores() {
        return listaDefensores;
    }

    public void setListaDefensores(List<Defensor> listaDefensores) {
        this.listaDefensores = listaDefensores;
    }

    public List<Portero> getListaPorteros() {
        return listaPorteros;
    }

    public void setListaPorteros(List<Portero> listaPorteros) {
        this.listaPorteros = listaPorteros;
    }

    public List<RecojeBolas> getListaRecojeBolas() {
        return listaRecojeBolas;
    }

    public void setListaRecojeBolas(List<RecojeBolas> listaRecojeBolas) {
        this.listaRecojeBolas = listaRecojeBolas;
    }
}
