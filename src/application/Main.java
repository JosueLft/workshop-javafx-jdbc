package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Scene mainScene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml")); // instanciando o objeto com o caminho da view
			ScrollPane scrollPane = loader.load(); // carregando a view
			
			scrollPane.setFitToHeight(true); // comando de ajuste de tamanho total do componente
			scrollPane.setFitToWidth(true);
			
			mainScene = new Scene(scrollPane); // instanciando a cena passando o objeto
			primaryStage.setScene(mainScene); // setando a cena especifica como cena principal
			primaryStage.setTitle("Sample JavaFX application");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Scene getMainScene() {
		return mainScene;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
