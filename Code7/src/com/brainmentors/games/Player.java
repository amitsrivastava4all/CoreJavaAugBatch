package com.brainmentors.games;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.brainmentors.games.utils.GameConstants;

public class Player implements GameConstants {
private int x;
private int y;
private int w;
private int h;
private Image image;
public Player(){
	x = 100;
	
	h = 100;
	w = 100;
	y = FLOOR - h;
	image = new ImageIcon(Player.class.getResource(PLAYER_IMAGE)).getImage();
}
public void drawPlayer(Graphics g){
	g.drawImage(image, x, y,w,h,null);
}
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
