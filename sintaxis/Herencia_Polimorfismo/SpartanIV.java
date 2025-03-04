package Herencia_Polimorfismo;

public class SpartanIV extends Spartan{

    public SpartanIV(int escudo, String nombre, int salud, String arma) {
        super(100, nombre, salud, arma);
    }
    public void usarPropulsores(){
        System.out.println("El spartan " + nombre + " cuenta con retropropulsores");
    }
    
}
