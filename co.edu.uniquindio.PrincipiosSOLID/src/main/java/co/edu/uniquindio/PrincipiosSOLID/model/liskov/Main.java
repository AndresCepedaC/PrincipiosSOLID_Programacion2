package co.edu.uniquindio.PrincipiosSOLID.model.liskov;
import co.edu.uniquindio.PrincipiosSOLID.model.liskov.Mouse;
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
            if (mouse instanceof Cybertel){
                System.out.println("cantidad de botones: " + mouse.cantidadBotonesCybertel());
            }
            if (mouse instanceof Kalley){
                System.out.println("cantidad de botones: " + mouse.cantidadBotonesKalley());
            }
            if (mouse instanceof Logitech){
                System.out.println("cantidad de botones: " + mouse.cantidadBotonesLogitech());
            }
            if (mouse instanceof Razer){
                System.out.println("cantidad de botones: " + mouse.cantidadBotonesRazer());
            }
            if (mouse instanceof RedDragon){
                System.out.println("cantidad de botones: " + mouse.cantidadBotonesRedDragon());
            }
            if (mouse instanceof XtrikeMe){
                System.out.println("cantidad de botones: " + mouse.cantidadBotonesXtrikeMe());
            }
        }
    }
}