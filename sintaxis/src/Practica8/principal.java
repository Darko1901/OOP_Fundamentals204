package Practica8;

public class principal {
    public static void main(String[] args) {
        spartan miSpartan = new spartan();
        spartan noble = new spartan();

        miSpartan.nombre = "Master Chief";
        miSpartan.salud = 100;
        miSpartan.escudo = 80;
        miSpartan.armaPrincipal = "Assault Rifle";

        miSpartan.mostrarInfo();
        miSpartan.atacar("Grunt");
        miSpartan.recargarArma(70);
        miSpartan.correr(true);

        noble.nombre = "Emile";
        noble.salud = 100;
        noble.escudo = 50;
        noble.armaPrincipal = "Shotgun";

        noble.mostrarInfo();
        noble.atacar("Elite Zealot");
        noble.recargarArma(8);
        noble.correr(false);
    }
}
