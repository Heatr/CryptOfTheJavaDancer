/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.observer;

/**
 *
 * @author kevin
 */
public abstract class Observer {
    
    /**
     * Avertit la vue qu'un changement a eu lieu dans le model et la met à jour
     */
    public abstract void inform();
    
}
