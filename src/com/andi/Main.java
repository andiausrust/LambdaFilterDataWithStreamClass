package com.andi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class Main {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product(1, "Trees", 20));
        list.add(new Product(2, "Car", 2000));
        list.add(new Product(3, "House", 40));

        Stream<Product> filteredData = list.stream().filter(
                p -> p.price > 30
        );

        filteredData.forEach(p -> System.out.println(p.name));
    }
}
