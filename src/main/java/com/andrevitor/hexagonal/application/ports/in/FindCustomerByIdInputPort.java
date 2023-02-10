package com.andrevitor.hexagonal.application.ports.in;

import com.andrevitor.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
