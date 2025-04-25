package animal.view;
import java.util.List;
import java.util.Scanner;

import animal.domain.BlackJack;
import animal.domain.Mesa;
import animal.domain.Poker;

public class VUpdate {
    private Scanner sc ;
    private List<Mesa> animales;
    public VUpdate(Scanner sc, List<Mesa> la){
        this.sc=sc;
        animales = la;
    }
    public void update(){
        System.out.println("ELIGE EL INDICE");
        for(int i = 0; i< animales.size();i++){
            System.out.println(i + " " + animales.get(i));
        }
        int posicion = sc.nextInt();
        if(posicion >= 0 && posicion < animales.size()){

            System.out.println("INTRODUCE NUEVO NOMBRE: ");
            String nombre = sc.next();
            System.out.println("INTRODUCE NUEVO EL PESO");
            float peso = sc.nextFloat();
            System.out.println("INTRODUCE NUEVO EDAD");
            int edad = sc.nextInt();
            System.out.println("INTRODUCE NUEVO ESPECIE");
            String especie = sc.next();
            System.out.println("INTRODUCE MAMIFERO (1) O AVE (otre tecla)");
            int tipo = sc.nextInt();
            Mesa animal;
            if(tipo == 1){
                System.out.println(" ¿ Pelo no (0) / si (1)?");
                boolean tienePelo = (sc.nextInt()!=0)?true : false;
                animal = new Poker(nombre, peso, edad, especie, tienePelo );
            }else{
                System.out.println(" ¿ vuela no (0) / si (1)?");
                boolean puedeVolar = (sc.nextInt()!=0)?true : false;
                animal = new BlackJack(nombre, peso, edad, especie, puedeVolar);
            }
            animales.set(posicion,animal);
            System.out.println("Mesa actualizado");
        }else {
            System.out.println("POSICION INVALIDA");
        }
    }
}
