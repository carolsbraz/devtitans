import java.util.Scanner;

public class SomaDigitos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    
	    int soma = 0;
        
        while (a > 0) {
            soma += a % 10; 
            a /= 10; 
        }
        
        System.out.println(soma);
	}
}
