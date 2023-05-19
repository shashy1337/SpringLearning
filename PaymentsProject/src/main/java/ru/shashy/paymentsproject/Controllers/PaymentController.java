package ru.shashy.paymentsproject.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.shashy.paymentsproject.Model.Payments;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentController {

    private final Logger logger
            = Logger.getLogger(PaymentController.class.getName());

    @PostMapping("/payments")
    public ResponseEntity<Payments> createPayment(
            @RequestBody Payments payments){

        payments.setId(UUID.randomUUID().toString());
        payments.setDateCreation(LocalDateTime.now().toString());
        logger.info(String.format("Amount info {ID : %s, amount : %s", payments.getId(), payments.getAmount()));

        return ResponseEntity.
                status(HttpStatus.OK)
                .body(payments);
    }
}
