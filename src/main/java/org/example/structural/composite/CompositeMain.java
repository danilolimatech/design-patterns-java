package org.example.structural.composite;

public class CompositeMain {

    // O Composite Pattern é usado quando você quer tratar objetos
    // individuais (Leaf) e grupos de objetos (Composite) da mesma maneira.

    // Uma caixa de leite tem um preço fixo (Leaf), enquanto um fardo
    // de leite (Composite) agrupa várias caixas ou outros fardos,
    // somando o preço de tudo que contém.

    // O Composite Pattern pode ferir o princípio da Interface Segregation Principle (ISP),
    // porque a interface Component obriga Leafs a implementarem métodos que não usam,
    // como, por exemplo, add e remove na classe Leaf.

    public static void main(String[] args) {
        Component mouseLeaf = new Leaf("Mouse", 10.9);
        Component keyboardLeaf = new Leaf("keyboard", 15.2);

        Component laptop = new Leaf("Dell Latitude", 820.4);
        Component especialBoxForLaptop = new Composite("Especial Box");
        especialBoxForLaptop.add(laptop);

        Component boxOfThings = new Composite("Big box");
        boxOfThings.add(mouseLeaf);
        boxOfThings.add(keyboardLeaf);
        boxOfThings.add(especialBoxForLaptop);

        boxOfThings.showDetails();

        System.out.println("\nTotal price: " + boxOfThings.getPrice());
    }
}
