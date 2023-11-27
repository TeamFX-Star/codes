package code1;

public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }
    
    @Override
    public String toString(){
        return "numero lados= "+numeroLados;
    }
    //Declaramos el metodo area como abstarcto
    public abstract double area();
    
    
}