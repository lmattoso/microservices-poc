package com.m2m.provider.controller;

import com.m2m.provider.domain.Provider;
import com.m2m.provider.service.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    private ProviderService providerService;

    @GetMapping("/{state}")
    public Provider findByState(@RequestParam String state) {
        return providerService.findByState(state);
    }
}
