/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.fenetrecarte.vuehud.coeur;

import javafx.scene.image.ImageView;
import projet.tutoré.images.Sprite;

/**
 *
 * @author Alexandre
 */
public class VueCoeurVide extends ImageView{

    public VueCoeurVide() {        
        super(Sprite.getInstance("heart_empty.png").getImage());
    }
    
}
