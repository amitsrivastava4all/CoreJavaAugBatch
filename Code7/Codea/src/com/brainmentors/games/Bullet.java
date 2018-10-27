package com.brainmentors.games;

import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends Sprite {
	private int color;
	public Bullet(int x, int y){
		this.x = x;
		this.y = y;
		this.speed = 10;
		this.w = this.h = 25;
		this.isVisible = true;
		
	}
	
	private void outOfScreen(){
		if(this.x>=GWIDTH){
			this.isVisible = false;
		}
	}
	
	private Color getColor(){
		if(color>4){
			color = 0;
		}
		color++;
		switch(color){
		case 1:
			return Color.BLACK;
		case 2:
			return Color.RED;
		case 3:
			return Color.MAGENTA;
		case 4:
			return Color.CYAN;
		default:
			return Color.GREEN;
		}
		
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		x+=speed;
	}
	
	public void drawBullet(Graphics g){
		g.setColor(getColor());
		g.fillOval(x,y,w,h);
		move();
	}

}
