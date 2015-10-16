package labyrinth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.scene.paint.Color;
import tile.*;

public class CreateLabyrinth {
	
	private int HEIGHT, WIDTH;
	private Tile[][] tiles;

	public CreateLabyrinth(File labyrinthFile) throws FileNotFoundException{
		Scanner in = new Scanner(labyrinthFile);
		
		WIDTH = in.nextInt();
		HEIGHT = in.nextInt();
		in.nextLine(); // To get to the next line;
		
		tiles = new Tile[WIDTH][HEIGHT];
		
		String Line;
		
		for (int y = 0; y < HEIGHT; y++){
			Line = in.nextLine();
			for (int x = 0; x < WIDTH; x++){
				switch(Line.charAt(x)){
				case ' ': tiles[x][y] = new Road(x, y, Color.WHITE); break;
				case '*': tiles[x][y] = new Wall(x, y, Color.BLACK); break;
				case 'S': tiles[x][y] = new Start(x, y, Color.LIMEGREEN); break;
				case 'E': tiles[x][y] = new Goal(x, y, Color.RED); break;
				}
			}
		}
		in.close();
	}

	public int getHEIGHT(){
		return HEIGHT;
	}
	public int getWIDTH(){
		return WIDTH;
	}
	public Tile[][] getTiles(){
		return tiles;
	}
}
