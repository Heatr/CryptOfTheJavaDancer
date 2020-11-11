/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré;

/**
 *Représente une case où se trouve un mur
 * @author kevin
 */
public class CaseWall extends Case {
   
    /**
     * Crée une nouvelle instance de CaseWall
     * Appelle le constructeur de Case pour créer la CaseWall
     * @param x coordonnée sur l'axe x
     * @param y coordonnée sur l'axe y
     */
    public CaseWall(int x, int y){
        super(x, y);
    }

    @Override
    public String getTypeCase() {
        return "Wall";
    }
    
}
