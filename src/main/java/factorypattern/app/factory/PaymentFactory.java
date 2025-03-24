package factorypattern.app.factory;

import factorypattern.app.PaymentMethod;
import factorypattern.app.strategy.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;

@Component
public class PaymentFactory {

    private final EnumMap<PaymentMethod, PaymentProcessor> paymentMethodMap;

    @Autowired
    public PaymentFactory(List<PaymentProcessor> paymentProcessors) {
        paymentMethodMap = new EnumMap<>(PaymentMethod.class);
        paymentProcessors.forEach(paymentMethodMap.put(paymentProcessors.));
    }
}
