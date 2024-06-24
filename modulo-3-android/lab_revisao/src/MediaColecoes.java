import java.util.Scanner;

public class MediaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean acabouExecucao = false;
        
        while (!acabouExecucao) {
            double soma = 0;
            int count = 0;
            boolean novaColecao = true;
            boolean continuarSomando = true;
            
            while (continuarSomando) {
                int valor = scan.nextInt();
                
                if (valor == -1) {
                    if (novaColecao) {
                        acabouExecucao = true;
                        continuarSomando = false; 
                    } else {
                    	double media = soma/count;
                        System.out.printf("%.2f\n", media);
                        continuarSomando = false;
                    }
                } else {
                    soma += valor;
                    count++;
                    novaColecao = false;
                }
            }
        }

        scan.close();
    }
}
