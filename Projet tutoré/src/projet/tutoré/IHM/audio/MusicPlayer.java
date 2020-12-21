/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.audio;

import java.nio.file.Paths;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import projet.tutoré.IHM.audio.musics.Music;

/**
 *
 * @author kevin
 */
public class MusicPlayer {
    
    private static MusicPlayer instance = null;
    private static MediaPlayer mediaPlayer;
    
    private MusicPlayer(){
        this.instance = this;
    }
    
    public static final MusicPlayer getInstance(){
        if(MusicPlayer.instance != null){
            return MusicPlayer.instance;
        }
        else{
            MusicPlayer.instance = new MusicPlayer();
            return MusicPlayer.instance;
        }
    }
    
    public void Play(String url){
        if(MusicPlayer.mediaPlayer != null){
            MusicPlayer.mediaPlayer.stop();
        }
        MusicPlayer.mediaPlayer = new MediaPlayer(Music.getInstance(url).getMedia()); 
        MusicPlayer.mediaPlayer.setVolume(0.03);
        MusicPlayer.mediaPlayer.play();
    }
}
