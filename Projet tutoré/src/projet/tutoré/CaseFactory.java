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
     * La fabrique crée une case en fonction du type passé en paramètre
     * @param typeCase type de la case
     * @return la nouvelle case crée
     */
    public static Case creerCase(TypeCase typeCase){
        Case c = null;
        switch(typeCase){
            case Classic:
               // c = new ActionDemande("MAP");
                break;
            case Wall:
               // c = new ActionDemande("PLAYER");
                break;
            case Stair:
                //c = new ActionDemande("WAIT");
                break;
        }
        return c;
    }
}
