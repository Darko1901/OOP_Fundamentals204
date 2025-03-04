package Herencia_Polimorfismo;

public class SpartanII extends Spartan{

    public SpartanII(int escudo, String nombre, int salud, String arma) {
        super(150, nombre, salud, arma);
    }
    public void manejoAvanzado(){
        System.out.println("El spartan " + nombre + " tiene escudo extra y tacticas avanzadas");
    }
}
