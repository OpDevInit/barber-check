package com.opokaynow.barber_admin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opokaynow.barber_admin.DTO.ClientDTO;
import com.opokaynow.barber_admin.entity.Client;
import com.opokaynow.barber_admin.repository.FeignRepository;

@Service
public class BarberServices {

    @Autowired
    public FeignRepository repository;

    Client client; 

    ClientDTO dto;

    public List<ClientDTO> getAllClient() {
              
    List<Client> listClient = repository.getAllClient();

       
        return listClient.stream().map(x -> new ClientDTO(x)).toList();
    }

}
