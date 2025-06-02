package empleado.view;
import java.util.List;
import java.util.Scanner;

import blackjack.domain.BlackJack;
import mesa.domain.Mesa;
import poker.domain.Poker;

public class VUpdate {
    private Scanner sc;
    private List<Mesa> mesas;

    public VUpdate(Scanner sc, List<Mesa> mesas) {
        this.sc = sc;
        this.mesas = mesas;
    }

    public void update() {
        System.out.println("ELIGE EL ÍNDICE DE LA MESA A MODIFICAR:");
        for (int i = 0; i < mesas.size(); i++) {
            System.out.println(i + " - " + mesas.get(i));
        }

        int posicion = sc.nextInt();

        if (posicion >= 0 && posicion < mesas.size()) {
            Mesa mesa = mesas.get(posicion);

            System.out.println("NUEVO MÍNIMO DE JUGADORES (actual: " + mesa.getMinJugadores() + "):");
            int minJugadores = sc.nextInt();

            System.out.println("NUEVO MÁXIMO DE JUGADORES (actual: " + mesa.getMaxJugadores() + "):");
            int maxJugadores = sc.nextInt();

            System.out.println("¿LA MESA ESTÁ ACTIVA? (actual: " + mesa.isEstadoMesa() + ") (true/false):");
            boolean estadoMesa = sc.nextBoolean();

            
            mesa.setMinJugadores(minJugadores);
            mesa.setMaxJugadores(maxJugadores);
            mesa.setEstadoMesa(estadoMesa);

            System.out.println("✅ Mesa actualizada correctamente.");
        } else {
            System.out.println("❌ POSICIÓN INVÁLIDA.");
        }
    }
}
