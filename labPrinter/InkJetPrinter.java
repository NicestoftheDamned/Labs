package labPrinter;

public class InkJetPrinter extends Printer {
	
	private int remainingCartridge=100;
	
	public InkJetPrinter(int sNum){
		super(sNum);		
	}
		public void print(){
			if(remainingCartridge > 0)
				System.out.println("Remaining Cartridge: " + remainingCartridge + "%");
			else{
				System.out.println("Cartridge is empty");	
	}
		remainingCartridge -= 10;
	}
	public int getRemainingCartridge(){
		return remainingCartridge;
	}
}
