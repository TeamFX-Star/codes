package code1;

public class Triangulo extends Poligono {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return "Triángulo: " + "\n" + "Lado 1: " + Math.round(lado1 * 100.0) / 100.0 + "\n" + "Lado 2: " + Math.round(lado2 * 100.0) / 100.0 + "\n" + "Lado 3: " + Math.round(lado3 * 100.0) / 100.0 + "\n" + "Área: " + Math.round(area() * 100.0) / 100.0;
    }

    public double area() {
        double p = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt((p * (p - lado1) * (p - lado2) * (p - lado3)));
    }

}
