package animal.view;
import java.util.List;
import java.util.Scanner;

import animal.domain.Mesa;

public class VRead {
    private Scanner sc ;
    private List<Mesa> dataList;
    public VRead(Scanner sc, List<Mesa> la){
        this.sc=sc;
        dataList = la;
    }
    public void read(){
        for(int i = 0; i< dataList.size();i++){
            System.out.println(i + "\t" + dataList.get(i));
            System.out.println("\tTipo: "+ dataList.get(i).tipo());
        }
    }
}