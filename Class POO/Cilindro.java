package Objects;
import javax.swing.JOptionPane;

public class Cilindro {
    float area;
    float volumen; 
    
    public void Area(float r, float h) {
        area = 2 * (float) Math.PI * r * (r + h);
    }
    
    public void Volumen(float r, float h) {
        volumen = (float) Math.PI * (float) Math.pow(r, 2) * h;
    }
    
    public void MostrarRes() {
        JOptionPane.showMessageDialog(null, "Area: " + Math.round(area) + "\nVolumen: "+ Math.round(volumen));
    }
}

