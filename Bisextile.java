import java.util.Scanner;

public class Bisextile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Année;
        Année = scan.nextInt();

        System.out.println("Entrée une année:")

        if ((Année % 400 == 0) && (Année % 4 == 0)) {
            System.out.println("L'année est bisextile");
        } else {
            System.out.println("L'année n'est pas bisextile");
        }
    }
}