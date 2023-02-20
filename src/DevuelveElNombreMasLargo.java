import javax.swing.*;

public class DevuelveElNombreMasLargo {
    public static void main(String[] args) {
        String p1 = JOptionPane.showInputDialog("Introduce el nombre de tu papa");
        String p2 = JOptionPane.showInputDialog("Introduce el nombre de tu mama");
        String p3 = JOptionPane.showInputDialog("Introduce el nombre de tu hermano(a)");

        String nombreMasLargo = (p1.split(" ")[0].length() < p2.split(" ")[0].length()) ? p2 : p1;
        nombreMasLargo =  (p3.split(" ")[0].length() < nombreMasLargo.split(" ")[0].length()) ? nombreMasLargo: p3;

        JOptionPane.showMessageDialog( null, "El nombre mas largo es :" + nombreMasLargo);

    }
}

