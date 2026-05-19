package com.dedic.oop.model;

public class Equipment {

    private String name;
    private String category;
    private int stock;

    public Equipment(String name, String category, int stock) {
        this.name = name;
        this.category = category;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        stock += amount;
    }

    public void reduceStock(int amount) {

        if (amount > stock) {
            System.out.println("Stock tidak cukup");
            return;
        }

        stock -= amount;
    }

    public void displayInfo() {
        System.out.println("Nama      : " + name);
        System.out.println("Kategori  : " + category);
        System.out.println("Stock     : " + stock);
        System.out.println("-------------------------");
    }
}
