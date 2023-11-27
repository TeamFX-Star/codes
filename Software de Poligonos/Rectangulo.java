package code1;

public class Rectangulo extends Poligono {
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo: " + "\n" + "Lado 1: " + Math.round(lado1 * 100.0) / 100.0 + "\n" + "Lado 2: " + Math.round(lado2 * 100.0) / 100.0 + "\n" + "Area" + Math.round(area() * 100.0) / 100.0;
    }
     
    @Override
    public double area(){
        return lado1*lado2;
    }
    
}