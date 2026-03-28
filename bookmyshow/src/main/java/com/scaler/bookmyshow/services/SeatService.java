package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.Seat;
import com.scaler.bookmyshow.repositories.SeatRepository;
import org.springframework.stereotype.Service;

@Service
public class SeatService extends AbstractEntityService<Seat> {

    public SeatService(SeatRepository repository) {
        super(repository);
    }
}
