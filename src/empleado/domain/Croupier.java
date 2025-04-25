package empleado.domain;
public class Croupier extends Empleado {
	public Croupier(String nombre, float salario) {
		super(nombre, salario);
	}
	public String toString(){
        return "Empleado "+super.subtypes[0]+" Nombre: " + nombre + " Salario: " + mSalario();
    }
	public float mSalario(){
		return super.mSalario();
	}
}

