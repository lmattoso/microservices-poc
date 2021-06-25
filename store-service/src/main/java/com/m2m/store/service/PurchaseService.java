package com.m2m.store.service;

import com.m2m.core.dto.ProviderDTO;
import com.m2m.core.dto.PurchaseDTO;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PurchaseService {

    public void processPurchase(PurchaseDTO purchaseDTO) {
        RestTemplate restTemplate = new RestTemplate();
        ProviderDTO provider = restTemplate.exchange("http://localhost:8081/provider/" + purchaseDTO.getAddress().getState(),
            HttpMethod.GET,
            null,
            ProviderDTO.class)
            .getBody();
    }
}