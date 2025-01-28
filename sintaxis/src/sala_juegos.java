import java.util.*;

public class sala_juegos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        int precio;

        if (edad < 4) {
            precio = 0;
            System.out.println("Precio a pagar: $" + precio);
        }else if (edad >= 4 && edad <= 18) {
            precio = 110;
            System.out.println("Precio a pagar: $" + precio);
        }else if(edad > 18){
            precio = 190;
            System.out.println("Precio a pagar: $" + precio);
        }
    }
}
