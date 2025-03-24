package factorypattern.app.strategy;

import factorypattern.app.PaymentMethod;

public interface PaymentProcessor {

    void processPayment();

    PaymentMethod getPaymentMethod();

}
