import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        do {
            int jour;
            System.out.println("Entrer le jour");
            jour = clavier.nextInt();
        } while (jour <= 0 || jour >= 31);
        do {
            int mois;
            System.out.println("Entrer le mois");
            mois = clavier.nextInt();
        } while (mois <= 0 || mois >= 12);
        do {
            int année;
            System.out.println("Entrer l'année");
            année = clavier.nextInt();
        } while (année <= 0 || année >= 2021);

        System.out.println("la date est :" + jour + "" + mois + "" + année);

    }

}