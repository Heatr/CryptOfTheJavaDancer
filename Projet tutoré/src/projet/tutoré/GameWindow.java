/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

/**
 *Fenêtre sur laquelle sera affiché le jeu
 * @author kevin
 */
public class GameWindow extends Parent {
    
    private Game game;
    private Image sol = new Image(GameWindow.class.getResourceAsStream("images/sol1.png"));
    
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
            ImageView solView = new ImageView(this.sol);
            
            solView.setFitHeight(50);
            solView.setFitWidth(50);
            solView.setTranslateX(c.getX());
            solView.setTranslateY(c.getY());
            
             s.getChildren().add(solView);
        }
        
        
        
        
    }
    
}
