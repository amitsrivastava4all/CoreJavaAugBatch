package com.brainmentors.games;

import javax.swing.JFrame;

import com.brainmentors.games.utils.GameConstants;

public class GameFrame extends JFrame implements GameConstants {
	public GameFrame(){
		setSize(GWIDTH, GHEIGHT);
		
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		Board board = new Board();
		add(board);
		setVisible(true);
	}
	public static void main(String[] args) {
		GameFrame obj =new GameFrame();
		
	}
}
