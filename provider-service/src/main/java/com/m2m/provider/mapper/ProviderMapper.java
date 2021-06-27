package com.m2m.provider.mapper;


import com.m2m.core.dto.ProviderDTO;
import com.m2m.provider.domain.Provider;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE )
public interface ProviderMapper {
    ProviderDTO entityToDTO(Provider provider);
}
