import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nombre = sc.nextInt();

        long factoriel = 1;

        if (nombre < 0) {
            System.out.println("Le factoriel n'est pas défini pour les nombres négatifs.");
        } else {
            for (int i = 1; i <= nombre; i++) {
                factoriel = factoriel * i;
            }

            System.out.println("Le factoriel de " + nombre + " est : " + factoriel);
        }

        sc.close();
    }
}