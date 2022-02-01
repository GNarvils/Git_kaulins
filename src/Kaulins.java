import java.util.Random;
import java.util.Scanner;

public class Kaulins {
    static void mestkaulinu(int a){
		int skaitlis, lielakais = 0;
		Random rand = new Random();
		for(int i=1; i<=a; i++){
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita: "+skaitlis);
		if(lielakais<skaitlis){
			lielakais = skaitlis;
		}
		}
		System.out.println("Lielakais skaits metienu reize ir "+lielakais);
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
