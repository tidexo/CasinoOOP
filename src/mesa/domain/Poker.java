package mesa.domain;
public class Poker extends Mesa {
    private String modalidad;
    public Poker(int minJugadores, int maxJugadores, boolean estadoMesa, string modalidad){
        super(minJugadores, maxJugadores, estadoMesa);
        this.modalidad = modalidad;
    }
    public String getmodalidad(){
        return modalidad;
    }   
    public String toString(){
        return "Poker, modalidad: " + modalidad + " " + super.toString();
    }
    public String tipo(){
        return subtypes[0];
    }
}
