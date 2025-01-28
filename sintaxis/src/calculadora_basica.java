import java.util.*;

public class calculadora_basica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double n1 = sc.nextDouble();

        System.out.println("Introduce un segundo numero: ");
        double n2 = sc.nextDouble();

        double suma,resta,multi,div;

        System.out.println("Introduce un operador (+, -, *, /)");
        char operador = sc.next().charAt(0);

        switch (operador) {
            case '+':
                suma = n1 + n2;
                System.out.println("Suma: " + suma);
                break;

            case '-':
                resta = n1 - n2;
                System.out.println("Resta: " + resta);
                break;
            case '*':
                multi = n1 * n2;
                System.out.println("Multiplicacion: " + multi);
                break;
            case '/':
                div = n1 / n2;
                System.out.println("Division: " + div);
                break;
            default:
                System.out.println("Operador incorrecto");
            break;
        }
    }
}
