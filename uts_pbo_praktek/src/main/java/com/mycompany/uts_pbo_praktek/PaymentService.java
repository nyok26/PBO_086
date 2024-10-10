package com.mycompany.uts_pbo_praktek;

abstract class PaymentService {
    public abstract String getPaymentStatus();
    public abstract String getPaymentMethod();
}

class CashPayment extends PaymentService {
    @Override
    public String getPaymentStatus() {
        return "Pending";
    }

    @Override
    public String getPaymentMethod() {
        return "Cash";
    }
}

class OvoPayment extends PaymentService {
    @Override
    public String getPaymentStatus() {
        return "Success";
    }

    @Override
    public String getPaymentMethod() {
        return "OVO";
    }
}

class QrisPayment extends PaymentService {
    @Override
    public String getPaymentStatus() {
        return "Success";
    }

    @Override
    public String getPaymentMethod() {
        return "QRIS";
    }
}
