/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.controller;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import projet.tutoré.Game;
import projet.tutoré.IHM.VictoryWindow;
import projet.tutoré.IHM.audio.SfxPlayer;
import projet.tutoré.gameitems.player.Player;
import projet.tutoré.map.cases.Coordonnee;
import projet.tutoré.map.cases.TypeCase;

/**
 *Controleur de mouvement du joueur
 * @author kevin
 */
public class ControllerMovement extends Controller {
    
    private Game game;

    /**
     * Crée une nouvelle instance de ControllerMovement
     * Initiaise l'attribut Game grâce à l'instance de jeu en cours
     * @param g 
     */
    public ControllerMovement(Game g){
        super();
        this.game = g;
    }
    
    /**
     * Avertit le modèle que le joueur doit se déplacer
     * Selon la touche pressée, demande au jeu de déplacer le joueur sur une nouvelle case
     * @param key code de la touche pressée
     */
    public void inform(KeyCode key){
        if(key.equals(KeyCode.D)){    
            if(game.getMap().getCase(game.getPlayer().getCoordonnee().getCoordonneeDroite()).getTypeCase() != TypeCase.Wall){
                game.MovePlayer(game.getPlayer().getCoordonnee().getCoordonneeDroite());
            }
            else{
                game.getMap().changeCase(game.getPlayer().getCoordonnee().getCoordonneeDroite());
                SfxPlayer.getInstance().Play("vo_cad_dig_0" + game.getPlayer().dig() + ".mp3");
            }
        }
        else if(key.equals(KeyCode.Z)){  
            if(game.getMap().getCase(game.getPlayer().getCoordonnee().getCoordonneeHaut()).getTypeCase() != TypeCase.Wall){
                game.MovePlayer(game.getPlayer().getCoordonnee().getCoordonneeHaut());
            }
            else{
                game.getMap().changeCase(game.getPlayer().getCoordonnee().getCoordonneeHaut());
                SfxPlayer.getInstance().Play("vo_cad_dig_0" + game.getPlayer().dig() + ".mp3");
            }
        }
        else if(key.equals(KeyCode.Q)){
            if(game.getMap().getCase(game.getPlayer().getCoordonnee().getCoordonneeGauche()).getTypeCase() != TypeCase.Wall){
                game.MovePlayer(game.getPlayer().getCoordonnee().getCoordonneeGauche());
            }
            else{
                game.getMap().changeCase(game.getPlayer().getCoordonnee().getCoordonneeGauche());
                SfxPlayer.getInstance().Play("vo_cad_dig_0" + game.getPlayer().dig() + ".mp3");
            }
        }
        else if(key.equals(KeyCode.S)){
            if(game.getMap().getCase(game.getPlayer().getCoordonnee().getCoordonneeBas()).getTypeCase() != TypeCase.Wall){
                game.MovePlayer(game.getPlayer().getCoordonnee().getCoordonneeBas());
            }
            else{
                game.getMap().changeCase(game.getPlayer().getCoordonnee().getCoordonneeBas());
                SfxPlayer.getInstance().Play("vo_cad_dig_0" + game.getPlayer().dig() + ".mp3");
            }
        }
    }
}
