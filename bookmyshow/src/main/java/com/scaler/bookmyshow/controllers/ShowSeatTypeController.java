package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.models.ShowSeatType;
import com.scaler.bookmyshow.services.ShowSeatTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/show-seat-types")
public class ShowSeatTypeController extends BaseEntityController<ShowSeatType> {

    public ShowSeatTypeController(ShowSeatTypeService service) {
        super(service);
    }
}
