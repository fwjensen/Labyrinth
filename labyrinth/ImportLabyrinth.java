package labyrinth;

import java.io.File;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ImportLabyrinth {
	
	private File labyrinthFile;

	public ImportLabyrinth(Stage stage){
		FileChooser FC = new FileChooser();
		labyrinthFile = FC.showOpenDialog(stage);
	}

	public File getLabyrinthFile(){
		return labyrinthFile;
	}
}
