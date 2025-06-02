package CasinoOOP.src.empleado.view;

import java.util.Scanner;
import CasinoOOP.src.empleado.domain.Empleado;
import CasinoOOP.src.empleado.domain.Fijo;
import CasinoOOP.src.empleado.domain.Temporal;
import CasinoOOP.src.common.domain.repo.IRepo;

public class VCreate {
    private Scanner sc;
    private IRepo data;
    
    public VCreate(Scanner sc, IRepo data){
        this.sc = sc;
        this.data = data;
    }
    
    public void create(){
        System.out.println("Tipo de empleado: Fijo (1), Limpiador (2), Temporal (otra tecla)");
        int tipo = sc.nextInt();  
        if(tipo == 1){
            VCreateFijo vc = new VCreateFijo(sc, data);
            vc.create();
        }else if(tipo == 2){
            VCreateParcial vc = new VCreateParcial(sc, data);
            vc.create();
        }else{
            VCreateTemporal vc = new VCreateTemporal(sc, data);
            vc.create();
        } 
    }
}
