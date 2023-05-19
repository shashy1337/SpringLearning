package ru.shashy.purchaseexercise.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.shashy.purchaseexercise.Model.InfoModel;
import ru.shashy.purchaseexercise.Model.Purchase;
import ru.shashy.purchaseexercise.Repository.PurchaseRepository;

import java.util.List;


@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    private final PurchaseRepository purchaseRepository;

    public PurchaseController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @PostMapping
    public ResponseEntity<InfoModel> storePurchase(@RequestBody Purchase purchase){
        InfoModel infoModel = new InfoModel();
        purchaseRepository.storePurchase(purchase);
        infoModel.setMessage("Product Added from body");
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(infoModel);
    }

    @GetMapping
    public List<Purchase> findPurchases(){
        return purchaseRepository.findAllPurchases();
    }

}
