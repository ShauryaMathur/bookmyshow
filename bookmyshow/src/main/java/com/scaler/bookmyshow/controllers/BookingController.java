package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.dtos.BookMovieRequestDTO;
import com.scaler.bookmyshow.dtos.BookMovieResponseDTO;
import com.scaler.bookmyshow.enums.ResponseStatus;
import com.scaler.bookmyshow.models.Booking;
import com.scaler.bookmyshow.services.BookingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class BookingController extends BaseEntityController<Booking> {

    private final BookingService bookingService;

    public BookingController(BookingService service) {
        super(service);
        this.bookingService = service;
    }

    public BookMovieResponseDTO bookTicket(BookMovieRequestDTO bookMovieRequestDTO){
        BookMovieResponseDTO responseDTO = new BookMovieResponseDTO();
        try{
            Booking booking = bookingService.bookTicket(bookMovieRequestDTO.getUserId(), bookMovieRequestDTO.getShowId(), bookMovieRequestDTO.getShowSeatIds());
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            responseDTO.setBookingId(booking.getId());
        }catch (Exception e){
            System.out.println(e.getMessage());
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }
}
