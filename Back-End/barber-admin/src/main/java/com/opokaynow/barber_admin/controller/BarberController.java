package com.opokaynow.barber_admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opokaynow.barber_admin.DTO.ClientDTO;
import com.opokaynow.barber_admin.services.BarberServices;

@RestController
@RequestMapping(value = "/")
public class BarberController {

    @Autowired
    BarberServices services;


    @GetMapping(value = "barber")
    public List<ClientDTO> getAllClients(){

        return services.getAllClient();

    }

}
