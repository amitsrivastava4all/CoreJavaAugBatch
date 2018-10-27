package com.brainmentors.games;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.brainmentors.games.utils.GameConstants;

public class Board extends JPanel implements GameConstants {
	private ImageIcon bg;
	private Player player;
	private Timer timer;
	Enemy enemies[] = new Enemy[MAX_ENEMIES];
	
	private void printBullets(Graphics g){
		for(Bullet bullet : player.getBullets()){
			if(bullet.isVisible){
			bullet.drawBullet(g);
			}
		}
	}
	private void drawTarget(Graphics g){
		g.drawImage(target, this.currentX, this.currentY, 100,100,null);
	}
	Image target;
	private void loadTarget(){
		target = new ImageIcon(Board.class.getResource(TARGET_IMG)).getImage();
				
	}
	private int currentX ;
	private int currentY;
	
	private void bindEvents(){
		this.addMouseMotionListener(new MouseMotionAdapter() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				Board.this.currentX = e.getX();
				Board.this.currentY = e.getY();
				
				
			}
			
			
		});
		this.addMouseListener(new MouseAdapter() {
			
			
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		this.addKeyListener(new KeyAdapter(){

			

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Key Press "+e.getKeyCode()+" "+e.getKeyChar());
				if(e.getKeyCode()==KeyEvent.VK_J){
					player.jump();
				}
				if(e.getKeyCode()==KeyEvent.VK_SPACE){
					player.fire();
				}
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){
					player.setSpeed(7);
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT){
					player.setSpeed(-7);
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
		this.currentX = GWIDTH/2;
		this.currentY = GHEIGHT/2;
		loadTarget();
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
			player.fall();
		});
		timer.start();
	}
	private void gameOver(Graphics g){
		g.setFont(new Font("Times",Font.BOLD,40));
		g.setColor(Color.RED);
		g.drawString("Game Over", GWIDTH/2-10, GHEIGHT/2);
		timer.stop();
	}
	
	private boolean isCollide(Enemy enemy, Player player){
		int xDistance = Math.abs(enemy.getX() - player.getX());
		int yDistance = Math.abs(enemy.getY() - player.getY());
		int maxW = Math.max(enemy.getW(), player.getW());
		int maxH = Math.max(enemy.getH(), player.getH());
		return xDistance<=maxW-30 && yDistance<=maxH-30;
	}
	private void  detectCollision(Graphics g){
		for(Enemy enemy:enemies){
			if(isCollide(enemy,player)){
				gameOver(g);
				break;
			}
		}
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
		
		detectCollision(g);
		printBullets(g);
		drawTarget(g);
	}

}
