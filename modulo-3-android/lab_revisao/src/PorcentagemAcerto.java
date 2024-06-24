import java.util.Scanner;

public class PorcentagemAcerto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] respostas = new int[100];
		int[] gabarito = new int[100];
		
		int count = 0;
		
	    int valor = scan.nextInt();
	    while(valor != -1) {
	    	respostas[count] = valor;
	    	count++;
	    	valor = scan.nextInt();
	    }
	    
	    count = 0;
		
	    valor = scan.nextInt();
	    while(valor != -1) {
	    	gabarito[count] = valor;
	    	count++;
	    	valor = scan.nextInt();
	    }
	    
	    double countAcertos = 0;
	    
	    for(int i = 0; i < count; i++) {
	    	if(respostas[i] == gabarito[i]) {
	    		countAcertos++;
	    	}
	    }
	    
	    double porcentagem = ((double) countAcertos / count) * 100;
	    
	    System.out.printf("%.2f", porcentagem);
	}
}
