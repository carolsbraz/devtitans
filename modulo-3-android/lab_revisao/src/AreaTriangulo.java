import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int c = scan.nextInt();
	    
	    if(a + b <= c || a + c <= b || b + c <= a) {
	    	System.out.println("Triangulo invalido");
	    }else {
	    	
	    	float s = (a + b + c)/2;
	    	double A = Math.sqrt( s * (s - a) * (s - b) * (s - c));
	    	System.out.printf("%.2f\n", A);
	    	
	    }
	}
}
