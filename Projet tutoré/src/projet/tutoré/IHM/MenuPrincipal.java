/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM;



import java.nio.file.Paths;
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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
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
       //! Kévin: Une nouvelle instance de GameWindow doit être crée avec un Game en paramètre !
       this.musique.stop();
       Group root = new Group();
       Stage jeu = new Stage();
       jeu.setTitle("Crypt of the NecroDancer");
       GameWindow gw = new GameWindow(new Game(39,21));
       jeu.setScene(new Scene(root,1920,1020, Color.BLACK));
       root.getChildren().add(gw);
       jeu.show();
       
       //Kévin: Le menu principal se ferme au lancement d'une nouvelle partie
       Stage fermeture = (Stage) nouvellePartie.getScene().getWindow();
       fermeture.close();
   }
}
