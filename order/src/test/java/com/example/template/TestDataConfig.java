package com.example.template;

import contracttest.domain.Order;
import contracttest.domain.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestDataConfig {

    @Bean
    public CommandLineRunner initData(OrderRepository repository) {
        return args -> {
            Order order = new Order();
            repository.save(order);
        };
    }
}
