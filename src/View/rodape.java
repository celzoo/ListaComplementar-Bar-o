package View;
import java.util.Scanner;
import entity.Retangulo;
public class rodape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diga a altura de um local");
		double  altura = sc.nextDouble();
		
		System.out.println("Diga a base de um local");
		int base = sc.nextInt();
		
		
		
		Retangulo retangulo = new Retangulo(altura, base);
		
		System.out.println(retangulo.calcularArea());
		System.out.println(retangulo.calcularPerimetro());
		
	

	}

}
