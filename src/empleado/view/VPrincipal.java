package empleado.view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import empleado.domain.Empleado;
import common.FileUtil;

public class VPrincipal {
	private Scanner sc ;
	private List<Empleado> empleados;
	public VPrincipal(){
		sc = new Scanner(System.in);
		empleados = new ArrayList<>();
	}
	public void menuInicial(){
		FileUtil fileUtil = new FileUtil("data\\empleados.bin");
		empleados = fileUtil.deserialize();
		empleados =(empleados == null)? new ArrayList<>() : empleados;
		int opcion =-1;
		do {
			try {
				System.out.println("1 CREAR");
				System.out.println("2 VIZUALIZAR");
				System.out.println("3 ACTUALIZAR");
				System.out.println("4 ELIMINAR");
				System.out.println("5 BUSCAR");
				System.out.println("6 GUARDAR");
				System.out.println("0 SALIR");
				opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					VCreate vc=new VCreate(sc,empleados);
					vc.create();
					break;
				case 2:
					VRead vr=new VRead(sc,empleados);
					vr.read();
					break;
				case 3:
					VUpdate vu=new VUpdate(sc,empleados);
					vu.update();
					break;
				case 4:
					VDelete vd=new VDelete(sc,empleados);
					vd.remove();
					break;
				case 5:
					VSearch vs=new VSearch(sc,empleados);
					vs.search();
					break;
				case 6:
					if(!fileUtil.serialize(empleados))
						System.out.println("error al guardar");
					break;
				default:
					break;

				}
			}catch(Exception e) {
				System.out.println("se ha producido un error");
				sc = new Scanner(System.in);
			}
		} while (opcion != 0);
	}
}
