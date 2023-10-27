package one;
import javax.swing.JOptionPane;

public class Class2 {
    public static void main(String[] args) {
        Class1 objeto1 = new Class1();
        
        objeto1.nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        objeto1.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
        objeto1.sexo = JOptionPane.showInputDialog("Ingrese el sexo (M/F):");

        // Ahora que los datos están en objeto1, puedes llamar a Class3 para mostrarlos
        two.Class3.mostrarDatos(objeto1);
    }
}
