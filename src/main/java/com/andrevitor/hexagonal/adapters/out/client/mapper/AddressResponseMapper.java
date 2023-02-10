package com.andrevitor.hexagonal.adapters.out.client.mapper;

import com.andrevitor.hexagonal.adapters.out.client.response.AddressResponse;
import com.andrevitor.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
