package com.m2m.provider.repository;

import com.m2m.provider.domain.Provider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {
    Optional<Provider> findByState(String state);
}