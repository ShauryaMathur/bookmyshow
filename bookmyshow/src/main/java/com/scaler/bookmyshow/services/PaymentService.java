package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.Payment;
import com.scaler.bookmyshow.repositories.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService extends AbstractEntityService<Payment> {

    public PaymentService(PaymentRepository repository) {
        super(repository);
    }
}
