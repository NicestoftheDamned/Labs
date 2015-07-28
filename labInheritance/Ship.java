package labInheritance;

public class Ship extends Vehicle {
	
	private boolean hasSail = true;

	public Ship(int seats, boolean sail) 
	{
		super(seats);
		hasSail = sail;
	}
	
	@Override
	public String toString() {
		if(hasSail)
		return "Ship with sail" + super.toString();
		else
		{
			return "Ship without sail" + super.toString();
		}
	}

}
