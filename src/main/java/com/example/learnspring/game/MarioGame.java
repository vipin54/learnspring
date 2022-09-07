package com.example.learnspring.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("UP");
	}
	
	@Override
	public void down() {
		System.out.println("DOWN");
	}
	
	@Override
	public void left() {
		System.out.println("LEFT");
	}
	
	@Override
	public void right() {
		System.out.println("RIGHT");
	}
}
