
public class HiloEsPrimo extends Thread {
	int num;

	public HiloEsPrimo(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean esPrimo = true;
		if (num == 0 || num == 1 || num == 4) {
			esPrimo = false;
		} else {
			for (int x = 2; x < num; ++x) {
				if (num % x == 0)
					esPrimo = false;

			}
		}
		if (esPrimo)
			System.out.println("El numero " + num + " es primo");
		else System.out.println("El numero " + num + " no es primo");
	}
}
