package animal.view;
import java.util.List;
import java.util.Scanner;

import animal.domain.Mesa;

public class VSearch {
    private Scanner sc ;
    private List<Mesa> animales;
    public VSearch(Scanner sc, List<Mesa> la){
        this.sc=sc;
        animales = la;
    }
    public void search(){
        System.out.println("INTRODUCE NOMBRE: ");
        String nombre = sc.next();
        Mesa aTemp=new Mesa(nombre,0,0,"");
        for (int i = 0; i < animales.size(); i++) {
            if(animales.get(i).equals(aTemp)){
                System.out.println("Encontrado en posición " +  i);
            }
        }
    }
}
