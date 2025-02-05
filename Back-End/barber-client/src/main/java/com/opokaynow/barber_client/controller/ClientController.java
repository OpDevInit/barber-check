package com.opokaynow.barber_client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opokaynow.barber_client.entity.Cliente;
import com.opokaynow.barber_client.services.ClientServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/")
public class ClientController {

    @Autowired
    ClientServices services;

    @GetMapping("client")
    public List<Cliente> getListClient() {
        return services.getListClient();
    }
    

    @PostMapping("client")
    public String saveClientCut(@RequestBody Cliente client) {
        return services.saveClientCut(client);
    }



}
