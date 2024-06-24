import java.util.ArrayList;
import java.util.Scanner;

public class NumeroNarcisista {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    int aux = num;
	    int count = 0;
	    int soma = 0;
	    
	    ArrayList<Integer> valores = new ArrayList<Integer>();
	    
	    while (num > 0) {
	    	count++;
	    	valores.add(num % 10);
	    	num /= 10;
        }
	    
	    for(int i = 0; i < count; i++) {
	    	soma += Math.pow(valores.get(i), count);
	    	
	    }
	    
	    
	    if(soma == aux) {
	    	System.out.println("SIM");
	    }else {
	    	System.out.println("NAO");
	    }
	    
	    
	}
}
