package com.pluralsight.collections;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Product door = new Product("door", 30);
        Product window = new Product("window", 20);
        Product table = new Product("table", 7);

        // Create
            Product[] products = {door, window};

        // Print
            System.out.println(products);  //[Lcom.pluralsight.collections.Product;@6d03e736
            System.out.println(Arrays.toString(products)); // [Product{name='door', weight=30}, Product{name='window', weight=20}, Product{name='table', weight=7}]

        // Add
            // products[2] = table;
            /* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
	         at com.pluralsight.collections.Main.main(Main.java:20) */
            products = add(table, products);
            System.out.println(Arrays.toString(products)); // [Product{name='door', weight=30}, Product{name='window', weight=20}, Product{name='table', weight=7}]

        // Duplicate
            products = add(table, products);
            System.out.println(Arrays.toString(products)); //[Product{name='door', weight=30}, Product{name='window', weight=20}, Product{name='table', weight=7}, Product{name='table', weight=7}]


	    // write your code here
        Collection<Product> products2 = new ArrayList<>();
        products2.add(door);
        products2.add(table);
        Iterator<Product> iterator = products2.iterator();
        while (iterator.hasNext()){
            Product producto = iterator.next();
            if (producto.getWeight() > 15)
                System.out.println(producto);
        }
        set();


    }

    private static Product[] add(Product product, Product[] array) {
        int length = array.length;
        Product[]  productNew = Arrays.copyOf(array, length + 1);
        productNew[length] = product;
        return productNew;
    }

    private static void set(){
        final Set hasSet = new HashSet(1000);
        for (int i= 0; i < 999; i++){
            hasSet.add(i);
        }
        hasSet.add();
        System.out.println(hasSet.toString());
    }
}
