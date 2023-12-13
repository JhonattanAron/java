package clearminds.cuentas.test;

import java.util.ArrayList;

import clearminds.cuentas.*;

public class TestCuenta {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("03476");
        cuenta1.setSaldo(675.0);

        Cuenta cuenta2 = new Cuenta("03476", "C", 98.0);

        Cuenta cuenta3 = new Cuenta("03476");
        cuenta3.setTipo("C");

        System.out.println("----------Valores Iniciales----------");
        System.out.println(cuenta1.Imprimir());
        System.out.println(cuenta2.Imprimir());
        System.out.println(cuenta3.Imprimir());
        System.out.println("----------Valores Modificados----------");
        cuenta1.setSaldo(444.0);
        cuenta3.setSaldo(567.0);
        cuenta2.setTipo("D");
        System.out.println(cuenta1.Imprimir());
        System.out.println(cuenta2.Imprimir());
        System.out.println(cuenta3.Imprimir());

        Cuenta cuenta4 = new Cuenta("0987");
        cuenta4.setSaldo(10.0);
        Cuenta cuenta5 = new Cuenta("0557", "C", 10.0);
        Cuenta cuenta6 = new Cuenta("0666", "A", 0.0);

        ArrayList<Cuenta> cuentaList = new ArrayList<>();
        cuentaList.add(cuenta4);
        cuentaList.add(cuenta5);
        cuentaList.add(cuenta6);

        for (Cuenta cuenta : cuentaList) {
            System.out.println("----------Con mi Estilo----------");
            System.out.println(cuenta.imprimirConMiEstilo());
        }

    }
}
