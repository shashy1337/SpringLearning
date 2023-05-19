package ru.shashy.openfeigntesting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.shashy.openfeigntesting.Model.Payments;
import ru.shashy.openfeigntesting.Proxy.PaymentsProxy;
import ru.shashy.openfeigntesting.Service.StoreService;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class PaymentsController {
    private final PaymentsProxy paymentsProxy;
    private final StoreService storeService;
    private final Logger logger = Logger.getLogger(PaymentsController.class.getName());

    public PaymentsController(PaymentsProxy paymentsProxy, StoreService storeService){
        this.paymentsProxy = paymentsProxy;
        this.storeService = storeService;
    }

    @PostMapping("/payments")
    public Payments createPayment(@RequestBody Payments payments){
        var pay = paymentsProxy.createPayment(payments);
        storeService.storeData(pay);
        logger.info(String.format("Payments id: %s, payments amount: %s", pay.getId(), pay.getAmount()));
        return pay;
    }

    @GetMapping("/listpayments")
    public List<Payments> getAllPayments(){
        return storeService.getPayments();
    }
}
