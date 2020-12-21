/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.audio.musics;

import java.nio.file.Paths;
import java.util.HashMap;
import javafx.scene.media.Media;

/**
 *
 * @author kevin
 */
public class Music {
    
    private Media media;
    private static HashMap<String, Music> instances = new HashMap<String, Music>();
    
    private Music(String path){
        this.media = new Media(Paths.get(path).toUri().toString());
    }
    
    public static Music getInstance(String key){
        if(!instances.containsKey(key)){
            instances.put(key, new Music(key));
        }
        return instances.get(key);
    }
    
    public Media getMedia(){
        return this.media;
    }
}
