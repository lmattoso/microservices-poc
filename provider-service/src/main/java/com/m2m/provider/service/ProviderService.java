package com.m2m.provider.service;

import com.m2m.core.dto.ProviderDTO;
import com.m2m.provider.mapper.ProviderMapper;
import com.m2m.provider.repository.ProviderRepository;
import org.springframework.stereotype.Service;

@Service
public class ProviderService {

    private final ProviderRepository providerRepository;
    private final ProviderMapper providerMapper;

    public ProviderService(ProviderRepository providerRepository, ProviderMapper providerMapper) {
        this.providerRepository = providerRepository;
        this.providerMapper = providerMapper;
    }

    public ProviderDTO findByState(String state) {
        return providerRepository.findByState(state).map(providerMapper::entityToDTO)
            .orElseThrow(() -> new RuntimeException("Provider not found!"));
    }
}