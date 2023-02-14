import javax.swing.*;

public class SiatemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog( null, "Ingrese un numero entero por favor");
        int numeroDecimal = Integer.parseInt(numeroStr);
        System.out.println("numeroDecimal = " + numeroDecimal);

         String mensajeBinario = "numero binario de  " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        String mensajeOctal ="numero octal de " + numeroDecimal +  " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal);
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = "\n" + mensajeBinario;
        mensaje += "\n" +  mensajeOctal;
        mensaje += "\n" +  mensajeHexadecimal;

        JOptionPane.showMessageDialog( null, mensaje);

    }
}
