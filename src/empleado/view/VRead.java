package empleado.view;
import java.util.List;
import java.util.Scanner;

import empleado.domain.Empleado;

public class VRead {
    private Scanner sc ;
    private List<Empleado> dataList;
    public VRead(Scanner sc, List<Empleado> la){
        this.sc=sc;
        dataList = la;
    }
    public void read(){
        for(int i = 0; i< dataList.size();i++){
            System.out.println(i + "\t" + dataList.get(i));
        }
    }
}
