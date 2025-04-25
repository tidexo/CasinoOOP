package empleado.view;
import java.util.List;
import java.util.Scanner;

import empleado.domain.Croupier;
import empleado.domain.Empleado;
import empleado.domain.Temporal;

public class VUpdate {
	private Scanner sc ;
	private List<Empleado> dataList;
	public VUpdate(Scanner sc, List<Empleado> l){
		this.sc=sc;
		dataList = l;
	}
	public void update(){
		System.out.println("ELIGE EL INDICE");
		for(int i = 0; i< dataList.size();i++){
			System.out.println(i + " " + dataList.get(i));
		}
		int posicion = sc.nextInt();
		if(posicion >= 0 && posicion < dataList.size()){
			System.out.println("INTRODUCE NOMBRE: ");
	        String nombre = sc.next();
	        System.out.println("INTRODUCE SALARIO");
	        float salario = sc.nextFloat();
	        System.out.println("INTRODUCE TEMPORAL (1) O FIJO (otre tecla)");
	        int tipo = sc.nextInt();  
	        Empleado empleado ;
	        if(tipo == 1){
	            System.out.println("Meses?");
	            int meses = sc.nextInt();
	            empleado = new Temporal(nombre, salario, meses);
	        }else{
	            empleado = new Croupier(nombre, salario);
	        }
			dataList.set(posicion,empleado);
			System.out.println("dato actualizado");
		}else {
			System.out.println("POSICION INVALIDA");
		}
	}
}
