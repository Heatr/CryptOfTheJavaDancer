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
import projet.tutoré.map.cases.CaseFactory;
import projet.tutoré.map.cases.CaseStair;
import projet.tutoré.map.cases.CaseWall;



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
    /**public Map(int width, int height) {
        cases = new HashMap<Coordonnee, Case>();
        Coordonnee temp = new Coordonnee(0, 0);
        //this.cases.put(temp, new CaseClassic(temp));
        for(int i=1;i<width-1;i++){
            for(int j=1;j<height-1;j++){
                temp = new Coordonnee(i, j);
                if (j==1){
                    //On regarde si on parle de la ligne du haut
                    this.cases.put(temp, new CaseWall(temp));
                }else{
                    this.cases.put(temp, new CaseClassic(temp));
                }
            }
        }  
    }*/
    
    public Map(int width, int height){
        String s = "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW"
                 + "WWWCCCCCCCCWWWWWWWWWWCCCCCCCCCCCCCCWWWW"
                 + "WWWCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCWWWW"
                 + "WWWCCCCCCCCWWWWWWWWWWCCCCCCCCCCCCCCWWWW"
                 + "WWWCCCCCCCCWWWWWWWWWWCCCCCCCCCCCCCCWWWW"
                 + "WWWWWWCWWWWWWWWWWWWWWCCCCCCCCCCCCCCWWWW"
                 + "WWWWWWCWWWWWWWWWWWWWWCCCCCCCCCCCCCCWWWW"
                 + "WWWWWWCWWWWWWWWWWWWWWWWWCWWWWWWWCWWWWWW"
                 + "WWWWWWCWWWWWWWWWWWWWWWWWCWWWWWWWCWWWWWW"
                 + "WWWWWWCWWWWWWWWWWWWWWWWWCWWWWWWWCWWWWWW"
                 + "WWWWWWCWWWWWWWWWWWWWWCCCCCCCWWWWCWWWWWW"
                 + "WCCCCCCCCCCCCCWWWWWWWCCCCCCCWWWWCWWWWWW"
                 + "WCCCCCCCCCCCCCWWWWWWWCCCCCCCWWWWCWWWWWW"
                 + "WCCCCCCCCCCCCCCCCCCCCCCCCCCCWWWWCWWWWWW"
                 + "WCCCCCCCCCCCCCWWWWWWWCCCCCCCWWWWCWWWWWW"
                 + "WCCCCCCCCCCCCCWWWWWWWWWWWWWWWWWWCWWWWWW"
                 + "WCCCCCCCCCCCCCWWWWWWWWWWWWWWWWWWCWWWWWW"
                 + "WCCCCCCCCCCCCCWWWWWWWWWWWWWCCCCCCCCCWWW"
                 + "WCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCSCCCCWWW"
                 + "WCCCCCCCCCCCCCWWWWWWWWWWWWWCCCCCCCCCWWW"
                 + "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW";
        
        int compt = 0;
        cases = new HashMap<Coordonnee, Case>();
        Coordonnee temp = new Coordonnee(0, 0);
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                temp = new Coordonnee(j, i);
                cases.put(temp, CaseFactory.creerCase(s.charAt(compt), temp));
                compt += 1;
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
    
    public void changeCase(Coordonnee c){
        this.cases.put(c, new CaseClassic(c));
    }
      
  
        
}
