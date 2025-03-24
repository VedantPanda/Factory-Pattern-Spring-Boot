package factorypattern.app.strategy.impl;

import factorypattern.app.PaymentMethod;
import factorypattern.app.strategy.PaymentProcessor;
import org.springframework.stereotype.Component;

@Component
public class UpiPayment implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Upi payment");
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.UPI;
    }
}
