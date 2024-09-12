package org.customer;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CustomerControllerTest {

    @InjectMocks
    private CustomerController controller;

    @Mock
    private CustomerRepository repository;

    private Customer customer;

   /* @Test
    public void testGetCustomer() {
        when(repository.getOne(any())).thenReturn(customer);

        ResponseEntity<Customer> customerById = controller.getCustomerById(1L);

        Assert.assertNotNull(customerById);
    }
*/
}