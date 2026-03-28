package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.models.Seat;
import com.scaler.bookmyshow.services.SeatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/seats")
public class SeatController extends BaseEntityController<Seat> {

    public SeatController(SeatService service) {
        super(service);
    }
}
