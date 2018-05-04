package com.dungnv.football.controller;

import com.dungnv.football.domain.Customer;
import com.dungnv.football.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {
    public static final String BASE_URL="api/v1/customers";

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> getAll() {
        return customerService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Customer findCustomer(@PathVariable(value = "id") String id) {
        Optional<Customer> customer = customerService.findById(id);
        if (customer.isPresent()) {
            return customer.get();
        }
        return new Customer();
    }

    @PostMapping
    public Customer store(@RequestBody Customer customer) {
        return customerService.store(customer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable(value = "id") String id) {
        customerService.deleteById(id);
    }
}
