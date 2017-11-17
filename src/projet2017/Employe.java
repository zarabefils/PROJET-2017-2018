
package projet2017;
// La classe Employe avec ces sous-classes

import static projet2017.Risque.prime;


public  abstract class Employe {
    private String matricule;
    private String nom;
    private String prenom;
    private int age;
    private String Date_Entree;
    
    static final private double Salaire_Base=110.000;
    // Le constructeur qui prend en parametre tous les attributs necessaires d'Employe
 public Employe(String matricule , String nom , String prenom , int age , String Date_Entree){
           
     this.matricule=matricule;
     this.nom=nom;
     this.prenom=prenom;
     this.age=age;
     this.Date_Entree=Date_Entree;
     
 }
    public abstract double calculerSalaire();
    // On declare une methode getTitre qui va retourne le type de l'employe
    public String getTitre(){
    return "L'employe ";
    }
    // getNom() permet d'afficher le type d'employe, son prenom et nom
    String getNom(){
        return  getTitre()  +" "+ prenom + " "  + nom; 
    }    
}



    
 



