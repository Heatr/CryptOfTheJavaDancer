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
        this.getChildren().add(gridpane);
        //options.setLayoutX(900);
        //options.setLayoutY(850);
        quitter.setLayoutX(875);
        quitter.setLayoutY(700);

        //options.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        quitter.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        quitter.setStyle("-fx-font-size: 20pt");
        //options.setStyle("-fx-font-size: 15pt");
        
        victoire1.setLayoutX(800);
        victoire1.setLayoutY(300);
        victoire2.setLayoutX(700);
        victoire2.setLayoutY(400);
        
        victoire1.setStyle("-fx-font-size: 30pt");
        victoire2.setStyle("-fx-font-size: 30pt");
        
        victoire1.setTextFill(Color.WHITE);
        victoire2.setTextFill(Color.WHITE);
     
        //this.getChildren().add(options);
        this.getChildren().add(quitter);
        this.getChildren().add(victoire1);
        this.getChildren().add(victoire2);
        
        quitter.setOnMousePressed(new EventHandler<MouseEvent>(){
        @Override
        public void handle(MouseEvent me){
        appuyerQuitter();
        }
        });
    }
    
    Button quitter = new Button("Quitter");
    Label victoire1 = new Label("Félicitations !");
    Label victoire2 = new Label("Vous avez atteint la sortie !");
    
    /**
    * Ferme le jeu
    */
   public void appuyerQuitter(){
      quitter.setOnAction(e -> Platform.exit());
   }
    
}
