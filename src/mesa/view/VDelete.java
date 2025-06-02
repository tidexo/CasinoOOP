package empleado.view;
import java.util.List;
import java.util.Scanner;

import empleado.domain.Empleado;

public class VDelete {
    private Scanner sc;
    private List<Mesa> mesas;

    public VDelete(Scanner sc, List<Mesa> mesas) {
        this.sc = sc;
        this.mesas = mesas;
    }

    public void VDelete() {
        if (mesas.isEmpty()) {
            System.out.println("No hay mesas disponibles para eliminar.");
            return;
        }

        System.out.println("LISTADO DE MESAS:");
        for (int i = 0; i < mesas.size(); i++) {
            System.out.println(i + " - " + mesas.get(i).toString());
        }

        System.out.println("INTRODUCE EL ÍNDICE DE LA MESA A ELIMINAR:");
        int posicion = sc.nextInt();

        if (posicion >= 0 && posicion < mesas.size()) {
            mesas.remove(posicion);
            System.out.println("Mesa eliminada correctamente.");
        } else {
            System.out.println("ÍNDICE INVÁLIDO. No se pudo eliminar.");
        }
    }
}
