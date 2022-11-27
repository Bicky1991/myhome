package com.myhome.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class MyHome {

    @Id
    private int homeNo;
    private double homePrice;
    private String homeName;
    private String homeColour;
}
