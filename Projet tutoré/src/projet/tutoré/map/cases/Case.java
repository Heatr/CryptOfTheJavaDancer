/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.map.cases;

import projet.tutoré.gameitems.GameItem;

/**
 *Classe représentant une case, elle possède des coordonnées (x et y)
 * @author dm645996
 */
public abstract class Case {
    private Coordonnee coordonnee;
    private GameItem gameItem;

    /**
     * Crée une nouvelle instance de Case
     * Définit les coordonnées de la case grâce à x et y passés en paramètre
     * @param x coordonnée sur l'axe x
     * @param y coordonnée sur l'axe y
     */
    public Case(Coordonnee c) {
        coordonnee = c;
    }

    /**
     * Retourne les coordonnees de la case
     * @return l'instance de Coordonnee de la Case
     */
    public Coordonnee getCoordonnee(){
        return this.coordonnee;
    }

    /**
     * Retourne le GameItem contenu dans la case
     * @return 
     */
    public GameItem getGameItem(){
        return this.gameItem;
    }
    
    /**
     * Place un GameItem dans la case
     * @param gi Le GameItem à ajouter
     */
    public void addGameItem(GameItem gi){
        this.gameItem = gi;
    }
    
    /**
     * Retire le GameItem de la case
     * @param gi Le GameItem à retirer
     */
    public void removeGameItem(GameItem gi){
        this.gameItem = null;
    }
    
    /**
     * Renvoie le type de la case
     * Chaque case renvoie son type en brut (ce n'es pas un attribut)
     * @return le type de la case
     */
    public abstract String getTypeCase();
    
}
