package labInheritance;

public class InheritanceApp {

	public static void main(String[] args) {
		
		Car car = new Car(6, 5, 4);
		System.out.printf("%s%n", car);
		Car.start();
		Car.stop();
		
		Plane plane = new Plane(21, 4);
		System.out.printf("%s%n", plane);
		Plane.start();
		Plane.stop();
		System.out.println();
		
		Ship ship = new Ship(50, true);
		System.out.printf("%s%n", ship);
		Ship.start();
		Ship.stop();
		System.out.println();
		
		Ship ship2 = new Ship(100, false);
		System.out.printf("%s%n", ship2);
		Ship.start();
		Ship.stop();
		System.out.println();

	}

}
