
public class Player {
 private int xAxis; // Instance Variables
 private int yAxis;
 private int height;
 private int width;
 private int speed;
 private String name;
 private String gameName;
 private Player() {
	 gameName = "Game-2018";
	 System.out.println("I am Default Constructor");
 }
 public Player(int xAxis, int yAxis, int height, int width) {
	 this();
	 System.out.println("I am 4 Param Constructor...");
	 this.xAxis= xAxis;
	 this.yAxis = yAxis;
	 this.height = height;
	 this.width = width;
 }
 
 
 
// public void setSpeed(int speed) {
//	 if(speed>0) {
//	 this.speed = speed;
//	 }
// }
// 
// public int getSpeed() {
//	 return speed;
// }
 
 public int getxAxis() {
	return xAxis;
}
public void setxAxis(int xAxis) {
	this.xAxis = xAxis;
}
public int getyAxis() {
	return yAxis;
}
public void setyAxis(int yAxis) {
	this.yAxis = yAxis;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	if(speed>0) {
	this.speed = speed;
	}
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGameName() {
	return gameName;
}
public void setGameName(String gameName) {
	this.gameName = gameName;
}
public Player(int xAxis, int yAxis, int height, int width, int speed, String name) {
	 this(xAxis,yAxis,height,width);
	 System.out.println("I am 6 Param Constructor...");
//	 this.xAxis= xAxis;
//	 this.yAxis = yAxis;
//	 this.height = height;
//	 this.width = width;
	 this.speed = speed ;
	 this.name = name;
 }
 /*public void Player() {
	 gameName = "Sept Game-2018";
	 System.out.println("I am Method");
 }*/
 
// public Player(){
//	 
// }

 /*
 public void initalizePlayer(int xAxis, int yAxis , int width, int height, int speed , String name) {
	 if(xAxis>0 && yAxis>0 && width>0 && height>0 && speed>0) {
	 this.xAxis = xAxis;  // Instance Var = Local Var
	 this.yAxis = yAxis;
	 this.height = height;
	 this.width = width;
	 this.speed = speed;
	 this.name = name;
	 }
	 else {
		 System.out.println("Invalid Inputs...");
	 }
 }*/
 
 public void print() {
	 // copy this 
	 System.out.println("Game Name is "+gameName);
	 System.out.println("X "+this.xAxis);
		System.out.println("Y "+yAxis);
		System.out.println("Width "+width);
		System.out.println("Height "+height);
		System.out.println("Speed "+speed);
		System.out.println("Name "+name);
 }
 
 
}
