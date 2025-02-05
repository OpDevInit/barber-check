package com.opokaynow.barber_admin.entity;

import java.time.LocalDateTime;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Client {
    private Long id;
    private String name;
    private boolean beards;
    private boolean hair;
    private boolean localHomeCut;
    private boolean localDeliveryCut;
    private String typeCut;
    private String tel;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dateTime;
    private String paymentMethod;
}
