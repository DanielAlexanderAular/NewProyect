public class Primitivos {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println(  numeroByte );
        System.out.println(" Bytes corresponde en byte: " + Byte.BYTES);
        System.out.println("Bytes corresponde en bites: " + Byte.SIZE);
        System.out.println("Mayor valor del Byte: " + Byte.MAX_VALUE);
        System.out.println("Menor valor del Byte: " + Byte.MIN_VALUE);


        short numeroShort = 32767;
        System.out.println(  numeroShort );
        System.out.println(" Short  corresponde en byte: " + Short.BYTES);
        System.out.println("Short corresponde en bites: " + Short.SIZE);
        System.out.println("Short corresponde en su maximo valor : " + Short.MAX_VALUE);
        System.out.println("Short corresponde en SU menor valor: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println(numeroInt);
        System.out.println("Int corresponde en bytes: " + Integer.BYTES);
        System.out.println("Int corresponde en bites: " + Integer.SIZE);
        System.out.println(" Int corresponde a un maximo valor de : " + Integer.MAX_VALUE);
        System.out.println(" Int corresponde a un minimo  valor de : " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println(numeroLong);
        System.out.println("Long corresponde en bytes: " + Long.BYTES);
        System.out.println("Long corresponde en bites: " + Long.SIZE);
        System.out.println(" Long corresponde a un maximo valor de : " + Long.MAX_VALUE);
        System.out.println(" Long corresponde a un minimo  valor de : " + Long.MIN_VALUE);


    }
}
