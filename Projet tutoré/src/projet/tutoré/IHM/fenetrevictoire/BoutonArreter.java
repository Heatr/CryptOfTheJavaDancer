/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.fenetrevictoire;

import projet.tutoré.IHM.menuprincipal.*;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Matthieu
 */
public class BoutonArreter extends Button {
    
    private SceneMenuVictoire scene;
    
    public BoutonArreter(SceneMenuVictoire scene) {
        super("Quitter");
        getStylesheets().add(getClass().getResource("boutonVictoire.css").toExternalForm());
        this.scene = scene;    
        this.gestionListener();
    }
    
    //Gestion des listener
    private void gestionListener() {
        this.setOnMousePressed(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent me){
                scene.quitter();
            }
        });
    }
}
