package empleado.view;
import java.util.List;
import java.util.Scanner;

import empleado.domain.Empleado;
import empleado.domain.Seguridad;

public class VCreateSeguridad {
    private Scanner sc ;
    private IRepo data;
    public VCreateSeguridad(Scanner sc, IRepo data){
        this.sc = sc;
        this.data = data;
    }
    public void create(){
        System.out.println("INTRODUCE NOMBRE: ");
        String nombre = sc.next();
        System.out.println("INTRODUCE SALARIO");
        float salario = sc.nextFloat();
        System.out.println("Meses?");
        int meses = sc.nextInt();
        Seguridad empleado = new Seguridad(nombre, salario, meses);
        dataList.add(empleado);
    }
}
