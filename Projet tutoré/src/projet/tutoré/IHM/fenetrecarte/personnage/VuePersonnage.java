/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.fenetrecarte.personnage;

import javafx.scene.image.ImageView;
import projet.tutoré.images.Sprite;

/**
 *
 * @author Matthieu
 */
public class VuePersonnage extends ImageView {
    
    private static VuePersonnage instance;
    private int xView;
    private int yView;
    
    private VuePersonnage() {
        super(Sprite.getInstance("cadence.png").getImage());
    }
    
    public static VuePersonnage getInstance(){
        if(VuePersonnage.instance == null){
            return VuePersonnage.instance = new VuePersonnage();
        }
        else{
            return VuePersonnage.instance;
        }
    }
    
    public void setCoordonnates(int x, int y){
        VuePersonnage.instance.xView = x;
        VuePersonnage.instance.yView = y;
    }
    
    public int GetX(){
        return this.xView;
    }
    
    public int GetY(){
        return this.yView;
    }
}
