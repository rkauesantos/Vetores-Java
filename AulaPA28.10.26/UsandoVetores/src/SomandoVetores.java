import java.util.Scanner;

public class SomandoVetores {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], c[], i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o " + (i+1) + "º número: ");
			a[i] = Ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println("insira o " + (i+1) + "º número: ");
			b[i] = Ler.nextInt();
			
			c[i] = a[i] + b[i];
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("A soma de " + a[i] + " e " + b[i] + " é " + c[i]);
		}
		
		

	}

}
