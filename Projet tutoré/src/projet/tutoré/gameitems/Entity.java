/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.gameitems;

import projet.tutoré.Game;
import projet.tutoré.gameitems.GameItem;
import projet.tutoré.map.cases.Coordonnee;

/**
 *
 * @author dm645996
 */
public abstract class Entity extends GameItem{

    public Entity(Game g, String name) {
        super(g, name);
    }
    
    
    
}
