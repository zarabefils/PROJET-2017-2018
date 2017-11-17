/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet2017;

/**
 *
 * @author ZARABE FILS
 */
// Declaration de la classe Personnel
public class Personnel {
    private Employe[] Collection; // On cree un tableau de type Employe
    private int nombreEmploye;
    private int nbreMaxEmploye=150;
    public Personnel(){ // le constructeur qui est par default
    Collection = new Employe[nbreMaxEmploye];
    nombreEmploye=0;
    }
    // Ici la methode ajouterEmploye permet d'ajouter un employe dans la collection 
    public void ajouterEmploye(Employe c){
        ++nombreEmploye;
        if(nombreEmploye<=nbreMaxEmploye){ 
            Collection[nombreEmploye-1]=c;
        }else System.out.println("le nbre d'employe est limite a "   +nbreMaxEmploye);
        
    }
    public double salaireMoyen(){
        double addition = 0.0;
        for(int i=0; i<nombreEmploye; i++){
            addition += Collection[i].calculerSalaire();
    }
        return (addition / nombreEmploye);
        
    }
    public void afficherSalaire(){
        for(int i=0; i<nombreEmploye; i++){
            System.out.println("         ***************************  ");
            System.out.println(   Collection[i]. getNom()   +    " obtient "   +Collection[i]. calculerSalaire()     +    " Francs par Mois");
        }
    }
}




