package Examen_Parcial2;

public class principal {
    public static void main(String[] args) {
        matricula examen2 = new matricula(null, null, null, null, new StringBuilder(), null);
        examen2.solicitarDatos();
        examen2.crearMatricula();
        examen2.mostrarMatricula();


        /* 
        String nombre = "Ricardo";
        String paterno = "Mendez";
        String materno = "Rodriguez";
        String carr = "Sistemas";
        String nac = "1987";
        StringBuilder prueba = new StringBuilder();

        prueba.append(nombre.substring(0,1));
        prueba.append(paterno.substring(0,2).toUpperCase());
        prueba.append(materno.substring(0,2).toUpperCase());
        prueba.append(nac.substring(2));
        prueba.append("25");
        prueba.append(carr.substring(0,3).toUpperCase());
        System.out.println(prueba);
        */
    }
}
