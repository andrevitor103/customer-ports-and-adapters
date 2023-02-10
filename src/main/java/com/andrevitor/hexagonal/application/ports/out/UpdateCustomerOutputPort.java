package com.andrevitor.hexagonal.application.ports.out;

import com.andrevitor.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}
