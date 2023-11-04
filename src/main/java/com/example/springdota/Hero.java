package com.example.springdota;

import lombok.Getter;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class Hero {
    @Getter
    private final int id;
    private final String name;
    private final BackpackInterface backpack;
    private final ObjectFactory<Weapon> weaponFactory;

    public Hero(BackpackInterface backpack, ObjectFactory<Weapon> weaponFactory) {
        Random random = new Random();
        id = random.nextInt(100);
        name = "Sven";
        this.backpack = backpack;
        this.weaponFactory = weaponFactory;
    }

    public BackpackInterface getBackpack() {
        return backpack;
    }

    public Weapon getWeapon() {
        System.out.println("check how many times i've called getting weapon method");
        return weaponFactory.getObject();
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", backpack=" + backpack +
                ", weapon=" + getWeapon() +
                '}';
    }
}
