import java.util.Scanner;

public class FolhaPagamento {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    double valorHora = scan.nextDouble();
	    int quantidadeHoras = scan.nextInt();
	    double salarioBruto = valorHora * quantidadeHoras;
	    double descontoIR = salarioBruto * 0.11;
	    double descontoINSS = salarioBruto * 0.08;
	    double totalDesconto = descontoINSS + descontoIR;
	    double salarioLiquido = salarioBruto - totalDesconto;
		System.out.printf("Salario bruto: R$%.2f\n", salarioBruto);
		System.out.printf("IR: R$%.2f\n", descontoIR);
		System.out.printf("INSS: R$%.2f\n", descontoINSS);
		System.out.printf("Total de descontos: R$%.2f\n", totalDesconto);
		System.out.printf("Salario liquido: R$%.2f\n", salarioLiquido);
	}
}
