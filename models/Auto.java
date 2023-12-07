public Class Auto{
    private String marca;
    private Int anio;
    private String precio;

    piblic Auto(String marca, Int anio, float precio){
        this.maraca = marca;
        this.anio = anio;
        this.precio = precio;
    }

    public String getMarca(){
        return marca;
    }
    public Int getanio() {
        return anio;
    }
    public float getPrecio(){
        return precio;
    }

    public void setMarca(String maraca) {
        this.maraca = maraca;
    }
    public void setanio(String anio) {
        this.anio = anio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public String toString(){
        return "Auto(" + marca +" Anio: " + anio +" Precio: " + precio +")";
    }



}