import java.util.Scanner;
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
				+ "4 - Divisi�n\n");};
	}