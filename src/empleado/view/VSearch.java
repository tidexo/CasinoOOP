package CasinoOOP.src.empleado.view;

import java.util.Scanner;
import CasinoOOP.src.empleado.domain.Empleado;
import CasinoOOP.src.common.domain.repo.IRepo;

public class VSearch {
    private Scanner sc;
    private IRepo data;
    
    public VSearch(Scanner sc, IRepo data){
        this.sc = sc;
        this.data = data;
    }
    
    public void search(){
        System.out.println("INTRODUCE NOMBRE: ");
        String nombre = sc.next();
        Empleado temp = new Empleado(nombre, 0);
        var empleados = data.getAll();
        for(int i = 0; i < empleados.size(); i++){
            if(empleados.get(i).equals(temp)){
                System.out.println("Encontrado en posición " + i);
            }
        }
    }
}
