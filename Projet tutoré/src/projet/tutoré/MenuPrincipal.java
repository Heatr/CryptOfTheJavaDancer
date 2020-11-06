/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré;



import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author dm645996
 */
public class MenuPrincipal extends Parent{
    
       
    public MenuPrincipal() {
        GridPane gridpane = new GridPane();
        ImageView mainmenu = new ImageView(new
        Image(MenuPrincipal.class.getResourceAsStream("mainmenu.png")) {});
        mainmenu.setFitHeight(1095);
        mainmenu.setPreserveRatio(true);
        gridpane.add(mainmenu, 1, 0);
        this.getChildren().add(gridpane);
        nouvellePartie.setLayoutX(900);
        nouvellePartie.setLayoutY(800);
        options.setLayoutX(900);
        options.setLayoutY(850);
        quitter.setLayoutX(900);
        quitter.setLayoutY(900);

        nouvellePartie.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        options.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        quitter.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        quitter.setStyle("-fx-font-size: 15pt");
        options.setStyle("-fx-font-size: 15pt");
        nouvellePartie.setStyle("-fx-font-size: 15pt");
     
        this.getChildren().add(nouvellePartie);
        this.getChildren().add(options);
        this.getChildren().add(quitter);
    }
    
   Button nouvellePartie = new Button("Nouvelle Partie");
   Button options = new Button("Options");
   Button quitter = new Button("Quitter");
    
}
