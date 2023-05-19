package ru.shashy.restfulexceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {
    private final PaymentService paymentService;
    private final Logger loggerController
            = Logger.getLogger(PaymentController.class.getName());

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(@RequestBody PaymentDetails paymentDetails){
        loggerController.info(String.format("Amount payment: %d", paymentDetails.getAmount()));

        if (paymentDetails.getAmount() < 100) {
            paymentService.processPayment();
        }

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
