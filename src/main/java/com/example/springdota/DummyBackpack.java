package com.example.springdota;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Component
@Scope("prototype")
public class DummyBackpack implements BackpackInterface {
    private final int id;

    public DummyBackpack() {
        id = 672347;
    }

    @Override
    public String toString() {
        return "DummyBackpack{" +
                "DummyBackpack version=" + getId() +
                '}';
    }
}
