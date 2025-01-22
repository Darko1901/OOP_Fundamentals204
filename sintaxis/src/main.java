//IMPORTACIONES
import java.util.Random;
import java.util.Scanner;

public class main {
    //METODO PRINCIPAL
    public static void main(String[] args){
        System.out.println("Hello, Ricardo Mendez!");
        
        // 1. Manejo de caracteres
        String cadenas = "Ricardo" + " Mendez" + " Rodriguez";
        System.out.println(cadenas);
        System.out.println("La longitud es de: " + cadenas.length());

        // Extraer caracteres de la cadena en un rango dado
        System.out.println(cadenas.substring(2,5));
        System.out.println(cadenas.substring(2));
        System.out.println(cadenas.substring(0,5));

        //2. MANEJO DE VARIABLES Y CONVERSIONES

        int x = 5, x1;
        double y = 1.25, y1;
        String z = "204", z1;

        x1 = Integer.parseInt(z);
        z1 = String.valueOf(y);
        double asd = Double.valueOf(x);

        System.out.println(x1);
        System.out.println(z1);
        System.out.println(asd);

        //3. Conversion implicita (solo enteros y double)
        int num = 12;
        double numD = num;
        System.out.println("Conversion implicita: " + numD);

        //Creamos un objeto de clase Random
        Random rnd = new Random();

        //Aqui ponemos un rango en que generará numeros aleatorios
        int nRand = rnd.nextInt(1,10);
        System.out.println("Numero entero aleatorio: " + nRand);

        double dRand = rnd.nextDouble();
        System.out.println("Numero double aleatorio: " + dRand);

        //4. LECTURA DE DATOS
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cualquier dato: ");
        String dato = sc.nextLine();
        System.out.println("Tu dato que ingresaste: " + dato);

        System.out.println("Introduce un dato con decimales");
        Double dato2 = sc.nextDouble();
        System.out.println("Tu numero es: " + dato2);

        System.out.println("Introduce un numero entero: ");
        int dato3 = sc.nextInt();
        System.out.println("Tu numero entero: " + dato3);

        //5. Boolean, OPERADORES LOGICOS Y DE COMPARACION
        System.out.println(10>9);
        System.out.println(10!=9);

        int x10 = 3;
        System.out.println(x10<5 && x10> 10); //False 
        System.out.println(x10<5 || x10> 10); //True
        System.out.println(!(x10<5 && x10> 10)); //True
    }
}