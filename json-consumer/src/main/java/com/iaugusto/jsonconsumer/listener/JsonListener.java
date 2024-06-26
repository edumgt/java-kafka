package com.iaugusto.jsonconsumer.listener;

import com.iaugusto.jsonconsumer.model.Payment;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static java.lang.Thread.sleep;

@Component
@RequiredArgsConstructor
@Log4j2
public class JsonListener {

    @KafkaListener(
            topics = "payment-topic",
            groupId = "create-group",
            containerFactory = "jsonContainerFactory"
    )
    @SneakyThrows
    public void antiFraud(@Payload Payment payment) {
        log.info("Recebi o pagamento {}", payment.toString());
        sleep(2000);

        log.info("Validando fraude...");
        sleep(2000);

        log.info("Compra aprovada...");
        sleep(2000);
    }

    @KafkaListener(
            topics = "payment-topic",
            groupId = "pdf-group",
            containerFactory = "jsonContainerFactory"
    )
    @SneakyThrows
    public void pdfGenerator(@Payload Payment payment) {
        sleep(3000);
        log.info("Gerando PDF do produto de id {} ...", payment.getId());
        sleep(3000);
    }

    @KafkaListener(
            topics = "payment-topic",
            groupId = "email-group",
            containerFactory = "jsonContainerFactory"
    )
    @SneakyThrows
    public void sendEmail() {
        sleep(3000);
        log.info("Enviando email de confirmação...");
    }
}
