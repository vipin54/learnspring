package com.example.learnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.learnspring.game.GameRunner;

@SpringBootApplication
public class LearnspringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnspringApplication.class, args);
		
		GameRunner runner = context.getBean( GameRunner.class);
		
		//GamingConsole game= new SuperContraGame();
		//GameRunner runner = new GameRunner(game);
		runner.runGame();
	}

}
