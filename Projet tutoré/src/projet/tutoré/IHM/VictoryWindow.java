/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM;

import java.awt.Font;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import projet.tutoré.Game;
import projet.tutoré.ProjetTutoré;

/**
 *Classe représentant l'écran de victoire
 * @author kevin
 */
public class VictoryWindow extends Parent {
    
    private Group root;
    
    public VictoryWindow(Group r){
        GridPane gridpane = new GridPane();
        ImageView victory = new ImageView(new
        Image(MenuPrincipal.class.getResourceAsStream("victory.jpg")) {});
        victory.setFitHeight(1095);
        victory.setPreserveRatio(true);
        gridpane.add(victory, 1, 0);
        this.getChildren().add(gridpane);
        //options.setLayoutX(900);
        //options.setLayoutY(850);
        quitter.setLayoutX(1180); //en taille normale, c'était 1285
        quitter.setLayoutY(500);

        //options.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        quitter.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        getStylesheets().add(getClass().getResource("boutonVictoire.css").toExternalForm());
        //quitter.setStyle("-fx-font-size: 20pt");
        //options.setStyle("-fx-font-size: 15pt");

     
        //this.getChildren().add(options);
        this.getChildren().add(quitter);

        
        quitter.setOnMousePressed(new EventHandler<MouseEvent>(){
        @Override
        public void handle(MouseEvent me){
        appuyerQuitter();
        }
        });
    }
    
    Button quitter = new Button("Quitter");

    
    /**
    * Ferme le jeu
    */
   public void appuyerQuitter(){
      quitter.setOnAction(e -> Platform.exit());
   }
    
}
