package com.brainmentors.games;

import java.awt.Graphics;
import java.awt.Image;

import com.brainmentors.games.utils.GameConstants;

public abstract class Sprite implements GameConstants {
	protected int speed;
	protected int x;
	protected int y;
	protected int w;
	protected int h;
	protected Image image;
	protected boolean isVisible;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void draw(Graphics g){
		g.drawImage(image, x, y,w,h,null);
		
	}
	public abstract void move();
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}

}
