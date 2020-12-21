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
public class VueSol extends VueCase{

    public VueSol() {
        super("sol1.png");
    }

    @Override
    protected TypeCase getTypeCase() {
        return TypeCase.Classic;
    }
    
    
    
    
}
