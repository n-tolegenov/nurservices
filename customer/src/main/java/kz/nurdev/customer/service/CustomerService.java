package kz.nurdev.customer.service;

import kz.nurdev.customer.model.Customer;
import kz.nurdev.customer.repository.CustomerRepository;
import kz.nurdev.customer.request.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.save(customer);

    }
}
