import java.util.canner;
public class menuakbooy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numfinal;
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un n�mero:");
		double num1 = Double.parseDouble(scan.nextLine());
		System.out.println("Escribe otro n�mero:");
		double num2 = Double.parseDouble(scan.nextLine());
		System.out.println("Elige una de estas opciones\n"
				+ "1 - Suma\n"
				+ "2 - Resta\n"
				+ "3 - Multiplicaci�n\n"
				+ "4 - Divisi�n\n"
				);
		numfinal = -1;
		int eleccion = Integer.parseInt(scan.nextLine());
		if (eleccion == 1) {
			gehiketaEgin(num1, num2);
		}
		if (eleccion == 2) {
			kenketaEgin(num1, num2);
		}
		if (eleccion == 3) {
			biderketaEgin(num1, num2);
		}
		if (eleccion == 4) {
			zatiketaEgin(num1, num2);
		}
		if (eleccion == 5) {
			factorialEgin(num1, numfinal);
			}
		}

	private static void factorialEgin(double num1, double numfinal) {
		while(numfinal > 0) {
			num1 = num1 * numfinal;
				numfinal--;
		}
		System.out.println(num1);
	}

	private static void zatiketaEgin(double num1, double num2) {
		System.out.println(num1/num2);
		
	}

	private static void biderketaEgin(double num1, double num2) {
		System.out.println(num1*num2);
		
	}
		
		
		
	}


