/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.fenetrecarte.panels;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import projet.tutoré.Game;
import projet.tutoré.IHM.fenetrecarte.cases.VueMur;
import projet.tutoré.IHM.fenetrecarte.cases.VueMurHaut;
import projet.tutoré.IHM.fenetrecarte.personnage.VuePersonnage;
import projet.tutoré.IHM.fenetrevictoire.SceneMenuVictoire;
import projet.tutoré.ProjetTutoré;
import projet.tutoré.controller.ControllerMovement;
import projet.tutoré.map.cases.Case;
import projet.tutoré.map.cases.TypeCase;

/**
 *
 * @author Matthieu
 */
public class PanelCarte extends Pane {
    
    private Game game;
    private ControllerMovement movement;
    
    public PanelCarte(Game g){
        super();
        this.game = g;
        
        this.movement = new ControllerMovement(this.game);
        this.setStyle("-fx-background-color:black");   
        update();  
    }
    
    //MOUVEMENT DU PERSONNAGE
    public void getInformation(KeyEvent ke){
           
        movement.inform(ke.getCode());
        update();
                //scrollPane.setHvalue(getViewPlayer().getTranslateX()/(getPaneMap().getPrefWidth())*scrollPane.getHmax());
        if(game.getMap().getCase(game.getPlayer().getCoordonnee()).getTypeCase() == TypeCase.Stair){
                    //player.stop();
            ProjetTutoré.setScene(new SceneMenuVictoire(new Pane()));
        }    

    }
    
    
    //AFFICHAGE DE L4ECRAN DU JEU
    public void update(){
        this.getChildren().clear();
        for(Case c: game.getMap().getCases()){
            ImageView caseView = new ImageView(c.getSprite().getImage());
            if(c.getTypeCase() == TypeCase.Wall){
                this.configAndDisplay(new VueMur(), 100, 100, c.getCoordonnee().getX()*100, c.getCoordonnee().getY()*100 - 50);
                if(c.getGameItem() != null){
                    
                    //TODO CHANGER CETTE MERDE (QUAND ON EN AURA BESOIN)
                    //ImageView caseContentView = new ImageView(c.getGameItem().getSprite().getImage());
                    //this.configAndDisplay(caseContentView, 40, 50, c.getCoordonnee().getX()*50, c.getCoordonnee().getY()*50);
                }
            }
            else{
                this.configAndDisplay(caseView, 100, 100, c.getCoordonnee().getX()*100, c.getCoordonnee().getY()*100);
                if(game.getMap().getCase(c.getCoordonnee().getCoordonneeHaut()) != null){
                    if(game.getMap().getCase(c.getCoordonnee().getCoordonneeHaut()).getTypeCase() == TypeCase.Wall){
                        //caseView = new ImageView(c.getSpriteAlt().getImage());
                        this.configAndDisplay(new VueMurHaut(), 100, 100, c.getCoordonnee().getX()*100, c.getCoordonnee().getY()*100 - 50);
                    }
                    if(c.getGameItem() != null){
                        //this.imageViewPlayer = caseContentView; //TODO vérifier que c'est le joueur
                        if(c.getGameItem() == this.game.getPlayer()){
                            int xPlayerView = c.getCoordonnee().getX()*100;
                            int yPlayerView = c.getCoordonnee().getY()*100 - 30;
                            VuePersonnage.getInstance().setCoordonnates(xPlayerView, yPlayerView);
                            this.configAndDisplay(VuePersonnage.getInstance(), 80, 100, xPlayerView, yPlayerView);
                        }
                    }
                }
            }       
        }
    }
        
    //AFFICHAGE D4UN OBJET 
    private void configAndDisplay(ImageView iv, int width, int height, int x, int y){
        iv.setFitWidth(width);
        iv.setFitHeight(height);
        iv.setTranslateX(x);
        iv.setTranslateY(y);
        this.getChildren().add(iv);
        //this.setPrefWidth(Math.max(this.getPrefWidth(), x+width));
        //this.setPrefHeight(Math.max(this.getPrefHeight(), y+height));
    }
    
}
