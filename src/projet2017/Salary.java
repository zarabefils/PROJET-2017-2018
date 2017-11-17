
package projet2017;

public class Salary {
    
    // Ici on cree une instance "e" de type Personnel qui va ajoute un employe  
    public static void main(String[] args) {
        System.out.println("La Collection d'employe et le salaire mensuel de chacun");
       Personnel e =new Personnel();
       e.ajouterEmploye(new Vendeur( "EFR0A02" , "Mamoudou" , "Sali" , 34 , "2006" , 450000.0));
       e.ajouterEmploye(new Representateur( "EFR0C15" , "Bouba" , "Yaya" , 27 , "2015", 800000.0));
       e.ajouterEmploye(new Producteur( "EFR0C22" , "Jean" , "Pierre" , 40 , "1998" , 90000));
       e.ajouterEmploye(new Manutentionnaire( "EFR003A" , "Solange" , "Paul" , 21 , "2016" , 6000));
       e.ajouterEmploye(new ProducteurRisque( "EFR222B" , "Bamba" , "Simon" , 38 , "1999" , 4444));
       e.ajouterEmploye(new ManutentionnaireRisque( "EFR120B" , "Kamga" , "Baibai" , 24 , "2017" , 1660));
       
       e.afficherSalaire();
       System.out.println("Le Salaire moyen dans l'entreprise est de : "  );
       System.out.println(e.salaireMoyen() +  " Francs"  );
    }
    
}
