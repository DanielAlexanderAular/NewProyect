import java.util.Scanner;

public class Practicas {
    public static void main(String[] args) {
        System.out.println("hola que tal estas? ingresa tu nombre por favor");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println("hola " + nombre + "por favor ingresa tu numero de cedula");
        Scanner scanner1 = new Scanner(System.in);
        String cedula = scanner1.nextLine();
        System.out.println("hola " + nombre + "espero estes muy bien, quedaste registra con el numero de cedula" + cedula);

        System.out.println("ingresa por favor un numero que sera el radio de un circulo: ");
        Scanner sc = new Scanner(System.in);
        double radio = sc.nextFloat();
        double perimetro = 2.0*(3.14)*radio;
        double area = (double) perimetro*radio/2;
        System.out.println("el perimetro del radio introducido es " + perimetro);
        System.out.println(" el area del circulo con radio: "+ radio + " es de: "+ area);



       System.out.println("hola que tal estas? ingresa tus ultimas 4 notas  por favor y el programa te dara el promedio");
        System.out.println("ingresa tu primera nota: ");
        Scanner scnr = new Scanner(System.in);
        double nota1 = scnr.nextDouble();
        System.out.println("ingresa tu segunda  nota: ");
        Scanner scanner12 = new Scanner(System.in);
        double nota2 = scanner12.nextDouble();
        System.out.println("ingresa tu tercera nota: ");
        Scanner scanner23 = new Scanner(System.in);
        double nota3 = scanner23.nextDouble();
        System.out.println("ingresa tu cuarta nota: ");
        Scanner scanner3 = new Scanner(System.in);
        double nota4 = scanner3.nextDouble();


        double promedio = (nota3 + nota2 + nota1 + nota4) / 4;
        System.out.println("El promedio de notas que octubiste fue de " + promedio);

    }}