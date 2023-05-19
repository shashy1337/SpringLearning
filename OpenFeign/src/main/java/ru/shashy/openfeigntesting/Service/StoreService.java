package ru.shashy.openfeigntesting.Service;

import org.springframework.stereotype.Service;
import ru.shashy.openfeigntesting.Model.Payments;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreService {
    private List<Payments> payments = new ArrayList<>();


    public void storeData(Payments data){
        payments.add(data);
    }

    public List<Payments> getPayments() {
        return payments;
    }

    public void setPayments(List<Payments> payments) {
        this.payments = payments;
    }
}
