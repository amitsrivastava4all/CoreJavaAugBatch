package com.brainmentors.games;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.brainmentors.games.utils.GameConstants;

public class Board extends JPanel implements GameConstants {
	private ImageIcon bg;
	private Player player;
	private Timer timer;
	Enemy enemies[] = new Enemy[MAX_ENEMIES];
	private void bindEvents(){
		this.addKeyListener(new KeyAdapter(){

			

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Key Press "+e.getKeyCode()+" "+e.getKeyChar());
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){
					player.setSpeed(2);
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT){
					player.setSpeed(-2);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				player.setSpeed(0);
				
			}
			
		});
	}
	private void loadEnemies(){
		int x = 300;
		int speed = 2;
		for(int i = 0 ; i<enemies.length; i++){
			Enemy enemy = new Enemy(x, speed);
			enemies[i] = enemy; 
			x+=200;
			speed+=2;
		}
	}
	private void printEnemies(Graphics g){
		for(Enemy enemy:enemies){
			enemy.draw(g);
			enemy.move();
		}
	}
	public Board(){
		player = new Player();
		loadEnemies();
		setSize(GWIDTH,GHEIGHT);
		 bg = 
				new ImageIcon(Board.class.getResource(BACKGROUND_IMAGE));
		 setFocusable(true);
		 bindEvents();
		 gameLoop();
	}
	private void gameLoop(){
		timer = new Timer(DELAY,(eee)->{
			repaint();
		});
		timer.start();
	}
	private void drawBackGround(Graphics g){
		g.drawImage(bg.getImage(),0,0,GWIDTH,GHEIGHT,null);
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawBackGround(g);
		player.draw(g);
		player.move();
		printEnemies(g);
	}

}
