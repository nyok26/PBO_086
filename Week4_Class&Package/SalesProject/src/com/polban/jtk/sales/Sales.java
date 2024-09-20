package com.polban.jtk.sales;

public class Sales {
    private Product product;

    public Sales(Product product) {
        this.product = product;
    }

    public void processSale(int quantity) {
        product.sellProduct(quantity);
        System.out.println(quantity + " " + product.getProductName() + " sold.");
    }

    public void restock(int amount) {
        product.addStock(amount);
        System.out.println(product.getProductName() + " restocked by " + amount);
    }

    public void updatePrice(double newPrice) {
        product.updatePrice(newPrice);
        System.out.println("New price for " + product.getProductName() + " is " + product.getPrice());
    }
}
