import java.util.Scanner;

public class Metodos {
    private String nombre;
    private int edad;

    // Constructor que lee datos para inicializar los atributos
    public Metodos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre: ");
        this.nombre = scanner.nextLine();

        System.out.print("Ingresa la edad: ");
        this.edad = scanner.nextInt();
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
