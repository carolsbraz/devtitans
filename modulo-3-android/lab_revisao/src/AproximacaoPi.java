import java.util.Scanner;

public class AproximacaoPi {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        double soma = 3.0;
        System.out.printf("%.6f\n", soma);
        
        boolean somar = true;
        
        if(N != 1) {
        	 for (int i = 2, termoCount = 0; termoCount < N-1; i += 2, termoCount++) {
                 double termo = 4.0 / (i * (i + 1) * (i + 2)); 
                 if (somar) {
                     soma += termo;
                 } else {
                     soma -= termo;
                 }
                 System.out.printf("%.6f\n", soma);
                 somar = !somar;
             }
        }
        
	}
}
