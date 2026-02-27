import java.util.Scanner ;
public class comparaison{

           public static void main(String[] arg){
                Scanner sc = new Scanner(System.in);
                System.out.println("veillez saisir deux nombres entier:");
                 int a = sc.nextInt();
				 int b = sc.nextInt();
				if (a>b){
					System.out.println("le plus grand nombre  entre a et b est : " +a);
					System.out.println("le plus petit entre a et b est : " +b);}
				else {
					System.out.println("le plus petit entre a et b est : " +a);
				    System.out.println("le plus grand nombre  entre a et b est : " +b);}
				   }
}
