package mesa.domain;

import java.io.Serializable;


public class Mesa implements Serializable {
    protected String[] subtypes;
    private int maxJugadores;
    private int minJugadores;
    private boolean estadoMesa;
    public Mesa(int maxJugadores, int minJugadores, boolean estadoMesa) {
        this.maxJugadores = maxJugadores;
        this.minJugadores = minJugadores;
        this.estadoMesa = estadoMesa;
        this.subtypes= new String[]{"BlackJack", "Poker"};
    }
    public int getmaxJugadores(){
        return nombre;
    }
    public int getminJugadores(){
        return minJugadores;
    }
    public boolean getestadoMesa(){
        return estadoMesa;
    }
    
    public String toString(){
        return "mínimo de jugadores: " + minJugadores + " máximo de jugadores: " + maxJugadores + " estado de la mesa: " + estadoMesa;
    }
    
    public String tipo(){
        String res= "Mesa";
        for(int i=0;i<subtypes.length;i++){
            res += " " + subtypes[i];
        }
        return res;

    }

}
