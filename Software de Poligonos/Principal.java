package code1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

    static ArrayList<Poligono> poligonos = new ArrayList<>();

    public static void main(String[] args) {
        llenarPoligono();
    }

    public static void llenarPoligono() {
        int opcion;
        char respuestaChar;
        do {
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite el polígono que desea.\n1. Triángulo\n2. Rectángulo."));
            } while (opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1:
                    llenarTriangulo();
                    break;
                case 2:
                    llenarRectangulo();
                    break;
            }

            String respuesta = JOptionPane.showInputDialog("Desea introducir otro polígono? (s/n): ");
            respuestaChar = respuesta.toLowerCase().charAt(0);

        } while (respuestaChar == 's');

        // Si la respuesta es 'n', mostrar todos los datos guardados
        if (respuestaChar == 'n') {
            mostrarResultados();
        }
    }

    public static void llenarTriangulo() {
        float lado1, lado2, lado3;
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1 del triángulo: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2 del triángulo: "));
        lado3 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 3 del triángulo: "));

        Triangulo tri = new Triangulo(lado1, lado2, lado3);
        poligonos.add(tri);
    }

    public static void llenarRectangulo() {
        float lado1, lado2;
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1 del rectángulo: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2 del rectángulo: "));

        Rectangulo rec = new Rectangulo(lado1, lado2);
        poligonos.add(rec);
    }

public static void mostrarResultados() {
    StringBuilder resultados = new StringBuilder("Resultados de los polígonos:\n\n");

    for (Poligono poligono : poligonos) {
        resultados.append(poligono.toString()).append("\n\n");
    }

    JOptionPane.showMessageDialog(null, resultados.toString());
}
}
