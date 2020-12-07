/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM;



import java.nio.file.Paths;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import projet.tutoré.Game;


/**
 *
 * @author dm645996
 */
public class MenuPrincipal extends Parent{
    
    private MediaPlayer musique;
       
    public MenuPrincipal() {
       
        //Kévin: Ajout de la musique (tourne en boucle)
        Media media = new Media(Paths.get("Musiques/Title_Screen_Theme.mp3").toUri().toString());
        MediaPlayer player = new MediaPlayer(media); 
        player.setVolume(0.03);
        this.musique = player;
        player.play();
        
        GridPane gridpane = new GridPane();
        ImageView mainmenu = new ImageView(new
        Image(MenuPrincipal.class.getResourceAsStream("mainmenu.jpg")) {});
        mainmenu.setFitHeight(1095);
        mainmenu.setPreserveRatio(true);
        gridpane.add(mainmenu, 1, 0);
        this.getChildren().add(gridpane);
        nouvellePartie.setLayoutX(750);
        nouvellePartie.setLayoutY(850);
        quitter.setLayoutX(834);
        quitter.setLayoutY(900);

        nouvellePartie.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        getStylesheets().add(getClass().getResource("bouton.css").toExternalForm());
        quitter.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
     
     
        this.getChildren().add(nouvellePartie);
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
   Button quitter = new Button("Quitter");
   
   /**
    * Ferme le jeu
    */
   public void appuyerQuitter(){
      quitter.setOnAction(e -> Platform.exit());
   }
   
   /**
    * Lance une nouvelle partie
    * Crée un nouveau Game et lance la fenêtre de jeu
    */
   public void appuyerNewWindows(){
       this.musique.stop();
       Group root = new Group();
       Game game=new Game(39,21);
       Stage jeu = new Stage();
       jeu.setTitle("Crypt of the NecroDancer");
       
       GameWindow gw = new GameWindow(root, game);
       Scroll scroll=new Scroll(gw,game);
       jeu.setScene(new Scene(root,1920,1020, Color.BLACK));
       
       root.getChildren().add(gw);
       
       jeu.show();
       scroll.start(jeu);
       gw.requestFocus();
       
       Stage fermeture = (Stage) nouvellePartie.getScene().getWindow();
       fermeture.close();      
   }
}
