package labPrinter;

public class PrinterApp {

	public static void main(String[] args) {
		Printer iprinter = new InkJetPrinter(24681);
		System.out.println(iprinter);
		iprinter.print();
		System.out.println();
		
		Printer lprinter = new LaserPrinter(13579);
		System.out.println(lprinter);
		lprinter.print();
		System.out.println();
		
		System.out.println("Array of Printers:");
		
		Printer[] printers = {iprinter, lprinter};
		for(Printer p:printers)
		{
			System.out.println(p);
			p.print();
			p.print();
			System.out.println();
		}
		
	}

}
