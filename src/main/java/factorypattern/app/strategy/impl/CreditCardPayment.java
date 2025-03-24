package factorypattern.app.strategy.impl;

import factorypattern.app.PaymentMethod;
import factorypattern.app.strategy.PaymentProcessor;
import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Credit Card Payment");
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
