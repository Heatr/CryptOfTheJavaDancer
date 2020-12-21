/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.audio.sfxs;

import java.nio.file.Paths;
import java.util.HashMap;
import javafx.scene.media.Media;

/**
 *
 * @author kevin
 */
public class Sfx {
    
    private Media media;
    private static HashMap<String, Sfx> instances = new HashMap<String, Sfx>();
    
    private Sfx(String path){
        this.media = new Media(Paths.get(path).toUri().toString());
    }
    
    public static Sfx getInstance(String key){
        if(!instances.containsKey(key)){
            instances.put(key, new Sfx(key));
        }
        return instances.get(key);
    }
    
    public Media getMedia(){
        return this.media;
    }
}
