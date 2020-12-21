/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.gameitems.player;

import projet.tutoré.gameitems.Entity;
import projet.tutoré.map.cases.Coordonnee;
import javafx.scene.input.KeyEvent;
import projet.tutoré.Game;
import projet.tutoré.gameitems.Entity;
import projet.tutoré.images.Sprite;
import projet.tutoré.map.cases.Case;

/**
 *
 * @author Dorian Morin & Robin Petiot
 */
public class Player extends Entity{
    
    /**
     * Instance unique du joueur
     */
    private static Player instance = null;
    private int Pv = 2;
    private static final int vieMax = 3;

    /**
     * Constructeur de l'instance du Joueur
     */
    private Player(Game g, String name, Coordonnee coo) {
        super(g, name);
        this.sprite = Sprite.getInstance("cadence.png");
        for (Case c: g.getMap().getCases()){
            if(c.getCoordonnee().equals(coo)){
                this.setCoordonnee(coo);
                c.addGameItem(this);
            }
        }
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
     * @param g instance de jeu en cours
     * @param coo coordonnées du joueur
     * @return Instance unique du joueur
     */
    public final static Player getInstance(Game g, Coordonnee coo){
        if(Player.instance == null){
            instance = new Player(g, "player", coo);
        }
        return instance;
    }
    
    /**
     * Fonction qui retourne le nombre de nombre de point de vie du joueur
     * @return le nombre de point de vie du joueur
     */
    public int getPv(){
        return this.Pv;
    }
    
    public int getVieMax(){
        return vieMax;
    }
    
    public boolean hasPelle(){
        return true;
    }
    
    public static void reinitialiseJoueur(){
        instance.setCoordonnee(new Coordonnee(11, 2));
    }
}
