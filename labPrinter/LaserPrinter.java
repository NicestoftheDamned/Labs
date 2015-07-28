package labPrinter;

public class LaserPrinter extends Printer {
	
	private int remainingToner=100;
	
	public LaserPrinter(int sNum){
		super(sNum);		
	}
		public void print(){
			if(remainingToner > 0)
				System.out.println("Remaining Toner: " + remainingToner + "%");
			else{
				System.out.println("Toner is empty");	
	}
			remainingToner -= 10;
	}
	public int getRemainingToner(){
		return remainingToner;
	}
}
