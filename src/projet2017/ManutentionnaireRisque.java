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
   // La sous-classe ManutentionnaireRisque herite de Manutentionnaire et implemente l'interface Risque
public class ManutentionnaireRisque extends Manutentionnaire implements Risque {
    public ManutentionnaireRisque( String matricule , String nom , String prenom , int age , String Date_Entree , int nbre_Heure){
            super( matricule , nom , prenom , age , Date_Entree , nbre_Heure);
    }
    public double calculerSalaire(){
        return super.calculerSalaire()+prime;
    }
    public String getTitre(){
    return " Manutennaire Risque: ";
    }
    
}
