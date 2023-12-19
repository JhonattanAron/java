package com.krakedev.evaluacion;

/**
 * InnerTelefono
 */
public class Telefono {
    private String numero;
    private String tipo;
    private String estado;

    public Telefono(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = calcularEstado();
    }

    private String calcularEstado() {
        if (numero == null || tipo == null || !esTipoValido()) {
            return "E";
        } else if (esMovil() && tieneLongitudCorrecta(10)) {
            return "C";
        } else if (esConvencional() && tieneLongitudCorrecta(7)) {
            return "C";
        } else {
            return "E";
        }
    }

    private boolean esTipoValido() {
        return tipo.equalsIgnoreCase("Movil") || tipo.equalsIgnoreCase("Convencional");
    }

    private boolean esMovil() {
        return tipo.equalsIgnoreCase("Movil");
    }

    private boolean esConvencional() {
        return tipo.equalsIgnoreCase("Convencional");
    }

    private boolean tieneLongitudCorrecta(int longitud) {
        return getNúmero().length() == longitud;
    }

    public String getNúmero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

}
