/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.fenetrevictoire;

import projet.tutoré.IHM.menuprincipal.*;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import projet.tutoré.ProjetTutoré;
import projet.tutoré.gameitems.player.Player;
import projet.tutoré.images.Sprite;

/**
 *
 * @author Matthieu
 */
public class SceneMenuVictoire extends Scene {
    
    private Pane panelPrincipal;
    
    public SceneMenuVictoire(Pane root) {
        super(root,1813,1020);
        this.panelPrincipal = root;
        this.gestionAffichage();
    }
    
    //Gestion de l'affichage des différents éléments graphiques de la scène
    private void gestionAffichage() {
        
        //Image de fond
        ImageView victoire = new ImageView(Sprite.getInstance("victory.jpg").getImage());
        victoire.fitHeightProperty().bind(this.panelPrincipal.heightProperty());
        victoire.setPreserveRatio(true);
        
        this.panelPrincipal.getChildren().add(victoire);
        
        //Bouton de nouvelle partie
        BoutonRecommencer boutonRecommencer = new BoutonRecommencer(this);
        boutonRecommencer.setLayoutX(1000); //en taille normale, c'était 1285
        boutonRecommencer.setLayoutY(500);
        
        //Bouton quitter
        BoutonArreter boutonArreter = new BoutonArreter(this);
        boutonArreter.setLayoutX(1000); //en taille normale, c'était 1285
        boutonArreter.setLayoutY(600);
        
        
        this.panelPrincipal.getChildren().addAll(boutonRecommencer,boutonArreter);
        
        
    }
    
    //Quitter le jeu
    public void quitter(){
      Platform.exit();
    }
    
    //Lancer une nouvelle partie
    public void menuPrincipal(){
        //A VOIR
       Player.reinitialiseJoueur();
       ProjetTutoré.setScene(new SceneMenuPrincipal(new Pane()));
       
   }
    
    
    
}
