import java.util.Random;
import java.util.Scanner;

public class Kaulins {
    static void mestkaulinu(int a){
		int skaitlis;
		Random rand = new Random();
		for(int i=1; i<=a; i++){
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita: "+skaitlis);
		}
    }
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int reizes;
		do{
		System.out.println("Cik reizes mest: ");
	    reizes = scan.nextInt();
		}while(reizes<1);
		mestkaulinu(reizes);
		scan.close();
	}

}
