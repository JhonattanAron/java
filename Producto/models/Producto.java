public class Producto{
    private String nombre ;
    private String description ;
    private float precio ;
    private Int stockActual;

    public Producto(String nombre, String description, float precio, Int stockActual) {
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
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getStockActual() {
        return stockActual;
    }
    public void setStockActual(String stockActual) {
        this.stockActual = stockActual
    }
    public String toString() {
        return "Nombre: " + nombre + " Description: " + description + " Precio: " + precio + " StockActual: " + stockActual;
    }
}