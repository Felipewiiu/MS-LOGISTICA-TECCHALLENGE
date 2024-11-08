package br.com.mslogistica.ms_logistica.domain.enums;

public enum DeliveryStatus {
    ENTREGUE(0),
    AGUARDANDO_ROTA(1),
    AGUARDANDO_COLETA(2),
    SAIU_PARA_ENTRAGA(3);

    private final int value;

    DeliveryStatus(int value) {
        this.value = value;
    }
}
