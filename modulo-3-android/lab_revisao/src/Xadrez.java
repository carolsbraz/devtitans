import java.util.Scanner;

public class Xadrez {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int qtde = scan.nextInt();
	    for(int i = 0; i < qtde; i++) {
	    	if(i % 2 == 0) {
	    		for(int j = 0; j < qtde; j++) {
		    		System.out.print("* ");
		    	}
		    	System.out.println();
	    	}else {
	    		for(int j = 0; j < qtde; j++) {
		    		System.out.print(" *");
		    	}
		    	System.out.println();
	    	}
	    	
	    	
	    	
	    }
	}
}
