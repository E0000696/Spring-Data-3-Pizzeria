package com.john.pizza.service;

import com.john.pizza.persistence.entity.CustomerEntity;
import com.john.pizza.persistence.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerEntity findByPhone(String phone){
     return   this.customerRepository.findByPhone(phone);
    }
}
