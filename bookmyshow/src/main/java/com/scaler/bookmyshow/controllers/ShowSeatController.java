package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.models.ShowSeat;
import com.scaler.bookmyshow.services.ShowSeatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/show-seats")
public class ShowSeatController extends BaseEntityController<ShowSeat> {

    public ShowSeatController(ShowSeatService service) {
        super(service);
    }
}
