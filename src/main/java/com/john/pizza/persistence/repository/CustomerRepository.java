package com.john.pizza.persistence.repository;

import com.john.pizza.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends ListCrudRepository<CustomerEntity, String> {

    //JPQL se usan las entidades en lugar de nombres de tablas
    @Query(value = "SELECT c from CustomerEntity  c where c.phoneNumber = :phone")
    CustomerEntity findByPhone(@Param("phone") String phone);
}
