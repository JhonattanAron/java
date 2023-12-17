package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {
    public static void main(String[] args) {
        Item item = new Item("Joy Tronica");
        item.setProductosActuales(20);
        item.vender(10);
        item.devolver(3);
        System.out.println(item.imprimir());
    }
}
