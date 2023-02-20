import java.util.Scanner;

public class DevuelveLaCapacidadDelElEstanque {
    public static void main(String[] args) {

        System.out.println("Por favor introduzca la cantidad de conbustible actual con el maximo de 70 litros ");
        Scanner sc = new Scanner(System.in);
        float combustibleActual = sc.nextFloat();

        if (combustibleActual == 70) {
            System.out.printf("Estanque lleno");
        } else if (combustibleActual >= 60 && combustibleActual < 70) {
            System.out.printf("Estanque casi lleno");
        } else if (combustibleActual >= 40 && combustibleActual < 60) {
            System.out.printf("Estanque  3/4");
        } else if (combustibleActual >= 35 && combustibleActual < 40) {
            System.out.printf("imprimir Medio Estanque");
        } else if (combustibleActual >= 20 && combustibleActual < 35) {
            System.out.printf("etas sin combustible por favor recarga");
        } else if (combustibleActual >= 1 && combustibleActual < 20) {
            System.out.printf("etas sin combustible por favor recarga");
        }else
            System.out.printf("la cantidad que ingresaste exede la capasidad del tanque");
    }
    }












