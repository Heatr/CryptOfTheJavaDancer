/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM;

import java.awt.ScrollPane;
import projet.tutoré.map.cases.Case;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import projet.tutoré.Game;
import projet.tutoré.images.Sprite;
import projet.tutoré.map.cases.TypeCase;

/**
 *Fenêtre sur laquelle sera affiché le jeu
 * @author kevin
 */
public class GameWindow extends Parent {
    
    private Game game;
    
    //private Rectangle r = new Rectangle();
    
    /**
     * Créer une nouvelle fenêtre de jeu
     * Récupère l'instance de Game en paramètre et initialise les éléments de la fenêtre
     * @param g l'instance de Game en cours
     */
    public GameWindow(Game g){
        game = g;
//        r.setWidth(500);
//        r.setHeight(80);
//        r.setFill(Color.BLUE);
//        r.setTranslateX(150);
//        r.setTranslateY(500);
        
        StackPane s = new StackPane();
        
        this.getChildren().add(s);

        for(Case c:g.getMap().getCases()){
            ImageView caseView = new ImageView(c.getSprite().getImage());
            if(c.getTypeCase() == TypeCase.Wall && c.getCoordonnee().getY() == 1){
                caseView.setFitWidth(50);
                caseView.setFitHeight(75);
                caseView.setTranslateX(c.getCoordonnee().getX()*50);
                caseView.setTranslateY(c.getCoordonnee().getY()*75-25);
            }else{
                caseView.setFitWidth(50);
                caseView.setFitHeight(50);
                caseView.setTranslateX(c.getCoordonnee().getX()*50);
                caseView.setTranslateY(c.getCoordonnee().getY()*50);
            }

            s.getChildren().add(caseView);
            
            if(c.getGameItem() != null){
                ImageView caseContentView = new ImageView(c.getGameItem().getSprite().getImage());
                caseContentView.setFitWidth(40);
                caseContentView.setFitHeight(50);
                caseContentView.setTranslateX(c.getCoordonnee().getX()*50);
                caseContentView.setTranslateY(c.getCoordonnee().getY()*50);
                s.getChildren().add(caseContentView);
            }
        }  
    }   
}
