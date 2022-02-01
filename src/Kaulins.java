import java.util.Random;
import java.util.Scanner;

public class Kaulins {
    static void mest(int a){
		int sk;
		Random rand = new Random();
		for(int i=1; i<=a; i++){
		sk = rand.nextInt(6)+1;
		System.out.println("Uzkrita uz "+sk);
		}}
    
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int r; do{
		System.out.println("Cik reizes mest kaulinu: ");
		r = scan.nextInt();
		}while(r<1);
		mest(r);
		scan.close();
	}}