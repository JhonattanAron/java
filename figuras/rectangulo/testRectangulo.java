package figuras.rectangulo;

public class testRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10, 10, 5, 5);

        System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
    }

}
