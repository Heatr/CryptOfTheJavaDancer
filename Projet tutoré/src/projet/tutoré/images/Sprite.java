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
    private static HashMap<String, Sprite> instances = new HashMap<String, Sprite>();
    
    /**
     * Crée une nouvelle instance de Sprite
     * Crée l'Image du Sprite à partir de la clé
     * @param path chemin de l'image
     */
    private Sprite(String path){
        image = new Image(Sprite.class.getResourceAsStream(path));
    }
    
    /**
     * Renvoie une instance de Sprite
     * Recherche l'instance correspondant à la clé passée en paramètre, sinon on
     * en crée une à partir de cette clé
     * @param key clé/nom du sprite
     * @return le sprite recherché
     */
    public static Sprite getInstance(String key){
        if(!instances.containsKey(key)){
            instances.put(key, new Sprite(key));
        }
        return instances.get(key);
    }
    
    /**
     * Retourne l'Image du sprite
     * @return l'Image du sprite
     */
    public Image getImage(){
        return this.image;
    }
}
