/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

/**
 *
 * @author UsuarioDAM
 */
public class Animales {

    String nameAnimal;
    String imageMiniature;
    String imageBig;

    public Animales(String nameAnimal, String imageMiniature, String imageBig) {
        this.nameAnimal = nameAnimal;
        this.imageMiniature = imageMiniature;
        this.imageBig = imageBig;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getImageMiniature() {
        return imageMiniature;
    }

    public void setImageMiniature(String imageMiniature) {
        this.imageMiniature = imageMiniature;
    }

    public String getImageBig() {
        return imageBig;
    }

    public void setImageBig(String imageBig) {
        this.imageBig = imageBig;
    }

    @Override
    public String toString() {
        return nameAnimal;
    }

}
