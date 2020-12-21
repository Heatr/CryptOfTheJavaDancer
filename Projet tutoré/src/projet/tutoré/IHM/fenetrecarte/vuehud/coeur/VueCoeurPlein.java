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
public class VueCoeurPlein extends ImageView{

    public VueCoeurPlein() {
        super(Sprite.getInstance("heart.png").getImage());
    }
    
    
}
