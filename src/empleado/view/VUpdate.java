package CasinoOOP.src.empleado.view;

import java.util.Scanner;
import CasinoOOP.src.empleado.domain.Empleado;
import CasinoOOP.src.empleado.domain.Fijo;
import CasinoOOP.src.empleado.domain.Temporal;
import CasinoOOP.src.common.domain.repo.IRepo;

public class VUpdate {
    private Scanner sc;
    private IRepo data;
    
    public VUpdate(Scanner sc, IRepo data){
        this.sc = sc;
        this.data = data;
    }
    
    public void update(){
        System.out.println("ELIGE EL INDICE");
        var empleados = data.getAll();
        for(int i = 0; i < empleados.size(); i++){
            System.out.println(i + " " + empleados.get(i));
        }
        int posicion = sc.nextInt();
        if(posicion >= 0 && posicion < empleados.size()){
            System.out.println("INTRODUCE NOMBRE: ");
            String nombre = sc.next();
            System.out.println("INTRODUCE SALARIO");
            float salario = sc.nextFloat();
            System.out.println("INTRODUCE Seguridad (1) O Croupier (2) o Limpiador (otra tecla)");
            int tipo = sc.nextInt();  
            Empleado empleado;
            if(tipo == 1){
                System.out.println("Meses?");
                int meses = sc.nextInt();
                empleado = new Seguridad(nombre, salario, meses);
            }else if (tipo ==2){
                empleado = new Croupier(nombre, salario);
            }else{
		    System.out.println("Horas?");
                    int horas = sc.nextInt();
		    empleado = new Limpiador(nombre, salario, horas);}
            data.update(posicion, empleado);
            System.out.println("dato actualizado");
        }else{
            System.out.println("POSICION INVALIDA");
        }
    }
}
