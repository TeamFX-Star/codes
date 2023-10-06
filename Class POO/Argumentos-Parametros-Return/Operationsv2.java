package ArgumentosYParametros;
import javax.swing.JOptionPane;

public class Operationsv2 {
    float a;
    float b;
    float suma;
    float resta;
    float mult;
    float div;

    public void LeerD() {
        a = Float.parseFloat(JOptionPane.showInputDialog("Ingrese a: "));
        b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese b: "));
    }

    public void Suma() {
        suma = a+b;
    }

    public void Resta() {
        resta = a-b;
    }
    
    public void Multiplicacion() {
        mult = a*b;
    }

    public void Division() {
        div = a/b;
    }

    public void MostrarRes() {
        JOptionPane.showMessageDialog(null, "Suma: " + Math.round(suma) + "\nResta: " + Math.round(resta) + "\nMultiplicacion: " + Math.round(mult) + "\nDivision: " + Math.round(div));
    }
}
