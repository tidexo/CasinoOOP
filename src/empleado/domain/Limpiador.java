package empleado.domain;
public class Limpiador extends Empleado {
    private int horas;
    public Limpiador(String nombre, float salario, int horas) {
		super(nombre, salario);
		this.horas=horas;
	}
    public String toString(){
        return "Empleado "+super.subtypes[1]+" Nombre: " + nombre + " Salario: " + mSalario() + " Horas " + horas;
    }
	public float mSalario() {
		if (horas < 1 || horas > 8) {
			horas = 4;
		}
		return super.getSalario()*horas/(12*8);

	}
}