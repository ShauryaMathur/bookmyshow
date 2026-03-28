package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.SeatType;
import com.scaler.bookmyshow.repositories.SeatTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class SeatTypeService extends AbstractEntityService<SeatType> {

    public SeatTypeService(SeatTypeRepository repository) {
        super(repository);
    }
}
