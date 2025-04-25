package animal.view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import animal.domain.Mesa;
import common.FileUtil;

public class VPrincipal {
    private Scanner sc ;
    private List<Mesa> animales;
    public VPrincipal(){
        sc = new Scanner(System.in);
        animales = new ArrayList<>();
    }
    public void menuInicial(){
        FileUtil fileUtil = new FileUtil("data\\animales.bin");
        animales = fileUtil.deserialize();
        animales =(animales == null)? new ArrayList<>() : animales;
        int opcion ;
        do {          
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
                	VCreate vc=new VCreate(sc,animales);
                    vc.create();
                    break;
                case 2:
                	VRead vr=new VRead(sc,animales);
                    vr.read();
                    break;
                case 3:
                	VUpdate vu=new VUpdate(sc,animales);
                    vu.update();
                    break;
                case 4:
                	VDelete vd=new VDelete(sc,animales);
                    vd.remove();
                    break;
                case 5:
                	VSearch vs=new VSearch(sc,animales);
                    vs.search();
                    break;
                case 6:
                    if(!fileUtil.serialize(animales))
                    	System.out.println("error al guardar");
                    break;
                default:
                    break;
            }
        } while (opcion != 0);     
    }
}
