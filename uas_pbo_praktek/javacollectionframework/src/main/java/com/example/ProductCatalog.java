package com.example;

import java.util.HashMap;
import java.util.Scanner;

public class ProductCatalog {
    public static void main(String[] args) {
        // Deklarasi HashMap
        HashMap<String, Double> productCatalog = new HashMap<>();

        // Masukkan data produk ke dalam HashMap
        productCatalog.put("Laptop", 10000.0);
        productCatalog.put("Smartphone", 5000.0);
        productCatalog.put("Tablet", 3000.0);
        productCatalog.put("Headphones", 1500.0);

        // Menampilkan katalog produk
        System.out.println("Katalog Produk: ");
        for (String product : productCatalog.keySet()) {
            System.out.println(product + ": " + productCatalog.get(product));
        }

        // Mencari harga produk berdasarkan nama
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama produk yang ingin dicari: ");
        String productName = scanner.nextLine();

        // Mencari produk
        if (productCatalog.containsKey(productName)) {
            System.out.println("Harga " + productName + ": " + productCatalog.get(productName));
        } else {
            System.out.println(productName + " tidak ditemukan.");
        }
    }
}
