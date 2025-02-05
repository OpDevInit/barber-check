package com.opokaynow.barber_client.services;

import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opokaynow.barber_client.entity.Cliente;
import com.opokaynow.barber_client.repository.ClientRepository;

@Service
public class ClientServices {

    @Autowired
    public ClientRepository repository;

    public List<Cliente> getListClient() {

        return repository.findAll();

    }

    public String saveClientCut(Cliente client) {
        
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        if (client.isLocalDeliveryCut() == true) {
            client.setMessageConfirm("Seu corte foi marcado! O barbeiro chegará até "
                    + client.getDateTime().plusHours(1).plusMinutes(30).format(formater));
        } else {
            client.setMessageConfirm("Seu corte foi marcado!! Compareça na rua Rua Viana do Castelo, 288 às "
                    + client.getDateTime().format(formater));
        }
        repository.save(client);
        return client.getMessageConfirm();
    }

}
