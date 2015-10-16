package tile;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public abstract class Tile {
	
	protected int X, Y, value = -1;
	protected Color color;
	private Tile prev;
	private Rectangle rectangle;

	public Tile(int X, int Y, Color color){
		this.X = X;
		this.Y = Y;
		this.color = color;
		rectangle = new Rectangle(20,20,color);
	}
	public abstract void moveHere();
	
	public int getX(){
		return X;
	}
	public void setX(int x){
		X = x;
	}
	public int getY(){
		return Y;
	}
	public void setY(int y){
		Y = y;
	}
	public Color getColor(){
		return color;
	}
	public void setColor(Color color){
		this.color = color;
	}
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.value = value;
	}
	public Tile getPrev(){
		return prev;
	}
	public void setPrev(Tile prev){
		this.prev = prev;
	}
	public Rectangle getRectangle() {
		return rectangle;
	}
}
