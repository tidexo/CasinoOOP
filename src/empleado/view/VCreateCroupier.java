package empleado.view;
import java.util.List;
import java.util.Scanner;

import empleado.domain.Empleado;
import empleado.domain.Croupier;

public class VCreateCroupier {
    private Scanner sc ;
    private List<Empleado> dataList;
    public VCreateCroupier(Scanner sc, List<Empleado> l){
        this.sc=sc;
        dataList = l;
    }
    public void create(){
        System.out.println("INTRODUCE NOMBRE: ");
        String nombre = sc.next();
        System.out.println("INTRODUCE SALARIO");
        float salario = sc.nextFloat();
        Croupier empleado = new Croupier(nombre, salario);
        dataList.add(empleado);
    }
}
