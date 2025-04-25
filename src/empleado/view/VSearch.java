package empleado.view;
import java.util.List;
import java.util.Scanner;

import empleado.domain.Empleado;

public class VSearch {
    private Scanner sc ;
    private List<Empleado> dataList;
    public VSearch(Scanner sc, List<Empleado> l){
        this.sc=sc;
        dataList = l;
    }
    public void search(){
        System.out.println("INTRODUCE NOMBRE: ");
        String nombre = sc.next();
        Empleado temp=new Empleado(nombre,0);
        for (int i = 0; i < dataList.size(); i++) {
            if(dataList.get(i).equals(temp)){
                System.out.println("Encontrado en posición " +  i);
            }
        }
    }
}
