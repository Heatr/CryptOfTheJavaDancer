/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré;

import java.awt.Graphics;
import javafx.scene.image.Image;

/**
 *
 * @author Robin
 */
public class Sprite{
    
    /**
     * Image
     */
    private Image image;
    
    
    public Sprite(Image i){
        this.image =i;
    }
    /**
     * Largeur de l'image
     * @return la largeur du sprite
     */
    public int getWidth(){
        return (int) image.getWidth();
    }
    /**
     * Hauteur de l'image
     * @return la hauteur du sprite
     */
    public int getHeight(){
        return (int) image.getHeight();
    }
    /**
     * Affichage simple du sprite
     * @param g partie associée
     * @param x position horizontale
     * @param y position verticale
     */
    public void draw(Graphics g, int x, int y){
        
    }
    
    
}
