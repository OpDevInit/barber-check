package com.opokaynow.barber_admin.entity;

import java.util.TimeZone;

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
    private boolean cut;
    private String typeCut;
    private String tel;
    private TimeZone hourCut;
}
