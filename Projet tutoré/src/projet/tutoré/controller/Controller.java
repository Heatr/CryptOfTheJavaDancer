/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.controller;

import java.util.ArrayList;
import projet.tutoré.observer.Observer;

/**
 * Classe représentant un controlleur
 * @author kevin
 */
public class Controller {
    
    private ArrayList<Observer> observers;
    
    /**
     * Crée une nouvelle instance de Controller
     * Initialise la liste d'Observer
     */
    public Controller(){
        this.observers = new ArrayList<Observer>();
    }
    
    /**
     * Ajoute un Observer à la liste
     * @param o nouvel Observer 
     */
    public void addObserver(Observer o){
        this.observers.add(o);
    }
    
    /**
     * Avertit tous les Observers de la liste qu'un changement a été effectué dans le modèle
     */
    public void informObservers(){
        for(Observer o: this.observers){
            o.inform();
        }
    }
}
