import java.util.Scanner;
import CasinoOOP.src.common.domain.repo.IRepo;

public class VRead {
    private Scanner sc;
    private IRepo data;
    
    public VRead(Scanner sc, IRepo data){
        this.sc = sc;
        this.data = data;
    }
    
    public void read(){
        var empleados = data.getAll();
        for(int i = 0; i < empleados.size(); i++){
            System.out.println(i + "\t" + empleados.get(i));
        }
    }
}
