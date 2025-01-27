import java.util.Scanner;

public class paga_horas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la paga por hora: ");
        double paga_horas = sc.nextDouble();

        System.out.println("Ingrese el numero de horas pagadas: ");
        int horas = sc.nextInt();

        Double pago = paga_horas * horas;
        System.out.println("La paga que le corresponde es de: $" + pago + " mxn");
    }
}
