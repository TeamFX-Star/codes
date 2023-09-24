package Objects;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        float r = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el radio del cilindro: "));
        float h = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del cilindro: "));

        Cilindro res = new Cilindro();
        
        res.Area(r, h);
        res.Volumen(r, h);
        res.MostrarRes();
    }
}
