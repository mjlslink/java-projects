package org.customer;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CustomerControllerTest {

    @InjectMocks
    private CustomerController controller;

    @Mock
    private CustomerRepository repository;

    @Mock
    private Optional<Customer> customer;

    @Test
    public void testGetCustomer() {
        Long id = 1L;

        when(repository.findById(id)).thenReturn(customer);

        ResponseEntity<Customer> customerById = controller.getCustomerById(id);

        Assert.assertNotNull(customerById);
    }

}