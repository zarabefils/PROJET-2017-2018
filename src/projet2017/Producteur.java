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
public class Producteur extends Employe {
    int nbre_Unite;
    public Producteur(String matricule , String nom , String prenom , int age , String Date_Entree , int nbre_Unite){
            super( matricule , nom , prenom , age , Date_Entree);
            this.nbre_Unite=nbre_Unite;
    }
    // Ici on redefini la methode calculerSalaire, elle retourne le salaire du producteur
    public double calculerSalaire(){
        return 5*nbre_Unite;
    }
    public String getTitre(){
    return " Producteur: ";
    }
    
            
}
