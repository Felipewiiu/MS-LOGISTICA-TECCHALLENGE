package br.com.mslogistica.ms_logistica.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPerson {

    private Long PersonCode;
    private String name;
    private String CPF;
    private String phoneNumber;
}
