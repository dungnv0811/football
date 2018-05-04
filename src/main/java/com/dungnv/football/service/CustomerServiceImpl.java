package com.dungnv.football.service;

import com.dungnv.football.domain.Customer;
import com.dungnv.football.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer store(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteById(String id) {
        customerRepository.deleteById(id);
    }
}
