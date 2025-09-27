package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> components = new ArrayList<>();
    private final String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Component c: components) {
            total += c.getPrice();
        }
        return total;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Composite: " + name);
        for (Component c: components) {
            c.showDetails();
        }
    }
}
