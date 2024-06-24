import java.util.Scanner;

public class SomaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean acabouExecucao = false;
        
        while (!acabouExecucao) {
            int soma = 0;
            boolean novaColecao = true;
            boolean continuarSomando = true;
            
            while (continuarSomando) {
                int valor = scan.nextInt();
                
                if (valor == -1) {
                    if (novaColecao) {
                        acabouExecucao = true;
                        continuarSomando = false; 
                    } else {
                        System.out.println(soma);
                        continuarSomando = false;
                    }
                } else {
                    soma += valor;
                    novaColecao = false;
                }
            }
        }

        scan.close();
    }
}
