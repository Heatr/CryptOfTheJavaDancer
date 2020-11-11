/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.tutoré;

import java.util.ArrayList;
import java.util.Collection;
import javafx.scene.Parent;



/**
 *Classe représentant la carte, elle est composée de plusieurs cases
 * @author dm645996
 */
public class Map extends Parent{

    private ArrayList<Case> cases;
    
    /**
     * Crée une nouvelle instance de Map
     * Calcule le nombre de case puis en crée le même nombre et les ajoute dans cases
     * @param width largeur de la carte
     * @param height hauteur de la carte
     */
    public Map(int width, int height) {
        cases = new ArrayList<Case>();
        this.cases.add(new CaseClassic(0,0));
        for(int i=0;i<width;i+=50){
            for(int j=0;j<height;j+=50){
                this.cases.add(new CaseClassic(i,j));
            }
        }
        
    }
    
    /**
     * Fonction qui retourne la liste entières de Cases
     * @return la listes des Cases qui compose la Carte
     */
    public Collection<Case> getCases(){
        return this.cases;
    }
    
    public Case getCase() {
        return null;
    }
    
    public void init(){
        
    }
      
  
        
}
