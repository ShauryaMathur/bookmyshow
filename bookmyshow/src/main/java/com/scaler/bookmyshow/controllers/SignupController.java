package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.dtos.SignUpRequestDTO;
import com.scaler.bookmyshow.dtos.SignUpResponseDTO;
import com.scaler.bookmyshow.enums.ResponseStatus;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.services.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SignupController {

    @Autowired
    private UserRegistrationService userRegistrationService;

    @PostMapping
    public SignUpResponseDTO signUp(@RequestBody SignUpRequestDTO signUpRequestDTO){
        SignUpResponseDTO responseDTO = new SignUpResponseDTO();
        try{
            User user = userRegistrationService.signUp(signUpRequestDTO.getEmail(),signUpRequestDTO.getPassword());
            responseDTO.setUserId(user.getId());
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception e){
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }

}
