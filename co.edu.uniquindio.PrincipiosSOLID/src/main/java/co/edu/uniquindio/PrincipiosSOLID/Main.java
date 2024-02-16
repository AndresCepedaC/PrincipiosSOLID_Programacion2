package co.edu.uniquindio.PrincipiosSOLID;

import co.edu.uniquindio.PrincipiosSOLID.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mouse> listaMouses = new ArrayList<>();
        listaMouses.add(new Cybertel());
        listaMouses.add(new Razer());
        listaMouses.add(new Kalley());
        listaMouses.add(new Logitech());
        listaMouses.add(new RedDragon());
        listaMouses.add(new XtrikeMe());
        imprimirMouses(listaMouses);
    }
    public static void imprimirMouses(List<Mouse> listaMouses ){
        for (Mouse mouse : listaMouses){
            System.out.println("El DPI maximo es: " + mouse.DPImaximo());
        }
    }
}