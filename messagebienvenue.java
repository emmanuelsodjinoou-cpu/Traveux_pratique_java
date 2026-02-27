import java.util.Scanner ;
public class messagebienvenue {
           public static void main(String[] args){
		   Scanner sc = new Scanner(System.in);
		   System.out.println("veillez saisir votre nom :");
                 String nom = sc.nextLine();
				 Sytem.out.println("veillez saisir votre prenom:");
				 String prenom = sc.nextLine();
				 Sytem.out.println("veillez saisir votre age:");
				 int age= sc.nextInt();
                System.out.println("Bienvenue monsieur"+" "+ nom+" "+prenom+"."+",vous avez"+age+"ans." );
		   }
}