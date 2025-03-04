package Herencia_Polimorfismo;

public class Spartan extends Soldado{
    private int escudo;

    public Spartan(int escudo, String nombre, int salud, String arma) {
        this.escudo = escudo;
        super(nombre, salud, arma);
    }

    public void recargarEscudo(){
        escudo = 100;
        System.out.println("Spartan " + nombre + "ha recargado su escudo");
    }

    @Override
    public void recibirDano(int dano){
        if(escudo > 0){
            escudo -= dano;
            System.out.println("Regenerando escudo");
            if (escudo < 0) {
                salud += escudo;
                escudo = 0;
            }
            System.out.println("Daño recibido: " + dano + " .Salud: " + salud);
        }else{
            super.recibirDano(dano);
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Escudo: " + this.escudo);
    }
}
