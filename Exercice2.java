import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        do{
            int annee;
            System.out.println("Entrer l'annee");
            Annee= x.nextInt();
        }while(annee<=0 || annee>=2021);
        do{
            int choix;
            System.out.println("Entrer votre choix");
            choix= x.nextInt();
        }while(choix<1 || choix>12);
        int mois;
        System.out.println("Entrer le mois");
        if (mois!=2){
            System.out.println("le nombre de jour");
            NombreDeJour=31;
        }else 
            if(annee % 400==0) || (annee % 4==0)){
                System.out.println("le mois compte 29jours");
            }else{
                System.out.println("le mois compte 28jours");
            }

        }
}