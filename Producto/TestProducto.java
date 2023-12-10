
public class TestProducto {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Producto productoA = new Producto("Arroz", "Comida", 0.7, 45);
        Producto productoB = new Producto("Azucar", "Comida", 0.5, 40);
        Producto productoC = new Producto("Maiz", "Comida", 0.3, 40);

        System.out.println(productoA.toString() + "\n" + productoB.toString() + " \n" + productoC.toString());

    }
}