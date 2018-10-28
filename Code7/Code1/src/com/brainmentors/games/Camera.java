package com.brainmentors.games;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Camera extends Sprite {
	private BufferedImage background;
	//private GameFrame frame;
	//public Camera(GameFrame frame){
	public Camera(){
		loadBackGround();
		x = 0;
		//this.frame = frame;
		y = 0;
		w = GWIDTH;
		h = GHEIGHT;
		speed = 6;
	}
	private void loadBackGround(){
		try {
			background = ImageIO.read(Camera.class.getResource(BACKGROUND_IMAGE));
		} catch (IOException e) {
			JOptionPane.showMessageDialog(GameFrame.frame, "Game Assets Not Found , Can't Load this Game");
			// TODO Auto-generated catch block
			e.printStackTrace();
			GameFrame.frame.setVisible(false);
			GameFrame.frame.dispose();
			//this.frame.setVisible(false);
			//this.frame.dispose();
		}
	}
	public void drawBackGround(Graphics g){
		BufferedImage subImage = background.getSubimage(x, y, GWIDTH, GHEIGHT);
		g.drawImage(subImage, 0, 0, GWIDTH, GHEIGHT,null);
	}

	@Override
	public void move() {
		x+=speed;
		
		// TODO Auto-generated method stub
		
	}
	

}
