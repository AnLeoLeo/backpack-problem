package com.example.springdota;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BattleField {
    private final ConfigurableApplicationContext run;

    public BattleField(ConfigurableApplicationContext run) {
        this.run = run;
    }

    public Hero getHero() {
        return (Hero)run.getBean("hero");
    }

    public Backpack getBackpack() {
        return (Backpack) run.getBean("backpack");
    }

    public Weapon getWeapon() {
        return (Weapon) run.getBean("weapon");
    }
}
