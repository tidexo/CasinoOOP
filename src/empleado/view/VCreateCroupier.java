package CasinoOOP.src.empleado.view;

import java.util.Scanner;
import CasinoOOP.src.empleado.domain.Fijo;
import CasinoOOP.src.common.domain.repo.IRepo;

public class VCreateCroupier {
    private Scanner sc ;
    private IRepo data;
    
    public VCreateCroupier(Scanner sc, IRepo data){
        this.sc = sc;
        this.data = data;
    }
    
    public void create(){
        System.out.println("INTRODUCE NOMBRE: ");
        String nombre = sc.next();
        System.out.println("INTRODUCE SALARIO");
        float salario = sc.nextFloat();
        Croupier empleado = new Croupier(nombre, salario);
        data.create(empleado);
    }
}
