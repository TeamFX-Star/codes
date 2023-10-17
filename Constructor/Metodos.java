package dsds;

import javax.swing.JOptionPane;

public class Metodos {
    private String nombre;
    private int edad;

    public Metodos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + edad);
    }

    public void mostrarMenu() {
        String[] opciones = {"Ver edad", "Ver nombre", "Ver si es mayor de edad"};
        int seleccion = JOptionPane.showOptionDialog(null, "Elige una opción:", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        switch (seleccion) {
            case 0:
                JOptionPane.showMessageDialog(null, "Edad: " + edad);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Nombre: " + nombre);
                break;
            case 2:
                if (edad >= 18) {
                    JOptionPane.showMessageDialog(null, "Es mayor de edad.");
                } else {
                    JOptionPane.showMessageDialog(null, "No es mayor de edad.");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
    }
}
