package Practica8;

public class principal {
    public static void main(String[] args) {
        spartan miSpartan = new spartan("Assault Rifle",80,"Master Chief",100);
        spartan noble = new spartan("Shotgun", 50, "Emile", 100);

        miSpartan.mostrarInfo();
        miSpartan.atacar("Grunt");
        miSpartan.recargarArma(70);
        miSpartan.correr(true);

        noble.mostrarInfo();
        noble.atacar("Elite Zealot");
        noble.recargarArma(8);
        noble.correr(false);

        //Modificar el valor de Master Chief
        miSpartan.setNombre("Yo");
        miSpartan.mostrarInfo();
        System.out.println("Nombre del Spartan despues del cambio: " + miSpartan.getNombre());

    }
}
