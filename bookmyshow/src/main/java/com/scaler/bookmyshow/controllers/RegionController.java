package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.models.Region;
import com.scaler.bookmyshow.services.RegionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/regions")
public class RegionController extends BaseEntityController<Region> {

    public RegionController(RegionService service) {
        super(service);
    }
}
