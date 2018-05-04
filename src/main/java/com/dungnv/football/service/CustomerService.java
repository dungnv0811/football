package com.dungnv.football.service;

import com.dungnv.football.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAll();

    Optional<Customer> findById(String id);

    Customer store(Customer customer);

    void deleteById(String id);
}
