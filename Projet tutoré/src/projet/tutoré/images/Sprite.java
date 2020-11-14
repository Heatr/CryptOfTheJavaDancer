/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.images;

import java.util.HashMap;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import projet.tutoré.IHM.GameWindow;

/**
 *Classe qui représente tous les sprites du jeu
 * @author kevin
 */
public class Sprite {
    
    private Image image;
    private ImageView imageView;
    private static HashMap<String, Sprite> instances = new HashMap<String, Sprite>();
    
    /**
     * Crée une nouvelle instance de Sprite
     * Crée l'ImageView du Sprite à partir d'une Image crée à partir du chemin, puis
     * redimensionne l'ImageView
     * @param path chemin de l'image
     * @param width largeur de l'ImageView
     * @param height hauteur de l'ImageView
     */
    private Sprite(String path, int width, int height){
        image = new Image(Sprite.class.getResourceAsStream(path));
        imageView = new ImageView(image);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);
    }
    
    /**
     * Renvoie une instance de Sprite
     * Recherche l'instance correspondant à la clé passée en paramètre, sinon on
     * en crée une à partir de cette clé
     * @param key clé/nom du sprite
     * @param width largeur de l'ImageView du sprite
     * @param height hauteur de l'ImageView du sprite
     * @return le sprite recherché
     */
    public static Sprite getInstance(String key, int width, int height){
        if(!instances.containsKey(key)){
            instances.put(key, new Sprite(key, width, height));
        }
        return instances.get(key);
    }
    
    /**
     * Retourne l'ImageView du sprite
     * @return l'ImageView du sprite
     */
    public ImageView getImageView(){
        return this.imageView;
    }
}
