import java.util.Scanner;

public class DevuelveElMenorDeDiezEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("en este programa introduciras 10 cantidades entera ");
        int cantidad = scanner.nextInt();
        if (cantidad < 10) {
            System.out.printf("error deben ser 10 cantidades");
        } else {
            int menor = Integer.MAX_VALUE;
            int numero;
            for (int i = 0; i < cantidad; i++) {
                System.out.printf("ingrese su numero " + ( i +1 ) + "por favor: ");
                numero = scanner.nextInt();
                menor = numero < menor ? numero : menor;
            }
            System.out.printf("el numero menor es el:  " + menor);
            if (menor < 10) System.out.printf("el numero menor es menor que 10 ");
            else System.out.printf("el numero es mayor o igual a 10");
        }
    }
}
