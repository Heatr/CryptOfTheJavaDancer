/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
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
    private ScrollPane scroll;
    
    public Scroll(GameWindow gameWindow, Game game){
        this.gw=gameWindow;
        this.g=game;
        this.gw.setScroll(this);
    }
    @Override
    public void start(Stage stage) {
    //StackPane layout = new StackPane();
    //layout.getChildren().add(gw);
    this.scroll = createScrollPane();
    
    scroll.setMouseTransparent(true);
    
    scroll.setContent(gw);
    gw.getPaneMap().setScaleX(1.5);
    gw.getPaneMap().setScaleY(1.5);
    //scroll.setHmax(scroll.getWidth());
    //scroll.setVmax(scroll.getHeight());
    //scroll.setHvalue(this.g.getPlayer().getCoordonnee().getX());
    //scroll.setVvalue(this.g.getPlayer().getCoordonnee().getY());
    //scroll.hvalueProperty().bind(this.gw.getViewPlayer().xProperty().divide(this.gw.getPaneMap().widthProperty()).multiply(scroll.hmaxProperty()));
    //scroll.vvalueProperty().bind(this.gw.getViewPlayer().yProperty().divide(this.gw.getPaneMap().heightProperty()).multiply(scroll.vmaxProperty()));
    
    scroll.hvalueProperty().addListener(new ChangeListener<Number>() {
        @Override
        public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
            System.out.println(scroll.getHvalue()+"/"+scroll.getHmax());
        }
    });
    
    scroll.setPannable(true);
    
    Pane panelPrincipal = new Pane();
    Scene scene = new Scene(panelPrincipal,1920,1020);
    //panelPrincipal.prefWidthProperty().bind(scene.widthProperty());
    //panelPrincipal.prefHeightProperty().bind(scene.heightProperty());
    panelPrincipal.setPrefHeight(800);
    panelPrincipal.setPrefWidth(800);
    panelPrincipal.getChildren().add(scroll);
    scroll.prefWidthProperty().bind(panelPrincipal.widthProperty());
    scroll.prefHeightProperty().bind(panelPrincipal.heightProperty());
    
    stage.setScene(scene);
    stage.show();
    
    this.gw.setScrollPane(this.scroll);
    
    }

    private ScrollPane createScrollPane() {
    ScrollPane scroll = new ScrollPane();
    scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
    scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
    //scroll.setContent(layout);
    return scroll;
    }
     
}
