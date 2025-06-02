package CasinoOOP.src.empleado.view;

import java.util.Scanner;
import CasinoOOP.src.empleado.domain.Fijo;
import CasinoOOP.src.common.domain.repo.IRepo;

public class VCreateLimpiador {
    private Scanner sc ;
    private IRepo data;
    
    public VCreateLimpiador(Scanner sc, IRepo data){
        this.sc = sc;
        this.data = data;
    }
    public void create(){
        System.out.println("INTRODUCE NOMBRE: ");
        String nombre = sc.next();
        System.out.println("INTRODUCE SALARIO");
        float salario = sc.nextFloat(); 
        System.out.println("Horas?");
        int horas = sc.nextInt();
        Limpiador empleado = new Limpiador(nombre, salario, horas);
        data.create(empleado);
    }
}
