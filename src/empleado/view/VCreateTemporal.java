package empleado.view;
import java.util.List;
import java.util.Scanner;

import empleado.domain.Empleado;
import empleado.domain.Temporal;

public class VCreateTemporal {
    private Scanner sc ;
    private List<Empleado> dataList;
    public VCreateTemporal(Scanner sc, List<Empleado> l){
        this.sc=sc;
        dataList = l;
    }
    public void create(){
        System.out.println("INTRODUCE NOMBRE: ");
        String nombre = sc.next();
        System.out.println("INTRODUCE SALARIO");
        float salario = sc.nextFloat();
        System.out.println("Meses?");
        int meses = sc.nextInt();
        Temporal empleado = new Temporal(nombre, salario, meses);
        dataList.add(empleado);
    }
}
