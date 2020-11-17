/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM;

import javafx.event.EventHandler;
import projet.tutoré.map.cases.Case;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import projet.tutoré.Game;
import projet.tutoré.map.cases.Coordonnee;
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
     * Récupère l'instance de Game en paramètre et initialise les éléments de la fenêtre, configure les inputs
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
        
        update(s);
        
        this.setOnKeyPressed(new EventHandler<KeyEvent>(){
            public void handle(KeyEvent ke){
                if(ke.getCode().equals(KeyCode.D)){
                    //System.out.println("test2");
                    Coordonnee temp = new Coordonnee(g.getPlayer().getCoordonnee().getX()+1, g.getPlayer().getCoordonnee().getY());    
                    if(g.getMap().getCase(temp).getTypeCase() != TypeCase.Wall){
                        g.getMap().getCase(g.getPlayer().getCoordonnee()).removeGameItem(g.getPlayer());
                        g.getPlayer().setCoordonnee(temp);
                        g.getMap().getCase(temp).addGameItem(g.getPlayer());
                        
                        update(s);
                    }                          
                }
                else if(ke.getCode().equals(KeyCode.Z)){
                    Coordonnee temp = new Coordonnee(g.getPlayer().getCoordonnee().getX(), g.getPlayer().getCoordonnee().getY()-1);    
                    if(g.getMap().getCase(temp).getTypeCase() != TypeCase.Wall){
                        g.getMap().getCase(g.getPlayer().getCoordonnee()).removeGameItem(g.getPlayer());
                        g.getPlayer().setCoordonnee(temp);
                        g.getMap().getCase(temp).addGameItem(g.getPlayer());
                        
                        update(s);
                    }
                }
                else if(ke.getCode().equals(KeyCode.Q)){
                    Coordonnee temp = new Coordonnee(g.getPlayer().getCoordonnee().getX()-1, g.getPlayer().getCoordonnee().getY());    
                    if(g.getMap().getCase(temp).getTypeCase() != TypeCase.Wall){
                        g.getMap().getCase(g.getPlayer().getCoordonnee()).removeGameItem(g.getPlayer());
                        g.getPlayer().setCoordonnee(temp);
                        g.getMap().getCase(temp).addGameItem(g.getPlayer());
                        
                        update(s);
                    }
                }
                else if(ke.getCode().equals(KeyCode.S)){
                    Coordonnee temp = new Coordonnee(g.getPlayer().getCoordonnee().getX(), g.getPlayer().getCoordonnee().getY()+1);    
                    if(g.getMap().getCase(temp).getTypeCase() != TypeCase.Wall){
                        g.getMap().getCase(g.getPlayer().getCoordonnee()).removeGameItem(g.getPlayer());
                        g.getPlayer().setCoordonnee(temp);
                        g.getMap().getCase(temp).addGameItem(g.getPlayer());
                        
                        update(s);
                    }
                }
            }
        });
    }
    
    /**
     * Met à jour l'écran de jeu
     * Affiche les cases et leur contenu en prenant en compte la notion de profondeur
     * @param s StackPane de l'écran
     */
    public void update(StackPane s){
        s.getChildren().clear();
        for(Case c: game.getMap().getCases()){
            ImageView caseView = new ImageView(c.getSprite().getImage());
            if(c.getTypeCase() == TypeCase.Wall){
                this.configAndDisplay(caseView, s, 50, 50, c.getCoordonnee().getX()*50, c.getCoordonnee().getY()*50 - 25);
                if(c.getGameItem() != null){
                    ImageView caseContentView = new ImageView(c.getGameItem().getSprite().getImage());
                    this.configAndDisplay(caseContentView, s, 40, 50, c.getCoordonnee().getX()*50, c.getCoordonnee().getY()*50);
                }
            }
            else{
                this.configAndDisplay(caseView, s, 50, 50, c.getCoordonnee().getX()*50, c.getCoordonnee().getY()*50);
                if(game.getMap().getCase(c.getCoordonnee().getCoordonneeHaut()) != null){
                    if(game.getMap().getCase(c.getCoordonnee().getCoordonneeHaut()).getTypeCase() == TypeCase.Wall){
                        caseView = new ImageView(c.getSpriteAlt().getImage());
                        this.configAndDisplay(caseView, s, 50, 50, c.getCoordonnee().getX()*50, c.getCoordonnee().getY()*50 - 25);
                    }
                    if(c.getGameItem() != null){
                        ImageView caseContentView = new ImageView(c.getGameItem().getSprite().getImage());
                        this.configAndDisplay(caseContentView, s, 40, 50, c.getCoordonnee().getX()*50, c.getCoordonnee().getY()*50 - 15);
                    }
                }
            }
        }
    }
    
    /**
     * Affiche un sprite
     * Configure l'ImageView et l'ajoute au StackPane
     * @param iv ImageView à ajouter
     * @param s StackPane
     * @param width largeur de l'ImageView
     * @param height hauteur de l'ImageView
     * @param x coordonnée sur l'axe x
     * @param y coordonnée sur l'axe y
     */
    public void configAndDisplay(ImageView iv, StackPane s, int width, int height, int x, int y){
        iv.setFitWidth(width);
        iv.setFitHeight(height);
        iv.setTranslateX(x);
        iv.setTranslateY(y);
        s.getChildren().add(iv);
    }
}
