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
 // la Sous-classe Vendeur qui herite de Service Commercial  
public class Vendeur extends SerCommercial {
     // Le constructeur qui prend en parametre tous les attributs necessaires de sercommercial
    public Vendeur(String matricule , String nom , String prenom , int age , String Date_Entree , double chiffre_affaire){
        super(matricule , nom , prenom , age , Date_Entree , chiffre_affaire);     
    }
    
    // Ici on redefini la methode calculerSalaire, elle retourne le salaire du Vendeur
    public double calculerSalaire(){
        
    
        return 0.2*getChiffre_affaire()+100;
        
    }
    // Retourne le titre 
    public String getTitre(){
    return " Vendeur: ";
    }
    
    
}
