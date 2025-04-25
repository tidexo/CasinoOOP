package animal.domain;
public class Poker extends Mesa {
    private string modalidad;
    public Poker(,string modalidad){
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
