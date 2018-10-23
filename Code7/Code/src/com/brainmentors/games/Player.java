package com.brainmentors.games;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.brainmentors.games.utils.GameConstants;

public class Player extends Sprite implements GameConstants {

public Player(){
	x = 100;
	
	h = 100;
	w = 100;
	y = FLOOR - h;
	image = new ImageIcon(Player.class.getResource(PLAYER_IMAGE)).getImage();
}

@Override
public void move() {
	x+=speed;
	// TODO Auto-generated method stub
	
}

}
