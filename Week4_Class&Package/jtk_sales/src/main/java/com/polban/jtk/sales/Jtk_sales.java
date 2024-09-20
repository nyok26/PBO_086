/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.polban.jtk.sales;
import java.text.DecimalFormat;
/**
 *
 * @author b
 */

public class Jtk_sales {
    public static void main(String[] args) {
        // 1. Membuat object product dengan quantity produk 10
        Product product = new Product("Laptop", 5000000.00, 10);

        // 2. Membuat object sales
        Sales sales = new Sales(product);

        // 3. Lakukan penjualan produk dengan quantity 5
        sales.sellProduct(5);

        // 4. Lakukan restock produk
        sales.restockProduct(10);

        // 5. Memperbaharui harga produk
        sales.updateProductPrice(7500000.00);

        // 6. Coba memperbaharui harga produk dengan nilai negatif
        sales.updateProductPrice(-5000000.00);

        // 7. Format harga baru dalam bentuk string tanpa notasi ilmiah
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Harga baru (formatted): Rp" + df.format(product.getPrice()));
    }
}
