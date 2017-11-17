/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet2017;

import static projet2017.Risque.prime;

/**
 *
 * @author ZARABE FILS
 */
// La sous-classe Producteur herite de Producteur et implemente l'interface Risque
public class ProducteurRisque extends Producteur implements Risque{
    public ProducteurRisque( String matricule , String nom , String prenom , int age , String Date_Entree , int nbre_Unite){
        super( matricule , nom , prenom , age , Date_Entree , nbre_Unite);
    }
        public double calculerSalaire(){
        return super.calculerSalaire()+prime;
    }
        public String getTitre(){
    return " Producteur Risque: ";
    }
    
}

