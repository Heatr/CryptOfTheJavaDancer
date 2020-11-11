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
    public static Case creerCase(String typeCase, int x, int y){
        Case c = null;
        switch(typeCase){
            case "C":
                c = new CaseClassic(x, y);
                break;
            case "W":
                c = new CaseWall(x, y);
                break;
            case "S":
                c = new CaseStair(x, y);
                break;
        }
        return c;
    }
}
