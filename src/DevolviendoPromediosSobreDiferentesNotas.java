import java.util.Scanner;

public class DevolviendoPromediosSobreDiferentesNotas {
    public static void main(String[] args) {
        // Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores
        // a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

        Scanner scanner = new Scanner(System.in);

        double nota= 0 ;
        int contadorDeNotasMayoresA5 = 0;
        int contadorDeNotasMenoresA4 = 0;
        int contadorDeNotas1 = 0;
        double sumaDeLasNotasMayoresA5 = 0;
        double sumaDeLasNotasMenoresA4 = 0;
        double sumaDeLasNotasTotales = 0;
        double promedioDeNotasMayoresA5, promedioDeNotasMenoresA4, promedioDeLasNotasTotales;
        boolean error = false;

        for (int i = 0; i < 20; i++) {
            System.out.println("Introduzca por favor 20 notas entre 1 y 7 " + (i + 1) + ": ");
            nota = scanner.nextDouble();
            if (nota == 0 && nota > 7) {
                System.out.println("Error vuelve a correr el programa y ingresa un valor entre 1 y 7");
                System.exit(1);
            }


            if (nota == 1) {
                contadorDeNotas1++;

            } else {
                if (nota > 5) {
                    contadorDeNotasMayoresA5++;
                    sumaDeLasNotasMayoresA5 += nota;
                } else if (nota < 4) {
                    contadorDeNotasMenoresA4++;
                    sumaDeLasNotasMenoresA4 += nota;
                }
            }
            sumaDeLasNotasTotales = nota;
        }




            System.out.println("el numero de notas de 1 es: " + contadorDeNotas1);

            if (contadorDeNotasMayoresA5 == 0) {
                System.out.println("no puedo mostrarte el promedio de las notas mayores a 5 porque no hay notas mayores a 5");
            } else {
                promedioDeNotasMayoresA5 = sumaDeLasNotasMayoresA5 / contadorDeNotasMayoresA5;
                System.out.printf("El promedio de las notas mayores a 5 es de: " + promedioDeNotasMayoresA5);
            }

            if (contadorDeNotasMenoresA4 == 0) {
                System.out.println("no puedo mostrarte el promedio de las notas menores a 4 porque no hay notas menores  a 4 ");
            } else {
                promedioDeNotasMenoresA4 = sumaDeLasNotasMenoresA4 / contadorDeNotasMenoresA4;
                System.out.println("El promedio de las notas menores a 4 es: " + promedioDeNotasMenoresA4);
            }

            promedioDeLasNotasTotales = sumaDeLasNotasTotales / 20;
            System.out.println("promedio De LasNotasTotales = " + promedioDeLasNotasTotales);

    }
    }


