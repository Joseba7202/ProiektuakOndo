import java.util.Scanner;
public class menuakbooy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numfinal;
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un número:");
		double num1 = Double.parseDouble(scan.nextLine());
		System.out.println("Escribe otro número:");
		double num2 = Double.parseDouble(scan.nextLine());
		System.out.println("Elige una de estas opciones\n"
				+ "1 - Suma\n"
				+ "2 - Resta\n"
				+ "3 - Multiplicación\n"
				+ "4 - División\n"
				+ "5 - Factorial (primer número)");
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
		}}

	