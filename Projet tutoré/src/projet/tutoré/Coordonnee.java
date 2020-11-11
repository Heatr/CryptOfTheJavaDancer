/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré;

/**
 *Représente les coordonnées d'une case (x et y)
 * @author kevin
 */
public class Coordonnee {
    
    private int x;
    private int y;
    
    /**
     * Crée de nouvelles coordonnées à partir d'un x et d'un y
     * @param x coordonnée sur l'axe x
     * @param y coordonnée sur l'axe y
     */
    public Coordonnee(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Retourne la valeur de x
     * @return la valeur de x
     */
    public int getX(){
        return this.x;
    }

    /**
     * Retourne la valeur de y
     * @return la valeur de y
     */
    public int getY(){
        return this.y;
    }
    
    /**
     * Vérifie que deux coordonnées sont égales
     * Compare les valeurs de x et y des deux coordonnées
     * @param c les coordonnées passées en paramètre
     * @return vrai ou faux
     */
    public boolean isEqual(Coordonnee c){
        boolean res = false;
        if((this.x == c.getX()) && (this.y == c.getY())){
            res = true;
        }
        return res;
    }
}
