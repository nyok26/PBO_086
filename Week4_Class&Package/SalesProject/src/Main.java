import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 10, 15000000);
        Sales sales = new Sales(laptop);

        // Proses penjualan
        sales.processSale(3);

        // Tambah stok
        sales.restock(5);

        // Perbarui harga
        sales.updatePrice(17000000);

        // Harga yang tidak valid
        sales.updatePrice(-5000);
    }
}
