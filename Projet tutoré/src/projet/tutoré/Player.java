/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré;

import javafx.scene.input.KeyEvent;

/**
 *
 * @author Dorian Morin & Robin Petiot
 */
public class Player extends Entity{
    
    
    /**
     * Instance unique du joueur
     */
    private static Player instance = null;
    
    
    /**
     * Constructeur de l'instance du Joueur
     */
    private Player(Game g, String name, Coordonnee coo){
        super(g, name, coo);
        instance = this;
    }
    
    /**
     * Récupère l'appuie sur une touche du joueur
     * @param e événement correspondant
     */
    public void KeyPressed(KeyEvent e){
        
    }
    /**
     * Récupère le relachement d'une touche appuyée par le joueur
     * @param e Evenement correspondant
     */
    public void KeyReleased(KeyEvent e){
        
    }
    
    /**
     * Méthode permettant de renvoyer une instance de Player
     * @return Instance unique du joueur
     */
    public final static Player getInstance(){
        if(Player.instance == null){
            
        }
        return instance;
    }
    
    
    
    
}
