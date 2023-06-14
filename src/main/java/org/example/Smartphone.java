package org.example;

public class Smartphone extends Product{
    private String brand;
    public String getBrand() {
        return brand;
    }

    public Smartphone(int id, String name, int price, String brand) {
        super(id, name, price);
    }
}
