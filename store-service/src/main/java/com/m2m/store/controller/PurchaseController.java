package com.m2m.store.controller;

import com.m2m.core.dto.PurchaseDTO;
import com.m2m.store.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping("")
    public void processPurchase(@RequestBody PurchaseDTO purchaseDTO) {
        purchaseService.processPurchase(purchaseDTO);
    }
}