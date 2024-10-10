package com.mycompany.uts_pbo_praktek;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader("data.json");
            Delivery[] deliveries = gson.fromJson(reader, Delivery[].class);

            System.out.printf("%-20s | %-8s | %-8s | %-20s | %-12s | %-12s | %-15s | %-15s %n",
                    "ProductName", "Quantity", "Weight", "Destination",
                    "ServicePackage", "ServiceValue", "Total", "PaymentMethod", "PaymentStatus");

            for (Delivery delivery : deliveries) {
                PaymentService paymentService = getPaymentService(delivery);
                int total = delivery.calculateTotalPrice();

                System.out.printf("%-20s | %-8d | %-8d | %-20s | %-12s | %-12d | %-12d | %-15s | %-15s %n",
                        delivery.getProductName(), delivery.getQuantity(),
                        delivery.getWeight(), delivery.getCity().getDestination(),
                        delivery.getServicePackage().getService(),
                        delivery.getServicePackage().getValue(),
                        total, paymentService.getPaymentMethod(), paymentService.getPaymentStatus());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static PaymentService getPaymentService(Delivery delivery) {
        return new OvoPayment();
    }
}
