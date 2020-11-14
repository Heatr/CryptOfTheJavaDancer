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
    private Sprite sprite;
    
    /**
     * Constructeur du GameItem
     * Crée un GameItem et l'ajoute dans la case coresspondante
     * @param g partie associée
     * @param name nom du sprite
     * @param coo coordonnées de l'item
     */
    public GameItem(Game g,String name, Coordonnee coo){
        this.name = name;
        for (Case c: g.getMap().getCases()){
            if(c.getCoordonnee().equals(coo)){
                c.addGameItem(this);
            }
        }
    }
    
}
