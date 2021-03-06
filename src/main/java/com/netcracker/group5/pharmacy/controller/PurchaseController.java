package com.netcracker.group5.pharmacy.controller;

import com.netcracker.group5.pharmacy.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@CrossOrigin
@Controller
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/buy")
    public ResponseEntity<?> performPurchase(@RequestParam("id") List<Long> purchaseItemIdList) {
        List<Long> acceptedPurchasesIdList = purchaseService.performPurchase(purchaseItemIdList);

        return ResponseEntity.ok(acceptedPurchasesIdList);
    }
}
