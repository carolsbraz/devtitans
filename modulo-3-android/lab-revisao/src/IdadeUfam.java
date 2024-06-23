import java.util.Scanner;

public class IdadeUfam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int anoAtual = scan.nextInt();
		System.out.printf("A UFAM tem %d anos de fundacao", anoAtual - 1909);
	}
}
