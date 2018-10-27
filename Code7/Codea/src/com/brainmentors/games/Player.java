package com.brainmentors.games;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.brainmentors.games.utils.GameConstants;

public class Player extends Sprite implements GameConstants {

	private ArrayList<Bullet> bullets = new ArrayList<>();
	private int force ;
	private boolean isJump;
	public void jump(){
		if(!isJump){
		force = -20;
		y+=force;
		isJump = true;
		}
	}
	public void fall(){
		if(y<(FLOOR - h)){
			force +=GRAVITY;
			y+=force;
		}
		if(y>=(FLOOR-h)){
			y= FLOOR-h;
			isJump = false;
		}
	}
	
public ArrayList<Bullet> getBullets() {
		return bullets;
	}

	public void setBullets(ArrayList<Bullet> bullets) {
		this.bullets = bullets;
	}

public Player(){
	x = 100;
	
	h = 100;
	w = 100;
	y = FLOOR - h;
	image = new ImageIcon(Player.class.getResource(PLAYER_IMAGE)).getImage();
}

public void fire(){
	bullets.add(new Bullet((this.x + (this.getW())/2), (this.y + (this.getH())/2)));
}

@Override
public void move() {
	x+=speed;
	// TODO Auto-generated method stub
	
}

}
