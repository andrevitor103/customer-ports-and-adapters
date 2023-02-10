package com.andrevitor.hexagonal.config;

import com.andrevitor.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.andrevitor.hexagonal.adapters.out.InsertCustomerAdapter;
import com.andrevitor.hexagonal.adapters.out.SendCpfForValidationAdapter;
import com.andrevitor.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }

}
