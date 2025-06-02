package CasinoOOP.src.empleado.view;

import java.util.Scanner;
import CasinoOOP.src.common.domain.repo.IRepo;

public class VDelete {
    private Scanner sc;
    private IRepo data;
    
    public VDelete(Scanner sc, IRepo data){
        this.sc = sc;
        this.data = data;
    }
    
    public void remove(){
        System.out.println("ELIGE EL INDICE");
        var empleados = data.getAll();
        for(int i = 0; i < empleados.size(); i++){
            System.out.println(i + " " + empleados.get(i));
        }
        int posicion = sc.nextInt();
        if(posicion >= 0 && posicion < empleados.size()){
            data.delete(posicion);
            System.out.println("Dato eliminado");
        }else{
            System.out.println("POSICION INVALIDA");
        }
    }
}
