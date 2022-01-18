import java.util.Random;

public class Kaulins {
    static void mestkaulinu(){
		int skaitlis;
		Random rand = new Random();
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita: "+skaitlis);
		
    }
	public static void main(String[] args) {
		
		mestkaulinu();
		
	}

}
