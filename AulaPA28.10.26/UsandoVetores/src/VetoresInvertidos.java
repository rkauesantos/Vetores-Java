import java.util.Scanner;

public class VetoresInvertidos {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o " + (i+1) + "º número: ");
			a[i] = Ler.nextInt();
			
			b[9-i] = a[i];
		}
		
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]);
			System.out.print(" ");
		}
		
		

	}

}
