/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré;



import javafx.application.Platform;
import static javafx.application.Platform.exit;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


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
        //options.setLayoutX(900);
        //options.setLayoutY(850);
        quitter.setLayoutX(900);
        quitter.setLayoutY(900);

        nouvellePartie.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        //options.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        quitter.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        quitter.setStyle("-fx-font-size: 15pt");
        //options.setStyle("-fx-font-size: 15pt");
        nouvellePartie.setStyle("-fx-font-size: 15pt");
     
        this.getChildren().add(nouvellePartie);
        //this.getChildren().add(options);
        this.getChildren().add(quitter);
        
        quitter.setOnMousePressed(new EventHandler<MouseEvent>(){
        @Override
        public void handle(MouseEvent me){
        appuyerQuitter();
        }
        });
        
        nouvellePartie.setOnMousePressed(new EventHandler<MouseEvent>(){
        @Override
        public void handle(MouseEvent me){
        appuyerNewWindows();
        }
        });
    }
    
   Button nouvellePartie = new Button("Nouvelle Partie");
   //Button options = new Button("Options");
   Button quitter = new Button("Quitter");
    
   public void appuyerQuitter(){
      quitter.setOnAction(e -> Platform.exit());
   }
   
   public void appuyerNewWindows(){
       Group root = new Group();
       Stage jeu = new Stage();
       jeu.setTitle("Crypt of the NecroDancer");
       jeu.setScene(new Scene(root,1920,1020));
       jeu.show();
   }
}
