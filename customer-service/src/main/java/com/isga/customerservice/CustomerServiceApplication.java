package com.isga.customerservice;

import com.isga.customerservice.entities.Customer;
import com.isga.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(Customer.builder()
                    .name("reda").email("reda@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("aymane").email("aymane@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("omar").email("omar@gmail.com")
                    .build());
            customerRepository.findAll().forEach(customer->{
                System.out.println("==================");
                System.out.println(customer.getId());
                System.out.println(customer.getName());
                System.out.println(customer.getEmail());
                System.out.println("==================");
            });
        };
    }
}