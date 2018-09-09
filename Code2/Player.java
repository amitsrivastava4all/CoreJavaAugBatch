
public class Player {
 private int xAxis; // Instance Variables
 private int yAxis;
 private int height;
 private int width;
 private int speed;
 private String name;
 
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
 }
 
 public void print() {
	 // copy this 
	 System.out.println("X "+this.xAxis);
		System.out.println("Y "+yAxis);
		System.out.println("Width "+width);
		System.out.println("Height "+height);
		System.out.println("Speed "+speed);
		System.out.println("Name "+name);
 }
 
 
}
