import java.util.Scanner;

public class ImprimindoOQuadradoDeVetores {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o " + (i+1) + "º número para calcularmos o quadrado dele: ");
			a[i] = Ler.nextInt();
			
			b[i] = a[i] * a[i];
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("O quadrado de " + a[i] + " é: " + b[i]);
		}
		
		

	}

}
