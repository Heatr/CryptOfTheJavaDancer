/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré;

import projet.tutoré.TypeCase;
/**
 *Classe gère la fabrication des classes
 * @author dm645996
 */
public class CaseFactory {

    /**
     * Crée une nouvelle instance de CaseFactory
     */
    public CaseFactory() {
    }
    
    /**
     * Crée une nouvelle instance de Case
     * La fabrique crée une case en fonction du caractère passé en paramètre
     * @param typeCase type de la case
     * @return la nouvelle case crée
     */
    public static Case creerCase(String typeCase, Coordonnee c){
        Case res = null;
        switch(typeCase){
            case "C":
                res = new CaseClassic(c);
                break;
            case "W":
                res = new CaseWall(c);
                break;
            case "S":
                res = new CaseStair(c);
                break;
        }
        return res;
    }
}
