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
// La Classe Service commercial qui herite d'employe
public abstract  class SerCommercial extends Employe{
    private double chiffre_affaire;
    
     // Le constructeur qui prend en parametre tous les attributs necessaires d'Employe et l'attribut propre a lui, parce qu'elle herite d'employe
    public SerCommercial(String matricule , String nom , String prenom , int age , String Date_Entree , double chiffre_affaire){
        super(matricule , nom , prenom , age , Date_Entree);
        this.chiffre_affaire=chiffre_affaire;
    
    }
    // permet d'acceder a l'attribut protege de serCommercial
    public double getChiffre_affaire(){
        return chiffre_affaire;
    }
}
