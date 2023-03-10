package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product firstOrder = new Product(1, "Handtuch, Mülleimer, Seife");
        Product secondOrder = new Product(2, "Decke");
        ArrayList<Product> list = new ArrayList<>();
        //list.add(0, firstOrder);
        System.out.println(list);

    }
}