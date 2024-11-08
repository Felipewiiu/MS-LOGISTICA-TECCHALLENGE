package br.com.mslogistica.ms_logistica.application.validators.deliveryTraking;

import br.com.mslogistica.ms_logistica.domain.entities.DeliveryTraking;
import jakarta.validation.ValidationException;

public class integrityValidateDeliveryTraking implements DeliveryTrakingValidator {
    @Override
    public void validate(DeliveryTraking deliveryTraking) {
        if (deliveryTraking.getDeliveryCode() == null) {
            throw new ValidationException("Delivery code is required");
        }

        if( deliveryTraking.getDeliveryPersonCode() == null ) {
            throw new ValidationException("Delivery person code is required");
        }

        if( deliveryTraking.getDestination() == null ) {
            throw new ValidationException("Destination is required");
        }

    }
}
