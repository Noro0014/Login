package dad.login;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Controller controller = new Controller();
		
		primaryStage.setTitle("Login App");
		primaryStage.setScene(new Scene(controller.getView(), 320, 200));
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
