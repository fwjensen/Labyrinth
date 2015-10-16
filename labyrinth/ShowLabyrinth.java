package labyrinth;

import javafx.scene.layout.GridPane;
import tile.Tile;

public class ShowLabyrinth {
	
	
	public ShowLabyrinth(GridPane gPane, CreateLabyrinth createLab){
		Tile[][] tiles = createLab.getTiles();
		for (int y = 0; y < createLab.getHEIGHT(); y++) {
			for (int x = 0; x < createLab.getWIDTH(); x++) {
				gPane.add(tiles[x][y].getRectangle(), x, y);
			}
		}
	}
}
