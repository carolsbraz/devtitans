public class CarroMain {
	public static void main(String args[]) {
		
		Proprietario prop = new Proprietario("Caroline", 123456, 2002); 
		
		Placa pl = new Placa("NPB-5645", 1);
		
		Motor mt = new Motor(2, 8.85, 3);
		
		Carro car = new Carro("Fiat", "Idea", prop, pl, mt);
		
		System.out.println(car.getDescricao());
		
	}
}
