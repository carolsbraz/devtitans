import java.util.Scanner;

public class RotaOrtodromica {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		double t1, t2, g1, g2, t1rad, t2rad, g12rad, d;
		
		t1 = scan.nextDouble();
		t2 = scan.nextDouble();
		g1 = scan.nextDouble();
		g2 = scan.nextDouble();
		
		double g12 = g1 - g2;
		
		t1rad = Math.toRadians(t1);
		t2rad = Math.toRadians(t2);
		g12rad = Math.toRadians(g12);
		
		int r = 6371;
		
		d = r * Math.acos(Math.sin(t1rad) * Math.sin(t2rad) + Math.cos(t1rad) * Math.cos(t2rad) * Math.cos(g12rad));
		
		System.out.println(d);
		
	}
}
