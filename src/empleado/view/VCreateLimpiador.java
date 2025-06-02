package empleado.view;
import java.util.List;
import java.util.Scanner;

import empleado.domain.Empleado;
import empleado.domain.Limpiador;

public class VCreateLimpiador {
    private Scanner sc ;
    private IRepo data;
    
    public VCreateParcial(Scanner sc, IRepo data){
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
