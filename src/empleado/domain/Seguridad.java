package empleado.domain;
public class Seguridad extends Empleado {
    private int meses;
    public Seguridad(String nombre, float salario, int meses) {
		super(nombre, salario);
		this.meses=meses;
	}
    public String toString(){
        return "Empleado "+super.subtypes[2]+" Nombre: " + nombre + " Salario: " + mSalario() + " Meses " + meses;
    }
	public float mSalario() {
		if (meses < 1 || meses > 12) {
			meses = 12;
		}
		return super.getSalario()/meses;

	}
}
