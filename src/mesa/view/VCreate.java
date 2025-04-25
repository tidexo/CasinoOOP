package animal.view;
import java.util.List;
import java.util.Scanner;

import animal.domain.Mesa;
import animal.domain.BlackJack;
import animal.domain.Poker;

public class VCreate {
    private Scanner sc ;
    private List<Mesa> mesa;
    public VCreate(Scanner sc, List<Mesa> la){
        this.sc=sc;
        mesa = la;
    }
    public void create(){
        System.out.println("INTRODUCE NOMBRE: ");
        String nombre = sc.next();
        System.out.println("INTRODUCE EL PESO");
        float peso = sc.nextFloat();
        System.out.println("INTRODUCE EDAD");
        int edad = sc.nextInt();
        System.out.println("INTRODUCE ESPECIE");
        String especie = sc.next();

        System.out.println("INTRODUCE POKER (1) O BLACKJACK (2) O GENERICO(OTRA TECLA)");
        int tipo = sc.nextInt();  
        Mesa animal ;

        if(tipo == 1){
            System.out.println(" ¿ Pelo no (0) / si (1)?");
            boolean tienePelo = (sc.nextInt()!=0)?true : false;
            animal = new Poker(nombre, peso, edad, especie, tienePelo );
        } else if (tipo == 2) {
            System.out.println(" ¿ vuela no (0) / si (1)?");
            boolean puedeVolar = (sc.nextInt()!=0)?true : false;
            animal = new BlackJack(nombre, peso, edad, especie, puedeVolar);
        } else{
            animal = new Mesa(nombre, peso, edad, especie);
        }
        animal.add(animal);
    }
}
