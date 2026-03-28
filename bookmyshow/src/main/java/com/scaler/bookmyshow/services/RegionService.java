package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.Region;
import com.scaler.bookmyshow.repositories.RegionRepository;
import org.springframework.stereotype.Service;

@Service
public class RegionService extends AbstractEntityService<Region> {

    public RegionService(RegionRepository repository) {
        super(repository);
    }
}
