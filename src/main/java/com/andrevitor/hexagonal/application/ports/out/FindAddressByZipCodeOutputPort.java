package com.andrevitor.hexagonal.application.ports.out;

import com.andrevitor.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipcode);

}
