package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	
	public static void main(String[] args) {
	     launch(args);		

		}

		@Override
		public void start(Stage primaryStage) throws Exception {
			BankInsideUserInterface flowpane= new BankInsideUserInterface();
			flowpane.setUIControls(flowpane, primaryStage);
			Scene scene=new Scene(flowpane,500,800);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}

		
	}