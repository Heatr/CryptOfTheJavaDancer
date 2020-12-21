/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.IHM.audio;

import javafx.scene.media.MediaPlayer;
import projet.tutoré.IHM.audio.sfxs.Sfx;

/**
 *
 * @author kevin
 */
public class SfxPlayer {
    
    private static SfxPlayer instance = null;
    private static MediaPlayer mediaPlayer;
    
    private SfxPlayer(){
        this.instance = this;
    }
    
    public static final SfxPlayer getInstance(){
        if(SfxPlayer.instance != null){
            return SfxPlayer.instance;
        }
        else{
            SfxPlayer.instance = new SfxPlayer();
            return SfxPlayer.instance;
        }
    }
    
    public void Play(String url){
        SfxPlayer.mediaPlayer = new MediaPlayer(Sfx.getInstance(url).getMedia()); 
        SfxPlayer.mediaPlayer.setVolume(0.05);
        SfxPlayer.mediaPlayer.play();
    }
}
