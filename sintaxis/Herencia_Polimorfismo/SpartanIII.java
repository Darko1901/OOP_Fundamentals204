package Herencia_Polimorfismo;

public class SpartanIII extends Spartan{

    public SpartanIII(int escudo, String nombre, int salud, String arma) {
        super(15, nombre, salud, arma);
    }
    public void camuflajeActivo(){
        System.out.println("El spartan " + nombre + " cuenta con camuflaje activo");
    }
}
