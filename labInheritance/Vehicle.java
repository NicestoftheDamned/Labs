package labInheritance;

public class Vehicle {
	
	private int numberOfSeats;
	private int numberOfWheels;
	
	public Vehicle(int seats)
	{
		setNumberOfSeats(seats);
	}
	
	public Vehicle(int seats, int wheels)
	{
		setNumberOfSeats(seats);
		setNumberOfWheels(wheels);
	}
	
	public static void start()
	{
		System.out.println("Starting...");
	}
	
	public static void stop()
	{
		System.out.println("Stopping...");
	}
	
	@Override
	public String toString() {
		return "...Number of Seats: " + getNumberOfSeats();
	}
	
	/**
	 * @return the numberOfSeats
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * @param numberOfSeats the numberOfSeats to set
	 */
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	/**
	 * @return the numberOfWheels
	 */
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	/**
	 * @param numberOfWheels the numberOfWheels to set
	 */
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

}
