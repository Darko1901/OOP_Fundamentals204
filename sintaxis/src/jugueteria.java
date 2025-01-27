import java.util.*;

public class jugueteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peso_payaso = 112;
        int peso_muneca = 75;

        System.out.println("Ingrese el numero de payasos vendidos");
        int payasos = sc.nextInt();

        System.out.println("Ingrese el numero de muñecas vendidas: ");
        int munecas = sc.nextInt();

        int pesoTotal = (payasos * peso_payaso) + (munecas * peso_muneca);
        System.out.println("El peso total del paquete es de: " + pesoTotal);
    }
}
