package com.esdo.bepilot.Repository;

import com.esdo.bepilot.Model.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findCustomerById(long id);
}
