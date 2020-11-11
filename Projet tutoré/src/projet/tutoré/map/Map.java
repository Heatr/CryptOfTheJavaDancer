/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré.map;

import projet.tutoré.map.cases.Coordonnee;
import projet.tutoré.map.cases.CaseClassic;
import projet.tutoré.map.cases.Case;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import javafx.scene.Parent;



/**
 *Classe représentant la carte, elle est composée de plusieurs cases
 * @author dm645996
 */
public class Map extends Parent{

    private HashMap<Coordonnee, Case> cases;
    
    /**
     * Crée une nouvelle instance de Map
     * Calcule le nombre de case puis en crée le même nombre et les ajoute dans cases
     * @param width largeur de la carte
     * @param height hauteur de la carte
     */
    public Map(int width, int height) {
        cases = new HashMap<Coordonnee, Case>();
        Coordonnee temp = new Coordonnee(0, 0);
        this.cases.put(temp, new CaseClassic(temp));
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                temp = new Coordonnee(i, j);
                this.cases.put(temp, new CaseClassic(temp));
            }
        }
        
    }
    
    /**
     * Fonction qui retourne la liste entières de Cases
     * @return la listes des Cases qui compose la Carte
     */
    public Collection<Case> getCases(){
        return this.cases.values();
    }
    
    /**
     * Retourne la case en fonction des coordonnées
     * @param c coordonnées de la case recherchée
     * @return la case recherchée
     */
    public Case getCase(Coordonnee c) {
        return cases.get(c);
    }
    
    public void init(){
        
    }
      
  
        
}
