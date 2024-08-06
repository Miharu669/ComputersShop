package dev.vero;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private String taxId;
    private List<Computer> computers;
    private ShopOwner owner;

    public Store(String name, String taxId, ShopOwner owner) {
        this.name = name;
        this.taxId = taxId;
        this.computers = new ArrayList<>();
        this.owner = owner;
    }

    public void addComputer(Computer c) {
        computers.add(c);
    }

    public void removeComputer(String brand) {
        computers.removeIf(c -> c.getBrand().equals(brand));
    }

    public Computer findComputer(String brand) {
        for (Computer c : computers) {
            if (c.getBrand().equals(brand)) {
                return c;
            }
        }
        return null;
    }

    public void listComputers() {
        for (Computer c : computers) {
            System.out.println(c);
        }
    }

    public ShopOwner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", taxId='" + taxId + '\'' +
                ", owner=" + owner +
                '}';
    }
}

