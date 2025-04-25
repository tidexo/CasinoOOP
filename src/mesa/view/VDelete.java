package animal.view;
import java.util.List;
import java.util.Scanner;

import animal.domain.Mesa;

public class VDelete {
	private Scanner sc ;
    private List<Mesa> dataList;
    public VDelete(Scanner sc, List<Mesa> l){
        this.sc=sc;
        dataList = l;
    }
    public void remove(){
        System.out.println("ELIGE EL INDICE");
        for(int i = 0; i< dataList.size();i++){
            System.out.println(i + " " + dataList.get(i));
        }
        int posicion = sc.nextInt();
        if(posicion >= 0 && posicion < dataList.size()){
        	dataList.remove(posicion);
            System.out.println("Dato eliminado");
        }else{
            System.out.println("POSICION INVALIDA");
        }
    }
}
