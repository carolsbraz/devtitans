import java.util.Scanner;

public class NumeroNeperiano {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        
        double e = 1.0;
        
        if(k != 1) {
        	for (int i = 1; i <= k-1; i++) {
                double denominador = 1.0;
                
                for (int j = 1; j <= i; j++) {
                    denominador *= j; 
                }
                
                e += 1.0 / denominador;
            }
        }
        
        System.out.printf("%.6f", e);
        
	}
}
