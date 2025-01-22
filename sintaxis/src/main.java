//IMPORTACIONES

//CLASE PRINCIPAL
public class main {
    //METODO PRINCIPAL
    public static void main(String[] args){
        System.out.println("Hello, Ricardo Mendez!");
        
        String cadenas = "Ricardo" + " Mendez" + " Rodriguez";
        System.out.println(cadenas);
        System.out.println("La longitud es de: " + cadenas.length());

        // Extraer caracteres de la cadena en un rango dado
        System.out.println(cadenas.substring(2,5));
        System.out.println(cadenas.substring(2));
        System.out.println(cadenas.substring(0,5));

        
    }
}