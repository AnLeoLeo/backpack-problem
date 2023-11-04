package com.example.springdota;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
    @Bean
    @Scope("prototype")
    public BackpackInterface getDummyBackpack() {
        return new DummyBackpack();
    }

    @Bean
    @Primary
    @Scope("prototype")
    public BackpackInterface getBackpack() {
        return new Backpack();
    }
}
