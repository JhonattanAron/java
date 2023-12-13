package com.clearminds.cuentas.test;

import com.clearminds.cuentas.Cuenta;

public class TestsCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("03476");
        cuenta1.setSaldo(675.0);
        Cuenta cuenta2 = new Cuenta("03476", "C", 98.0);
        Cuenta cuenta3 = new Cuenta("03476");
        cuenta3.setTipo("C");
        System.out.println("---------- Valores Iniciales -----------");
        System.out.println(cuenta1.imprimir());
        System.out.println(cuenta2.imprimir());
        System.out.println(cuenta3.imprimir());

        System.out.println("---------- Valores Modificados -----------");
        cuenta1.setSaldo(444.0);
        cuenta3.setSaldo(567.0);
        cuenta2.setTipo("D");

        System.out.println(cuenta1.imprimir());
        System.out.println(cuenta2.imprimir());
        System.out.println(cuenta3.imprimir());

        Cuenta cuenta4 = new Cuenta("0987");
        cuenta4.setSaldo(10.0);
        Cuenta cuenta5 = new Cuenta("0557", "C", 10.0);
        Cuenta cuenta6 = new Cuenta("0666", "A", 0);

        System.out.println(cuenta4.imprimirConMiEstilo());
        System.out.println(cuenta5.imprimirConMiEstilo());
        System.out.println(cuenta6.imprimirConMiEstilo());

    }

}
