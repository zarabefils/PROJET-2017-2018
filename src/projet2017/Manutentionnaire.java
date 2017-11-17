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
public class Manutentionnaire extends Employe{
    int nbre_Heure;
    // Le constructeur qui prend en parametre tous les attributs necessaires d'Employe et l'attribut propre a lui, parce qu'elle herite d'employe

    public Manutentionnaire( String matricule , String nom , String prenom , int age , String Date_Entree , int nbre_Heure){
            super( matricule , nom , prenom , age , Date_Entree);
            this.nbre_Heure=nbre_Heure;
    }
    public double calculerSalaire(){
        return nbre_Heure*65;
    }
    public String getTitre(){
    return " Manutentionnaire: ";
    }
    
}
