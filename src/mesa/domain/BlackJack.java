package animal.domain;
public class BlackJack extends Mesa {
    private int apuestaMinima;
    public BlackJack(String nombre, float peso, int edad, String especie, boolean puedeVolar){
        super(nombre, peso, edad,especie);
        
        this.apuestaMinima = apuestaMinima;
    }
    public boolean apuestaMinima(){
        return apuestaMinima;
    }
    public String toString(){
        return "BlackJack, apuesta mínima: " + apuestaMinima + " " + super.toString();
    }
    public String tipo(){
        return subtypes[1];
    }
}
