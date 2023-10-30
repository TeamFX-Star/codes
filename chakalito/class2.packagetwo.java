package two;
import one.Class2;
import javax.swing.JOptionPane;

public class Class3 {
public static void main(String[] args) {
        float b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de B: "));
        float c = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de C: "));
        float d = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de D: "));
        float f = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de F: "));

        Class2 operaciones = new Class2(b, c, d, f);
        operaciones.sumaBCD();
        operaciones.restaAF();
        operaciones.MostrarDatos();
    }

} 
