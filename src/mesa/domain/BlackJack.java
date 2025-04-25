package mesa.domain;
public class BlackJack extends Mesa {
    private int apuestaMinima;
    public BlackJack(int minJugadores, int maxJugadores, boolean estadoMesa){
        super(minjugadores, maxJugadores, estadoMesa);
        
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
