package figuras.cuadrado;

public class Cuadrado {
    public double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    protected double calcularArea() {
        return Math.pow(lado, 2);
    }

    protected double calcularPerimetro() {
        return lado * 4;
    }

}
