import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int valor = scan.nextInt();
	    while(valor != -1) {
	    	if(valor % 2 == 0) {
	    		System.out.println("PAR");
	    	}else {
	    		System.out.println("IMPAR");
	    	}
	    	valor = scan.nextInt();
	    }
	}
}
