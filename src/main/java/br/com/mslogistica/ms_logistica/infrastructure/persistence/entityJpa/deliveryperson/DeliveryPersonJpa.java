package br.com.mslogistica.ms_logistica.infrastructure.persistence.entityJpa.deliveryperson;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "deliveryPerson")
@Table(name = "ENTREGADOR")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DeliveryPersonJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PersonCode;

    private String name;

    private String CPF;

    private String phoneNumber;

    public DeliveryPersonJpa(String name, String CPF, String phoneNumber) {
        this.name = name;
        this.CPF = CPF;
        this.phoneNumber = phoneNumber;
    }
}
