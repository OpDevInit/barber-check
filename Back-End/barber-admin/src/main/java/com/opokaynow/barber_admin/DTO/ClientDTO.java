package com.opokaynow.barber_admin.DTO;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.opokaynow.barber_admin.entity.Client;

import lombok.Getter;

@Getter
public class ClientDTO {
    private Long id;
    private String name;
    private boolean beards;
    private boolean hair;
    private String localOfCut;
    private String typeCut;
    private String tel;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dateTime;
    private String paymentMethod;

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.beards = client.isBeards();
        this.hair = client.isHair();
        if (client.isLocalDeliveryCut() == true) {
            this.localOfCut = "Delivery Cut";
        } else if (client.isLocalHomeCut() == true) {
            this.localOfCut = "Home Cut";
        }
        this.typeCut = client.getTypeCut();
        this.tel = client.getTel();
        this.dateTime = client.getDateTime();
        this.paymentMethod = client.getPaymentMethod();

    }
}