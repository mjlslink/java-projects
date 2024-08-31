package org.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepository repository;

    @Autowired
    public CustomerService(CustomerRepository repository){
        this.repository = repository;
    }

    public void save(Customer customer) {
        repository.save(customer);
        repository.flush();
    }

    public void update(Customer customer) {
        Long id = customer.getId();

        if (id != null) {
            repository.save(customer);
        }
    }

    public Optional<Customer> getById(Long id) {
        return Optional.of(repository.getOne(id));
    }

    public void delete(Customer customer) {
        repository.delete(customer);
    }


}
