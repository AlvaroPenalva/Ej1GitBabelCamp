import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca tres número para comprobar si son primos");
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();		
		HiloEsPrimo primo1 = new HiloEsPrimo(num);
		primo1.start();
		
		num = scan.nextInt();
		HiloEsPrimo primo2 = new HiloEsPrimo(num);
		primo2.start();
		
		num = scan.nextInt();	
		HiloEsPrimo primo3 = new HiloEsPrimo(num);
		primo3.start();
		
		scan.close();
		
	}

}
