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
        return run.getBean(Hero.class);
    }

    public BackpackInterface getBackpack() {
        return run.getBean(BackpackInterface.class);
    }

    public Weapon getWeapon() {
        return run.getBean(Weapon.class);
    }
}
