package animal.domain;

import java.io.Serializable;


public class Mesa implements Serializable {
    protected String[] subtypes;
    private int maxJugadores;
    private int minJugadores;
    private boolean estadoMesa;
    public Mesa(int maxJugadores, int minJugadores, boolean estadoMesa) {
        this.maxJugadores = maxJugadores;
        this.minJugadores = minJugadores;
        this.estadomesa = estadoMesa;
        this.subtypes= new String[]{"BlackJack", "Poker"};
    }
    public String getmaxJugadores(){
        return nombre;
    }
    public float getminJugadores(){
        return peso;
    }
    public int getestadoMesa(){
        return edad;
    }
    
    public String toString(){
        return "Peso: " + peso + " Edad: " + edad + " Especie: " + especie;
    }
    public boolean equals(Object obj) {
        String nombreTmp=((Mesa)obj).getNombre();
        if (this.nombre.equals(nombreTmp))
            return true;
        return false;
    }
    public String tipo(){
        String res= "Mesa";
        for(int i=0;i<subtypes.length;i++){
            res += " " + subtypes[i];
        }
        return res;

    }

}
