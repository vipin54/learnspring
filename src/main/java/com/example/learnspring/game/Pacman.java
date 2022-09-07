package com.example.learnspring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pacman implements GamingConsole {
	public void up() {
		System.out.println("UPSC");
	}
	
	public void down() {
		System.out.println("DOWNSC");
	}
	
	public void left() {
		System.out.println("LEFTSC");
	}
	
	public void right() {
		System.out.println("RIGHTSC");
	}
}
