package mesa.domain;
public class Poker extends Mesa {
    private string modalidad;
    public Poker(int minJugadores, int maxJugadores, boolean estadoMesa,string modalidad){
        super(minJugadores, maxJugadores, estadoMesa);
        this.modalidad = modalidad;
    }
    public boolean getmodalidad(){
        return tienePelo;
    }   
    public String toString(){
        return "Poker, modalidad: " + modalidad + " " + super.toString();
    }
    public String tipo(){
        return subtypes[0];
    }
}
