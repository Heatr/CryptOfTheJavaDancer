/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.fenetrecarte.cases;

import javafx.scene.image.ImageView;
import projet.tutoré.images.Sprite;
import projet.tutoré.map.cases.TypeCase;

/**
 *
 * @author Matthieu
 */
public abstract class VueCase extends ImageView{
    
    public VueCase(String url){
        super(Sprite.getInstance(url).getImage());
    }
    
    protected abstract TypeCase getTypeCase();
}
