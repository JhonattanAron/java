public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultadoMultiplicacion = calculadora.Multiplicar(5.0, 3.0);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);

        double resultadoDivision = calculadora.Divide(10.0, 2.0);
        System.out.println("Resultado de la división: " + resultadoDivision);

        double resultadoPromedio = calculadora.promediar(2.0, 4.0, 6.0);
        System.out.println("Promedio de los números: " + resultadoPromedio);

        calculadora.mostrarResultado();
    }
}
