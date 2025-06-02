package CasinoOOP.src.empleado.view;

import java.util.Scanner;
import CasinoOOP.src.common.domain.repo.IRepo;
import CasinoOOP.src.common.FileUtil;

public class VPrincipal {
    private Scanner sc;
    private IRepo data;
    
    public VPrincipal(){
        sc = new Scanner(System.in);
    }
    
    public void menuInicial(){
        FileUtil fileUtil = new FileUtil("data\\empleados.bin");
        data = fileUtil.deserialize();
        
        int opcion = -1;
        do {
            try {
                System.out.println("1 CREAR");
                System.out.println("2 VIZUALIZAR");
                System.out.println("3 ACTUALIZAR");
                System.out.println("4 ELIMINAR");
                System.out.println("5 BUSCAR");
                System.out.println("6 GUARDAR");
                System.out.println("0 SALIR");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        VCreate vc = new VCreate(sc, data);
                        vc.create();
                        break;
                    case 2:
                        VRead vr = new VRead(sc, data);
                        vr.read();
                        break;
                    case 3:
                        VUpdate vu = new VUpdate(sc, data);
                        vu.update();
                        break;
                    case 4:
                        VDelete vd = new VDelete(sc, data);
                        vd.remove();
                        break;
                    case 5:
                        VSearch vs = new VSearch(sc, data);
                        vs.search();
                        break;
                    case 6:
                        if(!fileUtil.serialize(data))
                            System.out.println("error al guardar");
                        break;
                    default:
                        break;
                }
            } catch(Exception e) {
                System.out.println("se ha producido un error");
                sc = new Scanner(System.in);
            }
        } while (opcion != 0);
    }
}
