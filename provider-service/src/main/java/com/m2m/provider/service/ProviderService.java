package com.m2m.provider.service;

import com.m2m.provider.domain.Provider;
import com.m2m.provider.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    public Provider findByState(String state) {
        return providerRepository.findByState(state);
    }
}