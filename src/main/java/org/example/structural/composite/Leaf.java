package org.example.structural.composite;

public class Leaf implements Component {

    private final String name;
    private final double price;

    public Leaf(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void add(Component component) {
        // It won't be used
    }

    @Override
    public void remove(Component component) {
        // It won't be used
    }

    @Override
    public void showDetails() {
        System.out.println("Leaf: " + this.name);
    }
}
