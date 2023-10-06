package ArgumentosYParametros;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero 1"));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero 2"));

        Operations op = new Operations();

        JOptionPane.showMessageDialog(null, "La suma de " + Math.round(n1 * 100.0) / 100.0 + " + " + Math.round(n2 * 100.0) / 100.0 + " es: " + op.Suma(n1, n2) +
                                                         "\nLa resta de " + Math.round(n1 * 100.0) / 100.0 + " - " + Math.round(n2 * 100.0) / 100.0 + " es: " + op.Resta(n1, n2) +
                                                         "\nLa multiplicacion de " + Math.round(n1 * 100.0) / 100.0 + " * " + Math.round(n2 * 100.0) / 100.0 + " es: " + op.Multiplicacion(n1, n2) +
                                                         "\nLa division de " + Math.round(n1 * 100.0) / 100.0 + " / " + Math.round(n2 * 100.0) / 100.0 + " es: " + op.Division(n1, n2));
        
    }
}
