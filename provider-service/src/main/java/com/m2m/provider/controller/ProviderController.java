package com.m2m.provider.controller;

import com.m2m.core.dto.ProviderDTO;
import com.m2m.provider.domain.Provider;
import com.m2m.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping("/{state}")
    public ProviderDTO findByState(@PathVariable String state) {
        return providerService.findByState(state);
    }
}