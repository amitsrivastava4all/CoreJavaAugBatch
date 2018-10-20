package com.brainmentors.games;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.brainmentors.games.utils.GameConstants;

public class Board extends JPanel implements GameConstants {
	private ImageIcon bg;
	private Player player;
	public Board(){
		player = new Player();
		setSize(GWIDTH,GHEIGHT);
		 bg = 
				new ImageIcon(Board.class.getResource(BACKGROUND_IMAGE));
		
	}
	private void drawBackGround(Graphics g){
		g.drawImage(bg.getImage(),0,0,GWIDTH,GHEIGHT,null);
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawBackGround(g);
		player.drawPlayer(g);
	}

}
