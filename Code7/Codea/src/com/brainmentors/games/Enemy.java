package com.brainmentors.games;

import javax.swing.ImageIcon;

public class Enemy extends Sprite {
	
	public Enemy(int x, int speed){
		this.x = x;
		y = 100;
		h = w = 100;
		this.speed = speed;
		image = new ImageIcon(Enemy.class.getResource(ENEMY_IMAGE)).getImage();
	}
	
	@Override
	public void move() {
		y+=speed;
		if(y>GHEIGHT){
			y = 0;
		}
		// TODO Auto-generated method stub
		
	}
	
	

}
