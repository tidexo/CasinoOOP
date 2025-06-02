package empleado.view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mesa.domain.Mesa;
import common.FileUtil;

public class VPrincipal {
    private Scanner sc;
    private List<Mesa> mesas;

    public VPrincipal() {
        sc = new Scanner(System.in);
        mesas = new ArrayList<>();
    }

    public void menuInicial() {
        FileUtil fileUtil = new FileUtil("data/mesas.bin");
        mesas = fileUtil.deserialize();
        mesas = (mesas == null) ? new ArrayList<>() : mesas;

        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL CASINO ---");
            System.out.println("1. CREAR MESA");
            System.out.println("2. VISUALIZAR MESAS");
            System.out.println("3. ACTUALIZAR MESA");
            System.out.println("4. ELIMINAR MESA");
            System.out.println("5. BUSCAR MESA");
            System.out.println("6. GUARDAR DATOS");
            System.out.println("0. SALIR");
            System.out.print("Selecciona una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    VCreate vc = new VCreate(sc, mesas);
                    vc.create();
                    break;
                case 2:
                    VRead vr = new VRead(sc, mesas);
                    vr.read();
                    break;
                case 3:
                    VUpdate vu = new VUpdate(sc, mesas);
                    vu.update();
                    break;
                case 4:
                    vDelete vd = new vDelete(sc, mesas);  // clase con minúscula
                    vd.remove();
                    break;
                case 5:
                    VSearch vs = new VSearch(sc, mesas);
                    vs.search();
                    break;
                case 6:
                    if (!fileUtil.serialize(mesas))
                        System.out.println("Error al guardar.");
                    else
                        System.out.println("Datos guardados con éxito.");
                    break;
                case 0:
                    System.out.println("¡Gracias por usar el sistema de gestión de mesas!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }
}
