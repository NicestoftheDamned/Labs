package labInheritance;

public class Plane extends Vehicle{
	
	private final int wingspan;
	
	public Plane(int wing, int seats)
	{
		super(seats);
		wingspan = wing;
	}
	
	@Override
	public String toString() 
	{
		return "Plane with " + wingspan + " wingspan" + super.toString();
	}
	
		

}
