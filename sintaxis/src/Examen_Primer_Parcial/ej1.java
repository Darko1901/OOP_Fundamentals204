package Examen_Primer_Parcial;

public class ej1 {
    public static void main(String[] args) {
        System.out.println("A continuación, se muestran los números múltiplos de 10 comprendidos entre 10 y 1000");
        for (int i = 10; i <= 1000; i++) {
            if (i%10 ==0) {
                System.out.print(i + " ,");
            }
        }
    }
}
