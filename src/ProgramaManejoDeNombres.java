import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        System.out.println("hola ingresa por favor el nombre de un familiar o amigo");
        Scanner sc1 = new Scanner(System.in);
        String primerNombre1 = sc1.nextLine();
        String primerNombre2 = primerNombre1.toUpperCase().charAt(1) + "." + primerNombre1.substring(primerNombre1.length() - 2);

        System.out.println("hola ingresa por favor otro nombre de un familiar o amigo");
        Scanner sc2 = new Scanner(System.in);
        String segundoNombre1 = sc2.nextLine();
        String segundoNombre2 = segundoNombre1.toUpperCase().charAt(1) + "." + segundoNombre1.substring(segundoNombre1.length() - 2);

        System.out.println("hola ingresa por favor otro nombre de un familiar o amigo");
        Scanner sc3 = new Scanner(System.in);
        String tercerNombre1 = sc3.nextLine();
        String tercerNombre2 = tercerNombre1.toUpperCase().charAt(1) + "." + tercerNombre1.substring(tercerNombre1.length() - 2);

        String resultado =primerNombre2 + "_" + segundoNombre2  + "_" + tercerNombre2 ;

        System.out.printf(resultado);

    }

}