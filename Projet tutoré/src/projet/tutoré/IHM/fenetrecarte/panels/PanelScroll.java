/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.fenetrecarte.panels;

import javafx.scene.control.ScrollPane;
import javafx.scene.input.KeyEvent;
import projet.tutoré.Game;
import projet.tutoré.IHM.fenetrecarte.personnage.VuePersonnage;

/**
 *
 * @author Matthieu
 */
public class PanelScroll extends ScrollPane {
    
    private Game g;
    private PanelCarte panelCarte;
    private int compt = 0;
    
    public PanelScroll(Game g, int width, int height) {
        super();
        this.g = g;
        
        //on rend la scollPane indelebiles
        //this.setMouseTransparent(true);
        //this.setPannable(true);
        this.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        this.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        
        this.panelCarte = new PanelCarte(g);
        //this.panelCarte.prefWidthProperty().bind(this.widthProperty());
        //this.panelCarte.prefHeightProperty().bind(this.heightProperty());  
        
        this.setStyle("-fx-background-color:black");
        this.panelCarte.setPrefWidth(width * 100);
        this.panelCarte.setPrefHeight(height * 100);
        
        this.setContent(this.panelCarte);
        
        this.Update();
        
        //this.getChildren().add(this.panelCarte);
        
       
    }
    
    public void keyInformationGet(KeyEvent ke) {
        this.panelCarte.getInformation(ke);
        this.Update();    
    }
    
    public void Update(){
        this.setHvalue((VuePersonnage.getInstance().getTranslateX())/(this.panelCarte.getPrefWidth())*this.getHmax());
        this.setVvalue((VuePersonnage.getInstance().getTranslateY())/(this.panelCarte.getPrefHeight())*this.getVmax());
        //this.setHvalue((g.getPlayer().getCoordonnee().getX()*100)/(this.panelCarte.getPrefWidth())*this.getHmax());
        //this.setVvalue((g.getPlayer().getCoordonnee().getY()*100-30)/(this.panelCarte.getPrefHeight())*this.getVmax());
    }
}
