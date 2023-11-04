package com.example.springdota;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class BattleFieldTest {

    @Autowired
    BattleField battleField;

    @Test
    void testGetHeroWithUniqueWeapon() {
        BackpackInterface b1 = battleField.getBackpack();
        Weapon w1 = battleField.getWeapon();
        Hero h1 = battleField.getHero();
        BackpackInterface b2 = battleField.getBackpack();
        Weapon w2 = battleField.getWeapon();
        Hero h2 = battleField.getHero();
        BackpackInterface b3 = battleField.getBackpack();
        Weapon w3 = battleField.getWeapon();

        Assert.isInstanceOf(Hero.class, h1);
        Assert.isInstanceOf(Hero.class, h2);
        Assert.isInstanceOf(Backpack.class, b1);
        Assert.isInstanceOf(Backpack.class, b2);
        Assert.isInstanceOf(Backpack.class, b3);
        Assert.isInstanceOf(Weapon.class, w1);
        Assert.isInstanceOf(Weapon.class, w2);
        Assert.isInstanceOf(Weapon.class, w3);

        Assert.isTrue(h1.getId() == h2.getId(), "Идентификаторы героев не равны");
        Assert.isTrue(h1.equals(h2), "Герои не равны");

        checkIsUnique("объектов рюкзаков", b1.hashCode(), b2.hashCode(), b3.hashCode());
        checkIsUnique("идентификаторов рюкзаков", b1.getId(), b2.getId(), b3.getId());

        checkIsUnique("объектов оружия", w1.hashCode(), w2.hashCode(), w3.hashCode());
        checkIsUnique("идентификаторов оружия", w1.getId(), w2.getId(), w3.getId());

        Assert.isTrue(h1.getBackpack().getId() == h2.getBackpack().getId(), "Герою подменили рюкзак");
        Assert.isTrue(h1.getWeapon().getId() != h2.getWeapon().getId(), "Герой уже воспользовался оружием");
    }

    void checkIsUnique(String message, Integer ...items) {
        List<Integer> list = Arrays.asList(items);
        int distinct = list.stream().distinct().toList().size();
        Assert.isTrue(distinct == list.size(), "Уникальных " + message + " не " + list.size() + ", а " + distinct);
    }
}