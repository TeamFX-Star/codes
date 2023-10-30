package one;
import javax.swing.JOptionPane;

public class Class2 {
    float b, c, d, f, a, e;

    public Class2(float b, float c, float d, float f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
    }

    public void sumaBCD() {
        a = b + c + d;
    }

    public void restaAF() {
        e = a - f;
    }
    
    public void MostrarDatos() {
        JOptionPane.showMessageDialog(null, "Resultado de a: " + a + "\nResultado de e: " + e);
    }

}
