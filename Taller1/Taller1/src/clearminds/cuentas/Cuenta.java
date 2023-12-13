package clearminds.cuentas;

/**
 * Cuenta
 */
public class Cuenta {

    private String id;
    private String Tipo = "A";
    private Double Saldo = 0.0;

    public Cuenta(String id, String Tipo, Double Saldo) {
        this.id = id;
        this.Tipo = Tipo;
        this.Saldo = Saldo;
    }

    public Cuenta(String id) {
        this.id = id;
    }

    public String Imprimir() {
        String cuentaFormat = "**************" +
                "\n\nCUENTA\n\n" +
                "**************" +
                "\nNumero de Cuenta: " + getId() +
                "\nTipo: " + getTipo() +
                "\nSaldo: " + getSaldo() +
                "\n****************";

        return cuentaFormat;
    }

    public String imprimirConMiEstilo() {
        return "{" +
                " id='" + getId() + "'" +
                ", Tipo='" + getTipo() + "'" +
                ", Saldo='" + getSaldo() + "'" +
                "}";
    }

    public String getId() {
        return this.id;
    }

    public String getTipo() {
        return this.Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Double getSaldo() {
        return this.Saldo;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }

}