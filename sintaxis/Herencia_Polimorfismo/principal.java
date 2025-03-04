package Herencia_Polimorfismo;

public class principal {
    public static void main(String[] args) {
        SpartanII masterChief = new SpartanII(0, "John", 100, "Rifle de Asalto");
        masterChief.mostrarInfo();
        masterChief.manejoAvanzado();
        masterChief.atacar("Grunt");
        masterChief.recibirDano(50);
        masterChief.recargarEscudo();

        SpartanIII noble = new SpartanIII(0,"Carter", 100, "DMR");
        noble.mostrarInfo();
        noble.atacar("Elite");
        noble.recibirDano(50);
        noble.recargarEscudo();
        noble.camuflajeActivo();

        SpartanIV locke = new SpartanIV(100, "Locke", 100, "Rifle de Asalto");
        locke.mostrarInfo();
        locke.atacar("Phantom");
        locke.recibirDano(60);
        locke.recargarEscudo();
        locke.usarPropulsores();
    }
}
