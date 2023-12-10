package figuras.rectangulo;

/**
 * Rectangulo
 */
public class Rectangulo {
    public double BaseX;
    public double BaseY;
    public double AlturaX;
    public double AlturaY;

    public Rectangulo(double BaseX, double BaseY, double AlturaX, double AlturaY) {
        this.BaseX = BaseX;
        this.BaseY = BaseY;
        this.AlturaX = AlturaX;
        this.AlturaY = AlturaY;
    }

    public double calcularPerimetro() {
        return BaseX + BaseY + AlturaX + AlturaY;
    }

}