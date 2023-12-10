package figuras.cuadrado;

public class testCuadrado {
    public static void main(String[] args) {
        Cuadrado cuadrados[] = new Cuadrado[3];

        cuadrados[0] = new Cuadrado(3);
        cuadrados[1] = new Cuadrado(4);
        cuadrados[2] = new Cuadrado(2);

        for (Cuadrado cuadrado2 : cuadrados) {
            System.out.println("El Area del Cuadrado es: " + cuadrado2.calcularArea() + "\n"
                    + "El Perimetro del cuadrado es: " + cuadrado2.calcularPerimetro());

        }

    }
}
