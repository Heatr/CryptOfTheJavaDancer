/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.fenetrecarte.cases;

import projet.tutoré.map.cases.TypeCase;

/**
 *
 * @author Alexandre
 */
public class VueMurHaut extends VueCase{

    public VueMurHaut() {
        super("wall_dirt1_down.png");
    }

    @Override
    protected TypeCase getTypeCase() {
        return TypeCase.Up;
    }
    
   
    
    
}
