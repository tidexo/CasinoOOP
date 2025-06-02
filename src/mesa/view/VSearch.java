package empleado.view;
import java.util.List;
import java.util.Scanner;

import mesa.domain.Mesa;

public class VSearch {
    private Scanner sc;
    private List<Mesa> mesas;

    public VSearch(Scanner sc, List<Mesa> mesas) {
        this.sc = sc;
        this.mesas = mesas;
    }

    public void VSearch() {
        System.out.print("INTRODUCE EL NOMBRE DE LA MESA: ");
        String nombre = sc.next();

        boolean encontrada = false;

        for (int i = 0; i < mesas.size(); i++) {
            Mesa m = mesas.get(i);
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Mesa encontrada en la posición " + i);
                System.out.println("Nombre: " + m.getNombre());
                System.out.println("Tipo: " + m.tipo());
                System.out.println("Min Jugadores: " + m.getMinJugadores());
                System.out.println("Max Jugadores: " + m.getMaxJugadores());
                System.out.println("Estado: " + (m.isActiva() ? "Activa" : "Inactiva"));
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontró ninguna mesa con ese nombre.");
        }
    }
}
