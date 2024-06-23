import java.util.Scanner;

public class ArteAscii {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int qtde = scan.nextInt();
	    for(int i = 0; i < qtde; i++) {
	    	for(int j = qtde; j > i; j--) {
	    		System.out.print('*');
	    	}
	    	System.out.println();
	    }
	    for(int i = 1; i <= qtde; i++) {
	    	for(int j = 0; j < i; j++) {
	    		System.out.print('*');
	    	}
	    	System.out.println();
	    }
	}
}
