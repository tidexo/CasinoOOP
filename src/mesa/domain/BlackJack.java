package animal.domain;
public class BlackJack extends Mesa {
    private boolean puedeVolar;
    public BlackJack(String nombre, float peso, int edad, String especie, boolean puedeVolar){
        super(nombre, peso, edad,especie);
        
        this.puedeVolar = puedeVolar;
    }
    public boolean getPuedeVolar(){
        return puedeVolar;
    }
    public String toString(){
        return "BlackJack, puede volar: " + puedeVolar + " " + super.toString();
    }
    public String tipo(){
        return subtypes[1];
    }
}
