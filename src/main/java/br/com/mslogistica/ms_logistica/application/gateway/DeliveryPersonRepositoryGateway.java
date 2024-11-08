package br.com.mslogistica.ms_logistica.application.gateway;

import br.com.mslogistica.ms_logistica.domain.entities.DeliveryPerson;

public interface DeliveryPersonRepositoryGateway {

    public DeliveryPerson create(DeliveryPerson deliveryPerson);
}
