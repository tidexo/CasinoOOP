package animal.domain;

import java.io.Serializable;


public class Mesa implements Serializable {
    protected String[] subtypes;
    private String nombre;
    private float peso;
    private int edad;
    private String especie;
    public Mesa(String nombre, float peso, int edad, String especie) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.especie = especie;
        this.subtypes= new String[]{"Mamífero", "BlackJack", "Genérico"};
    }
    public String getNombre(){
        return nombre;
    }
    public float getPeso(){
        return peso;
    }
    public int getEdad(){
        return edad;
    }
    public String getEspecie(){
        return especie;
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
