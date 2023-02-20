import java.util.Scanner;

public class DevuelveDeMayorAMenor {
    public static void main(String[] args) {
        System.out.printf("Introduce el primer numero");
        Scanner sc = new Scanner(System.in);
        double primerNumero = sc.nextDouble();

        System.out.printf("introduce el segundo numero");
        double segundoNumero = sc.nextDouble();

        String resultado = (primerNumero>segundoNumero) ? primerNumero+ " y "+ segundoNumero :segundoNumero +" y "+ primerNumero;
        System.out.println("resultado = " + resultado);
    }
}
