import java.util.Scanner;

public class TanqueCombustivel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int r = scan.nextInt(); // raio
	    int x = scan.nextInt(); // valor da altura do ar
	    int opcao = scan.nextInt(); // opção para saber se deseja calcular o volume de ar (opção 1) ou o volume de combustível no tanque (opção 2). 
	    
	    if(opcao != 1 && opcao != 2) {
	    	System.out.println("Opção inválida!");
	    	return;
	    }
	    
	    double Var = 0.0;
	    double V = 0.0;
	    
	    if(opcao == 1){
	    	Var = (Math.PI/3.0)*Math.pow(x, 2)*(3*r-x);
	    	System.out.printf("%.4f", Var);
	    }else {
	    	V = (4.0/3.0)*Math.PI*Math.pow(r, 3);
	    	Var = (Math.PI/3.0)*Math.pow(x, 2)*(3*r-x);
	    	System.out.printf("%.4f", V - Var);
	    }
	    
	    	}
}
