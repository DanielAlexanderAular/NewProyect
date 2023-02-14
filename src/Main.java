import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("intruce una longitud en centimetros , y el programa te devolvera la cantidad en pulgada  ");
        Scanner sc = new Scanner(System.in);
        float cm= sc.nextFloat();
        float pulgadas = cm/2.54f;

        System.out.println(" la cantidad que ingresastes en centimetro " + cm +"en pulgadas corresponde a " + pulgadas +
                " pulgadas");



    }
}