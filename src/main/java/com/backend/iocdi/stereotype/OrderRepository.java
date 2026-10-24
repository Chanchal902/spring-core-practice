package com.backend.iocdi.stereotype;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public void save(String item) {
        System.out.println("Saved to DB: " + item);
    }
}
