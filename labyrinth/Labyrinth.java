package labyrinth;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import tile.*;

public class Labyrinth extends Application {

	public Labyrinth(){
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		GridPane gPane = new GridPane();
		Scene scene = new Scene(gPane);
		
		//Opens up a filechooser so that you can open a labyrint that you have made.
		ImportLabyrinth importLab = new ImportLabyrinth(primaryStage);
		//Creates that file into a Tile array.
		CreateLabyrinth createLab = new CreateLabyrinth(importLab.getLabyrinthFile());
		//Adds that Tile array to the gridpane and scene so it shows up on screen.
		ShowLabyrinth showLab = new ShowLabyrinth(gPane, createLab);
		//next add a solve this labyrint file.
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args){
		launch(args);
	}

}
