package br.com.mslogistica.ms_logistica.domain.valueobjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CurrentLocation {

    private double latitude;
    private double longitude;

}
