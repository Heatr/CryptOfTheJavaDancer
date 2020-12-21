/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.fenetrecarte.panels;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import projet.tutoré.Game;
import projet.tutoré.IHM.fenetrecarte.vuehud.coeur.VueCoeurPlein;
import projet.tutoré.IHM.fenetrecarte.vuehud.coeur.VueCoeurVide;
import projet.tutoré.IHM.fenetrecarte.vuehud.equipement.VuePelle;
import projet.tutoré.images.Sprite;

/**
 *
 * @author Alexandre
 */
public class PanelHud extends Pane{
    
    private Game game;
    
    public PanelHud(Game g){
        super();
        this.game = g;
        this.setMouseTransparent(true);
        update();   
    }

    private void update() {
        for(int i = 0 ;i< this.game.getPlayer().getPv();i++){
            this.configAndDisplay(new VueCoeurPlein(), 70, 70, i*90 + 30, 15);
        }
        for(int j = this.game.getPlayer().getPv(); j< this.game.getPlayer().getVieMax(); j++){
            this.configAndDisplay(new VueCoeurVide(), 70, 70, j*90 + 30, 15);
        }
        if(this.game.getPlayer().hasPelle() == true ){
            this.configAndDisplay(new VuePelle(), 100, 150, 0, 80);
        }
    }
    
    private void configAndDisplay(ImageView iv, int width, int height, int x, int y){
        iv.setFitWidth(width);
        iv.setFitHeight(height);
        iv.setTranslateX(x);
        iv.setTranslateY(y);
        this.getChildren().add(iv);
        this.setPrefWidth(Math.max(this.getPrefWidth(), x+width));
        this.setPrefHeight(Math.max(this.getPrefHeight(), y+height));
    }
}
