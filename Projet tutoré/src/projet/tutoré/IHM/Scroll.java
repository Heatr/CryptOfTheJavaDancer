/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import projet.tutoré.Game;

/**
 *
 * @author Maxime
 */
public class Scroll extends Application{
    private GameWindow gw;
    private Game g;
    
    public Scroll(GameWindow gameWindow, Game game){
        this.gw=gameWindow;
        this.g=game;
    }
    @Override
    public void start(Stage stage) {
    StackPane layout = new StackPane();
    layout.getChildren().add(gw);
    ScrollPane scroll = createScrollPane(layout);
    
    scroll.setContent(gw);
    scroll.scaleXProperty().set(1.5);
    scroll.scaleYProperty().set(1.5);
    scroll.setHmax(scroll.getWidth());
    scroll.setVmax(scroll.getHeight());
    scroll.setHvalue(this.g.getPlayer().getCoordonnee().getX());
    scroll.setVvalue(this.g.getPlayer().getCoordonnee().getX());
    
    Scene scene = new Scene(scroll);
    stage.setScene(scene);
    stage.show();
    
    }

    private ScrollPane createScrollPane(StackPane layout) {
    ScrollPane scroll = new ScrollPane();
    scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
    scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
    scroll.setPrefSize(1920, 1020);
    scroll.setContent(layout);
    return scroll;
    }
     
}
