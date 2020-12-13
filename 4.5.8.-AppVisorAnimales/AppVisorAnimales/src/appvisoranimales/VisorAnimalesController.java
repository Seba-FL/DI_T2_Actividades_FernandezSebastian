/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import java.net.URL;
import static java.util.Collections.list;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author UsuarioDAM
 */
public class VisorAnimalesController implements Initializable {

    @FXML
    private ListView<Animales> listViewsetItems;
    @FXML
    private ImageView setImageView;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Animales perro = new Animales("Perro", "", "");
        Animales gato = new Animales("Gato", "", "");
        Animales pajaro = new Animales("Pájaro", "", "");

        ObservableList<Animales> animalesList = FXCollections.observableArrayList();
        animalesList.add(perro);
        animalesList.add(gato);
        animalesList.add(pajaro);

        listViewsetItems.setItems(animalesList);
        MultipleSelectionModel<Animales> selectionModel = listViewsetItems.getSelectionModel();
        selectionModel.setSelectionMode(SelectionMode.MULTIPLE);
        selectionModel.selectIndices(0);

        listViewsetItems.getSelectionModel().selectedItemProperty().addListener((property, oldValue, newValue)
                -> {
            ObservableList<Animales> convertedItems = FXCollections.observableList(
                    listViewsetItems.getSelectionModel().getSelectedItems()
                            .stream()
                            .collect(Collectors.toList()));
            String animales;
            animales = listViewsetItems.getSelectionModel().getSelectedItem().toString();
            if(animales == "Perro"){
                setImageView.setImage(new Image("Imagenes/perro.jpg"));
            }else if(animales == "Gato"){
                setImageView.setImage(new Image("Imagenes/gato.jpg"));
            }else if(animales == "Pájaro"){
                setImageView.setImage(new Image("Imagenes/pajaro.jpg"));
            }
            
            
            
        });
    }

}
