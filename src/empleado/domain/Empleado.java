package empleado.domain;

import java.io.Serializable;

public class Empleado implements Serializable {
    protected String nombre;
    protected float salario;
    protected String[] subtypes;
    public Empleado(String nombre, float salario){
        this.nombre = nombre;
        this.salario = salario;
        subtypes=new String[] {"Croupier","Limpiador","Temporal"};
    }
    public String getNombre(){
        return nombre;
    }
    public float getSalario(){
        return salario;
    }
    public String toString(){
    	String res= "Empleado ( ";
        for(int i=0;i<subtypes.length;i++){
            res += subtypes[i]+" )";
        }
        res+=" Nombre: " + nombre + " Salario: " + salario;
        return res;
    }
    public boolean equals(Object obj) {
        String nombreTmp=((Empleado)obj).getNombre();
        if (this.nombre.equals(nombreTmp))
            return true;
        return false;
    }
    public float mSalario() {
        float max = 100000;
        if (salario > 0 && salario < max) {
            return salario;
        } else {
            salario = max/2;
            return salario;
        }
    }

}
