import java.util.Scanner;

public class SomaColecao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0;
	    int valor = scan.nextInt();
	    while(valor != -1) {
	    	soma += valor;
	    	valor = scan.nextInt();
	    }
	    
	    System.out.println(soma);
	}
}
