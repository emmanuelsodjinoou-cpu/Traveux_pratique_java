import java.util.Scanner ;
public class demandeage {
           public static void main(String[] args){
		   Scanner sc = new Scanner(System.in);
		   System.out.println("veillez saisir votre age :");
                 int age = sc.nextInt();
				 if(age>= 18){
				 System.out.println("vous etes mageur");}
				 else {
				 System.out.println("vous ete mineur");}
		   }
}