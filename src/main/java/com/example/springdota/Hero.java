package com.example.springdota;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class Hero {
    @Getter
    private final int id;
    private final String name;
    private final Backpack backpack;
    private final BattleField battleField;

    public Hero(Backpack backpack, BattleField battleField) {
        Random random = new Random();
        id = random.nextInt(100);
        name = "Sven";
        this.backpack = backpack;
        this.battleField = battleField;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public Weapon getWeapon() {
        return battleField.getWeapon();
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", backpack=" + backpack +
                ", weapon=" + battleField.getWeapon() +
                '}';
    }
}
