import java.util.Random;

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
		
		mestkaulinu(3);
		
	}

}
