package coin;

	public enum Coin { CENT(2.5, 19.1), NICKLE(5, 21.21), DIME(2.268, 17.91), QUARTER(5.670, 24.26);

	private final double weight;
	private final double diameter;
	
	Coin(double w, double d){
		weight = w;
		diameter = d;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name() + " " + "w:" + weight + " " + "d:" + diameter;
	}



}