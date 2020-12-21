/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré;

import projet.tutoré.IHM.MenuPrincipal;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import projet.tutoré.IHM.menuprincipal.SceneMenuPrincipal;


/**
 *
 * @author dm645996
 */
public class ProjetTutoré extends Application {
    
    private static Stage primaryStage;
    
    @Override
    public void start(Stage _primaryStage) {
        primaryStage = _primaryStage;
        primaryStage.setTitle("Crypt of the NecroDancer");
        
        Scene scene = new SceneMenuPrincipal(new Pane());
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    //Change la scène 
    public static void setScene(Scene scene) {
        primaryStage.setScene(scene);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
