import java.util.Random;
import java.util.Scanner;

public class Kaulins {

	public static void main(String[] args) {
		
		int skaitlis;
		Random rand = new Random();
		Scanner scan =new Scanner(System.in);
		System.out.println("Cik reizes mest: ");
		int reizes = scan.nextInt();

		for(int i=1; i<=reizes; i++){
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita: "+skaitlis);
		}
		scan.close();
	}

}
