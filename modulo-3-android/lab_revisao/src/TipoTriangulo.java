import java.util.Scanner;

public class TipoTriangulo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int c = scan.nextInt();
	    
	    if(a + b <= c || a + c <= b || b + c <= a) {
	    	System.out.println("invalido");
	    }else {
	    	
	    	if(a == b && b == c) {
	    		System.out.println("equilatero");
	    	}else if(a == b || b == c) {
	    		System.out.println("isosceles");
	    	}else {
	    		System.out.println("escaleno");
	    	}
	    	
	    }
	}
}
