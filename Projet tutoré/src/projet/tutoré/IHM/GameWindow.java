/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM;

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

/**
 *Fenêtre sur laquelle sera affiché le jeu
 * @author kevin
 */
public class GameWindow extends Parent {
    
    private Game game;
    private Image sol = new Image(GameWindow.class.getResourceAsStream("sol1.png"));
    private Image mur = new Image(GameWindow.class.getResourceAsStream("TEMP_wall_unbreakable.png"));
    private Image escalier = new Image(GameWindow.class.getResourceAsStream("stairs.png"));
    
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
        
        
        //Kévin: Le sprite change en fonction du type de case
        for(Case c:g.getMap().getCases()){
            ImageView caseView = null;
            
            switch(c.getTypeCase()){
                case "Classic":
                    caseView = new ImageView(this.sol);
                    break;
                case "Wall":
                    caseView = new ImageView(this.mur);
                    break;
                case "Stair":
                    caseView = new ImageView(this.escalier);
                    break;
            }
            
            caseView.setFitHeight(50);
            caseView.setFitWidth(50);
            caseView.setTranslateX(c.getCoordonnee().getX()*50);
            caseView.setTranslateY(c.getCoordonnee().getY()*50);
            
            s.getChildren().add(caseView);
        }
        
        //Kévin: On appelle Sprite et on récupère le sprite voulu
        ImageView joueur = Sprite.getInstance("cadence.png", 40, 50).getImageView();
        joueur.setTranslateX(0);
        joueur.setTranslateY(0);
        
        
        s.getChildren().add(joueur);    
    }   
}
