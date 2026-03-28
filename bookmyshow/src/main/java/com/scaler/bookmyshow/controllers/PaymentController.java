package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.models.Payment;
import com.scaler.bookmyshow.services.PaymentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController extends BaseEntityController<Payment> {

    public PaymentController(PaymentService service) {
        super(service);
    }
}
