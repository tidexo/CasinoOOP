package animal.domain;
public class Poker extends Mesa {
    private boolean tienePelo;
    public Poker(String nombre, float peso, int edad, String especie, boolean tienePelo){
        super(nombre,peso,edad,especie);
        this.tienePelo = tienePelo;
    }
    public boolean getTienePelo(){
        return tienePelo;
    }   
    public String toString(){
        return "Poker, Tiene pelo: " + tienePelo + " " + super.toString();
    }
    public String tipo(){
        return subtypes[0];
    }
}
