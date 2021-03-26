import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        do {
            int DateActuelle;
            System.out.println("entrer la date");
            DateActuelle = x.nextInt();
        } while (DateActuelle <= 0 || DateActuelle >= 31);
        int DatePrecedente = DateActuelle - 1;
        System.out.println("la date precedente est:" + DatePrecedente);

        int DateSuivante = DateActuelle + 1;
        System.out.println("la date suivante est:" + DateSuivante);
    }
}
