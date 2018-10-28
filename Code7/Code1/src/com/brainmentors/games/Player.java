package com.brainmentors.games;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import com.brainmentors.games.utils.GameConstants;

public class Player extends Sprite implements GameConstants, PlayerConstants {
	private BufferedImage image;

	private ArrayList<Bullet> bullets = new ArrayList<>();
	private int force ;
	private boolean isJump;
	private int state;
	
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
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
	@Override
public void draw(Graphics g){
	if(this.state == WALK){
		drawWalk(g);
	}
	else
	if(this.state == PUNCH){	
		drawPunch(g);
	}
}

	public void setBullets(ArrayList<Bullet> bullets) {
		this.bullets = bullets;
	}
	BufferedImage walk[] = new BufferedImage[4];
	private void loadWalk(){
		walk[0] = image.getSubimage(38,121,61,100);
		walk[1] = image.getSubimage(111,127,68,94);
		walk[2] = image.getSubimage(190,127,66,94);
		walk[3] = image.getSubimage(270,128,66,93);
	}
	int walkIndex = 0;
	int walkPass = 0;
	private void drawWalk(Graphics g){
		g.drawImage(walk[walkIndex], x,y,w,h,null);
		if(walkPass==4){
			walkIndex++;
			walkPass=0;
		}
		
		walkPass++;
		if(walkIndex>=3){
			walkIndex = 0;
			walkPass=0;
		}
	}
	
	BufferedImage punch[] = new BufferedImage[5];
	
	private void loadPunch(){
		punch[0] = image.getSubimage(27,823,65,94);
		punch[1] = image.getSubimage(107,823,71,94);
		punch[2] = image.getSubimage(190,823,109,93);
		punch[3] = image.getSubimage(310,822,80,93);
		punch[4] = image.getSubimage(404,822,103,93);
	}
	int punchIndex = 0;
	int punchPass = 0;
	private void drawPunch(Graphics g){
		g.drawImage(punch[punchIndex], x,y,w,h,null);
		if(punchPass==4){
			punchIndex++;
			punchPass=0;
		}
		punchPass++;
		if(punchIndex>=4){
			punchIndex = 0;
			walkIndex = 0;
			state = WALK;
			punchPass=0;
			
		}
	}
	private void loadKick(){
		
	}

public Player(){
	state = WALK;
	
	x = 100;
	
	h = 100;
	w = 100;
	y = FLOOR - h;
	//image = new ImageIcon(Player.class.getResource(PLAYER_IMAGE)).getImage();
	try {
		image = ImageIO.read(Player.class.getResource(PLAYER_IMAGE));
		loadWalk();
		loadPunch();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
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
