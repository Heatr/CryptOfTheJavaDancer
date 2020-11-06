/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré;

import projet.tutoré.TypeCase;
/**
 *
 * @author dm645996
 */
public class CaseFactory {

    public CaseFactory() {
    }
    
    public static Case creerCase(TypeCase cases){
        Case c = null;
        switch(cases){
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
