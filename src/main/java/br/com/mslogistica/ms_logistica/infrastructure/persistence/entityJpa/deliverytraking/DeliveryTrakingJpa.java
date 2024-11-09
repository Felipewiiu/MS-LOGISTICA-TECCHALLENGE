package br.com.mslogistica.ms_logistica.infrastructure.persistence.entityJpa.deliverytraking;

import br.com.mslogistica.ms_logistica.domain.enums.DeliveryStatus;
import br.com.mslogistica.ms_logistica.domain.valueobjects.Destination;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "deliveryTraking")
@Entity(name = "RASTREAMENTO_ENTREGAS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DeliveryTrakingJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deliveryCode;

    private Long deliveryPersonCode;

    private LocalDateTime createdAt;

    private DeliveryStatus deliveryStatus;

    private LocalDate estimatedDeliveryTime;

    private CurrentLocation currentLocation;

    private Long routeCode;

    private Destination destination;
}
