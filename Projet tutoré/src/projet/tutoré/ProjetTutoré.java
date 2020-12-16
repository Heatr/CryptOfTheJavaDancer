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
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 *
 * @author dm645996
 */
public class ProjetTutoré extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Crypt of the NecroDancer");
        
        Group root = new Group();
        Scene scene = new Scene(root, 1920, 1020);
           
        MenuPrincipal mainmenu = MenuPrincipal.getIntence();
        root.getChildren().add(mainmenu);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
