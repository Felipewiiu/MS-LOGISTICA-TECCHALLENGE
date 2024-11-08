package br.com.mslogistica.ms_logistica.domain.valueobjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Destination {

    private String cep;

    private Integer number;

    private String complement;

    private String city;

    private String UF;
}
