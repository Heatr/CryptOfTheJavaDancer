/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.menuprincipal;

import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import projet.tutoré.IHM.fenetrecarte.SceneGame;
import projet.tutoré.IHM.fenetrevictoire.SceneMenuVictoire;
import projet.tutoré.IHM.audio.MusicPlayer;
import projet.tutoré.ProjetTutoré;
import projet.tutoré.images.Sprite;

/**
 *
 * @author Matthieu
 */
public class SceneMenuPrincipal extends Scene {
    
    private Pane panelPrincipal;
    
    public SceneMenuPrincipal(Pane root) {
        super(root,1813,1020);
        this.panelPrincipal = root;
        this.gestionAffichage();
        MusicPlayer.getInstance().Play("Musiques/Title_Screen_Theme.mp3");
    }
    
    //Gestion de l'affichage des différents éléments graphiques de la scène
    private void gestionAffichage() {
        
        //Image de fond
        ImageView mainmenu = new ImageView(Sprite.getInstance("mainmenu.jpg").getImage());
        mainmenu.fitHeightProperty().bind(this.panelPrincipal.heightProperty());
        mainmenu.setPreserveRatio(true);
        
        this.panelPrincipal.getChildren().add(mainmenu);
        
        //Bouton de nouvelle partie
        BoutonNouvellePartie boutonNouvellePartie = new BoutonNouvellePartie(this);
        boutonNouvellePartie.translateXProperty().bind(this.panelPrincipal.widthProperty().subtract(boutonNouvellePartie.widthProperty()).divide(2));
        boutonNouvellePartie.setTranslateY(850);
        //Bouton quitter
        BoutonQuitter boutonQuitter = new BoutonQuitter(this);
        boutonQuitter.translateXProperty().bind(this.panelPrincipal.widthProperty().subtract(boutonQuitter.widthProperty()).divide(2));
        boutonQuitter.setTranslateY(900);
        
        this.panelPrincipal.getChildren().addAll(boutonNouvellePartie,boutonQuitter);
        
        
        
    }
    
    //Quitter le jeu
    public void quitter(){
      Platform.exit();
    }
    
    //Lancer une nouvelle partie
    public void nouvellePartie(){
       ProjetTutoré.setScene(new SceneGame(new Pane()));
       //ProjetTutoré.setScene(new SceneMenuVictoire(new Pane()));
   }
    
    
    
}
