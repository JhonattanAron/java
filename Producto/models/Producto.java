public class Producto {
    private String nombre;
    private String description;
    private double precio;
    private int stockActual;

    public Producto(String nombre, String description, double precio, int stockActual) {
        this.nombre = nombre;
        this.description = description;
        this.precio = precio;
        this.stockActual = stockActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public String toString() {
        return "Nombre: " + nombre + " Description: " + description + " Precio: " + precio + " StockActual: "
                + stockActual;
    }
}