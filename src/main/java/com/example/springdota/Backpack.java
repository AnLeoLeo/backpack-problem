package com.example.springdota;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Getter
@Component
@Scope("prototype")
public class Backpack implements BackpackInterface {
    private final int id;

    public Backpack() {
        Random random = new Random();
        id = random.nextInt(100);
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "Backpack version=" + getId() +
                '}';
    }
}
