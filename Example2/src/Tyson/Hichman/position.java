package Tyson.Hichman;

public class position {

	private int x;
	private int y;
	
	public int getX() {
		return x;
		
	}
	public void setX() {
		this.x = x;
	}
	public int getY() {
		return y;
		
	}
	public void setY() {
		this.y = y;
	}
	
	public position() {
		x = 0;
		y = 0; 
	}
	public position(int x, int y) {
		this.x = x;
		this.y = y; 
	}
	public double distance (position other) {
		
		return Math.sqrt((x - other.x) * (x - other.x)  + (y - other.y) * (y - other.y));
		
	}
}
