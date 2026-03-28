package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.models.SeatType;
import com.scaler.bookmyshow.services.SeatTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/seat-types")
public class SeatTypeController extends BaseEntityController<SeatType> {

    public SeatTypeController(SeatTypeService service) {
        super(service);
    }
}
