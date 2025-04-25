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
        this.mesa = mesas;
    }
    public void create(){
        System.out.println("INTRODUCE MÍNIMO DE JUGADORES: ");
        String minJugadores = sc.next();
        System.out.println("INTRODUCE MAXIMO DE JUGADORES");
        int maxJugadores = sc.nextInt();
        System.out.println("¿LA MESA ESTÁ ACTIVA? (1 para Sí / 0 para No):");
        boolean estadoMesa =  (sc.nextInt() == 1);

        System.out.println("INTRODUCE POKER (1) O BLACKJACK (2) O GENERICO(OTRA TECLA)");
        int tipo = sc.nextInt();  
        Mesa mesa ;

        if (tipo == 1) {
            System.out.println("¿TIENE CRUPIER PROFESIONAL? (1 para Sí / 0 para No): ");
            boolean tieneCrupier = (sc.nextInt() == 1);
            mesa = new Poker(nombre, minJugadores, maxJugadores, estado, tieneCrupier);
        } else if (tipo == 2) {
            System.out.println("¿PERMITE APUESTAS LATERALES? (1 para Sí / 0 para No): ");
            boolean apuestasLaterales = (sc.nextInt() == 1);
            mesa = new BlackJack(nombre, minJugadores, maxJugadores, estado, apuestasLaterales);
        } else {
            mesa = new Mesa(nombre, minJugadores, maxJugadores, estado);
        }

        mesas.add(mesa);
        System.out.println("Mesa creada correctamente.");
    }
}
