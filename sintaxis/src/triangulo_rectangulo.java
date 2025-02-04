import java.util.*;

public class triangulo_rectangulo {
    public static void main(String[] args) {
        System.out.println("Ingresa la altrua del triangulo: ");
        Scanner sc = new Scanner(System.in);
        int filas = sc.nextInt();

        int aux = 1;
    
        for (int i = 1; i <= filas; i++) {
            if (i % 2 != 0) {
                System.out.println(aux);
                for (int j = 0; j <= i; j++) {
                    
                }
            }
            aux ++;
        }
    }  
}
