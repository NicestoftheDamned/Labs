package labInheritance;

public class Car extends Vehicle {
	
	private final int numberOfCylinders;
	
	public Car(int cylinders, int seats, int wheels)
	{
		super(seats, wheels);
		numberOfCylinders = cylinders;
	}
	
	@Override
	public String toString() 
	{
		return "Car with " + getNumberOfWheels() + " wheels and " + numberOfCylinders + " cylinders." + super.toString();
	}

}
