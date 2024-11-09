package br.com.mslogistica.ms_logistica.infrastructure.persistence.entityJpa.deliverytraking;


import jakarta.persistence.Embedded;

@Embedded
public class CurrentLocation {

    private double latitude;
    private double longitude;
}
