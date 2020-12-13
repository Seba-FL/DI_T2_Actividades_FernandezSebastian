/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Sebastián Fernández López
 */
public class AppVisorAnimales extends Application {



    @Override
    public void start(Stage primaryStage) throws IOException {
        StackPane root = new StackPane();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("VisorAnimales.fxml"));
        Parent rootAppAnimales = fXMLLoader.load();
        root.getChildren().add(rootAppAnimales);
        
        VisorAnimalesController visorAnimales = (VisorAnimalesController)fXMLLoader.getController();

        Scene scene = new Scene(root);

        primaryStage.setTitle("Visor Animales!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }

}
