/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponentePersonalizado1;

import campoTextoBoton.CampoTextoBotonController;
import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author UsuarioDAM
 */
public class Selector extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        SelectorDeslizamiento selectorDeslizamiento = new SelectorDeslizamiento();
        ArrayList<String> items = new ArrayList<String>();
        items.add("Uno");
        items.add("Dos");
        items.add("Tres");
        
        selectorDeslizamiento.setItems(items);
  
        stage.setScene(new Scene(selectorDeslizamiento));
        stage.setTitle("Custom Control");
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

