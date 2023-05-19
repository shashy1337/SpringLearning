package ru.shashy.openfeigntesting.Proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.shashy.openfeigntesting.Model.Payments;

@FeignClient(name = "payments", url = "${name.service.url}")
public interface PaymentsProxy {

    @PostMapping("/payments")
    Payments createPayment(@RequestBody Payments payments);
}
