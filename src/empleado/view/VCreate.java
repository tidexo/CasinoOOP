package empleado.view;
import java.util.List;
import java.util.Scanner;

import empleado.domain.Empleado;

public class VCreate {
    private Scanner sc ;
    private List<Empleado> dataList;
    public VCreate(Scanner sc, List<Empleado> l){
        this.sc=sc;
        dataList = l;
    }
    public void create(){
        System.out.println("Tipo de empleado: Croupier (1), Limpiador (2), Temporal (otra tecla)");
        int tipo = sc.nextInt();  
        if(tipo == 1){
            VCreateFijo vc=new VCreateFijo(sc, dataList);
            vc.create();
        }else if(tipo == 2) {
        	VCreateParcial vc=new VCreateParcial(sc, dataList);
        	vc.create();
        }else{
        	VCreateTemporal vc=new VCreateTemporal(sc, dataList);
        	vc.create();
        } 
    }
}
