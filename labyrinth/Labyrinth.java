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
		
		ImportLabyrinth importLab = new ImportLabyrinth(primaryStage);
		CreateLabyrinth createLab = new CreateLabyrinth(importLab.getLabyrinthFile());
		ShowLabyrinth showLab = new ShowLabyrinth(gPane, createLab);
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args){
		launch(args);
	}

}
