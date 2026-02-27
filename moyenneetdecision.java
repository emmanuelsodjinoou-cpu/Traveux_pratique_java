import java.util.Scanner;

public class moyenneetdecision {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Demander les trois notes
        System.out.print("Entrez la première note : ");
        double note1 = sc.nextDouble();
        
        System.out.print("Entrez la deuxième note : ");
        double note2 = sc.nextDouble();
        
        System.out.print("Entrez la troisième note : ");
        double note3 = sc.nextDouble();
        
        // Calcul de la moyenne
        double moyenne = (note1 + note2 + note3) / 3;
        
        // Affichage de la moyenne
        System.out.println("La moyenne est : " + moyenne);
        
        // Condition
        if (moyenne >= 10) {
            System.out.println("Admis");
        } else {
            System.out.println("Ajourné");
        }
        
        sc.close();
    }
}