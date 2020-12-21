/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.fenetrecarte;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import projet.tutoré.Game;
import projet.tutoré.IHM.fenetrecarte.panels.PanelHud;
import projet.tutoré.IHM.fenetrecarte.panels.PanelScroll;

/**
 *
 * @author Matthieu
 */
public class SceneGame extends Scene {
    
    private PanelScroll panelScroll;
    private PanelHud panelHud;
    private Game game;
    private int widthMap = 39;
    private int heightMap = 21;
    
    public SceneGame(Pane root) {
        super(root,1920,1020);
        //this.panelPrincipal = root;
        //Creation du jeu
        this.game = new Game(this.widthMap, this.heightMap);
        
        //Creation de la ScrollPane + La scroll prend la taille de la scène
        this.panelScroll = new PanelScroll(this.game, this.widthMap, this.heightMap);      
        //this.panelScroll.prefWidthProperty().bind(this.panelPrincipal.widthProperty());
        //this.panelScroll.prefHeightProperty().bind(this.panelPrincipal.heightProperty());
        //this.panelScroll.setPrefWidth(1920);
        //this.panelScroll.setPrefHeight(1020);
        this.panelScroll.prefHeightProperty().bind(this.heightProperty());
        this.panelScroll.prefWidthProperty().bind(this.widthProperty());
        
        //Creation du Pane du Hud du jeu;
        this.panelHud = new PanelHud(this.game);
        
        //AJOUT DES DIFFERENTS PANEL DANS LA SCENE
        //this.panelPrincipal.getChildren().add(this.panelScroll);
        //this.panelPrincipal.getChildren().add(this.panelHud);
        root.getChildren().add(this.panelScroll);
        root.getChildren().add(this.panelHud);
        
        this.setOnKeyPressed(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent ke){
                panelScroll.keyInformationGet(ke);
            }
        });
        
    }
    
}
