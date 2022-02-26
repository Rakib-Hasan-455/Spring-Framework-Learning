package org._15_BeansWithFull_JavaConfig_Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBeansConfig {

    @Bean(name = "AddressBean")
    public Address getAddress() {
    return new Address();
}

    @Bean(name = {"CustomerBean", "Temp", "TestCustomerBean"})
    public Customer getCustomer() {
        return new Customer(getAddress());
    }

}
