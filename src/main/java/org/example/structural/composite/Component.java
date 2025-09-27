package org.example.structural.composite;

public interface Component {
    double getPrice();

    void add(Component component);

    void remove(Component component);

    void showDetails();
}
