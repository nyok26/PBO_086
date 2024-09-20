package com.polban.jtk.sales;

public class Product {
    private String productName;
    private int stock;
    private double price;

    public Product(String name, int stock, double price) {
        this.productName = name;
        this.stock = stock;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public void addStock(int amount) {
        stock += amount;
    }

    public void sellProduct(int amount) {
        if (stock >= amount) {
            stock -= amount;
        } else {
            System.out.println("Stock is not enough.");
        }
    }

    public void updatePrice(double newPrice) {
        if (newPrice > 0) {
            price = newPrice;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }
}
