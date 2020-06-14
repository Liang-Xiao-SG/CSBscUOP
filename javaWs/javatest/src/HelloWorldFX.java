import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloWorldFX extends Application {
	public void start(Stage stage) {
		Label message = new Label("First FX Application!");
		message.setFont(new Font(40));
		Button helloButton = new Button("Say Hello");
		helloButton.setOnAction(e -> message.setText("Hello World!"));
		Button goodbyeButton = new Button("Say Goodbye");
		goodbyeButton.setOnAction(e -> message.setText("Goodbye!!"));
		Button quitButton = new Button("Quit");
		quitButton.setOnAction(e -> Platform.exit());
		HBox buttonBar = new HBox(20, helloButton, goodbyeButton, quitButton);
		buttonBar.setAlignment(Pos.CENTER);
		BorderPane root = new BorderPane();
		root.setCenter(message);
		root.setBottom(buttonBar);
		Scene scene = new Scene(root, 450, 200);
		stage.setScene(scene);
		stage.setTitle("JavaFX Test");
		stage.show();
//		Color d=new Color(red, green, blue, opacity);
	} // end start();

	public static void main(String[] args) {
		launch(args); // Run this Application.
	}

	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
	}
	
	
} // end class HelloWorldFX