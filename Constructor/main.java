package dsds;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad:"));

        Metodos objeto = new Metodos(nombre, edad);
        objeto.mostrarMenu();
    }

}
