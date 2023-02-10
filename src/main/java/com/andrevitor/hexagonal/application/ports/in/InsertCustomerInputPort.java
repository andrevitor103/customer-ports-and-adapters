package com.andrevitor.hexagonal.application.ports.in;

import com.andrevitor.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
