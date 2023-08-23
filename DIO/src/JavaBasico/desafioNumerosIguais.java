package JavaBasico;
import java.util.Scanner;
import java.util.*;

public class desafioNumerosIguais {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1 = entrada.nextInt();
		int numero2 = entrada.nextInt();
		
		
		if (numero1==numero2) {
			System.out.println("Sao iguais! ");
		}
		
		
		else {
			System.out.println("Nao sao iguais!");
		}

	}

}
