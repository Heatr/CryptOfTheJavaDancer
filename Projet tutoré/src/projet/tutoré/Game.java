/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré;

import projet.tutoré.gameitems.player.Player;
import projet.tutoré.gameitems.GameItem;
import projet.tutoré.map.Map;
import java.util.ArrayList;
import projet.tutoré.map.cases.Coordonnee;

/**
 *Classe qui représente le jeu et qui gère la partie
 * @author kevin
 */
public class Game {
    
    private Map map;
    private Player player;
    private ArrayList<GameItem> gameItems;
    private boolean running;
 
    /**
     * Crée une nouvelle instance de Game
     * Crée une nouvelle carte, un joueur, initialise la liste de GameItems
     * et se définit comme étant "en exécution"
     * @param width largeur de la carte
     * @param height hauteur de la carte
     */
    public Game(int width, int height){
        map = new Map(width, height);
        running = true;
        player = Player.getInstance(this, new Coordonnee(2, 2));
        gameItems = new ArrayList<GameItem>();
    }
    
    /**
     * Fais tourner le jeu tant que les conditions ne sont pas remplis
     * Exécute les mécanismes du jeu tant que le joueur n'a pas atteint la sortie/n'est pas mort
     * @return l'état "gagné" ou "perdu"
     */
    public boolean Run(){
        return true;
    }
    
    /**
     * Fonction qui retoune la carte du jeu
     * @return la carte du jeu
     */
    public Map getMap(){
        return this.map;
    }
    
    public void AddGameItem(GameItem gi){
        
    }
    
    public void RemoveGameItem(GameItem gi){
        
    }
    
    public boolean IsInGame(GameItem gi){
        return true;
    }
    
    public void MoveGameItem(GameItem gi){
        
    }
}
