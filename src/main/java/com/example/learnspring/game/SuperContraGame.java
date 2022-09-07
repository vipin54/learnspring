package com.example.learnspring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("UPS");
	}
	
	public void down() {
		System.out.println("DOWNS");
	}
	
	public void left() {
		System.out.println("LEFTS");
	}
	
	public void right() {
		System.out.println("RIGHTS");
	}
}
