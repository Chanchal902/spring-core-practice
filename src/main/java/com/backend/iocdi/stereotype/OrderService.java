package com.backend.iocdi.stereotype;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final PaymentService ps;
    private final OrderRepository or;

    public OrderService(@Qualifier("upiPaymentService") PaymentService ps, OrderRepository or) {
        this.ps = ps;
        this.or = or;
    }

    public void placeOrder(String item, double amount) {
        or.save(item);
        ps.pay(amount);
    }
}
