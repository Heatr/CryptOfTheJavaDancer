/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.map.cases;

import projet.tutoré.images.Sprite;
import projet.tutoré.map.cases.Case;

/**
 *Représente une case où se trouve les escaliers
 * @author kevin
 */
public class CaseStair extends Case {
    
     /**
     * Crée une nouvelle instance de CasStair
     * Appelle le constructeur de Case pour créer la CaseStair
     * @param x coordonnée sur l'axe x
     * @param y coordonnée sur l'axe y
     */
    public CaseStair(Coordonnee c){
        super(c);
        this.sprite = Sprite.getInstance("stairs.png");
    }

    
    @Override
    public String getTypeCase() {
        return "Stair";
    }
    
}
