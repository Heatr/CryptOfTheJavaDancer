/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.gameitems;

import projet.tutoré.Game;
import projet.tutoré.images.Sprite;
import projet.tutoré.map.cases.Coordonnee;
import projet.tutoré.map.cases.Case;

/**
 *
 * @author Kevin Deschaud, Robin Petiot
 */
abstract public class GameItem {

    private String name;
    protected Sprite sprite;
    
    /**
     * Constructeur du GameItem
     * Crée un GameItem et l'ajoute dans la case coresspondante
     * @param g partie associée
     * @param name nom du sprite
     */
    public GameItem(Game g,String name){
        this.name = name;
    }
    
    /**
     * Retourne le sprite du GameItem
     * @return sprite du GameItem
     */
    public Sprite getSprite(){
        return this.sprite;
    }
    
}
