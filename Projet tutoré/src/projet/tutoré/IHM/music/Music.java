/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.music;

import java.nio.file.Paths;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author kevin
 */
public class Music {
    
    private static Music instance = null;
    private MediaPlayer mediaPlayer;
    
    private Music(){
        this.instance = this;
    }
    
    public static final void Play(String url){
        if(instance != null){
            //Media media = new Media(Paths.get("Musiques/Title_Screen_Theme.mp3").toUri().toString());
            //MediaPlayer player = new MediaPlayer(media); 
            //player.setVolume(0.03);
            //this.musique = player;
            //player.play();
        }
    }
}
