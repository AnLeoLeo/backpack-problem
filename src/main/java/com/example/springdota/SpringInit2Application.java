package com.example.springdota;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class SpringInit2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringInit2Application.class, args);

		BattleField battleField = (BattleField) run.getBean("battleField");

		log.info(battleField.getBackpack().toString());
		log.info(battleField.getWeapon().toString());
		log.info(battleField.getHero().toString());
		log.info(battleField.getBackpack().toString());
		log.info(battleField.getWeapon().toString());
		log.info(battleField.getHero().toString());
		log.info(battleField.getBackpack().toString());
		log.info(battleField.getWeapon().toString());
	}

}
