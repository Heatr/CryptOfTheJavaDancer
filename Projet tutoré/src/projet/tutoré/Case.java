/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré;

/**
 *Classe représentant une case, elle possède des coordonnées (x et y)
 * @author dm645996
 */
public class Case {
    private int x;
    private int y;

    /**
     * Crée une nouvelle instance de Case
     * Définit les coordonnées de la case grâce à x et y passés en paramètre
     * @param x coordonnée sur l'axe x
     * @param y coordonnée sur l'axe y
     */
    public Case(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Retourne la valeur de x
     * @return la coordonnée sur l'axe x
     */
    public int getX() {
        return x;
    }

    /**
     * Retourne la  valeur de y
     * @return la coordonnée sur l'axe y
     */
    public int getY() {
        return y;
    }

   
    
   
}
