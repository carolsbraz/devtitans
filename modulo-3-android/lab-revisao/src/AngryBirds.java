import java.util.Scanner;

public class AngryBirds {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float v = scan.nextFloat();
		float alfa = scan.nextFloat();
		float d = scan.nextFloat();
		
		double radians = Math.toRadians(alfa);
		
		float R = (float) ((Math.pow(v, 2) * Math.sin(radians * 2))/9.8);
		
		 if (Math.abs(R - d) <= 0.1) {
			System.out.println("1");
		}else{
			System.out.println("0");
		}
	}
}
