package com.backend.iocdi.stereotype;

import org.springframework.stereotype.Service;

@Service
public class CardPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Card");
    }
}
