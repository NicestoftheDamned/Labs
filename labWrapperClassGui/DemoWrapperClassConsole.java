package labWrapperClassGui;

public class DemoWrapperClassConsole {
    public static void main(String[] args)
    {
        DemoWrapperClass dwc = new DemoWrapperClass();

        System.out.println("Method minMax:\n");
        //method minMax
        System.out.println(dwc.minMax());
      

        System.out.println("\nMethod toBinary:\n");
        //method toBinary
        System.out.println(dwc.toBinary(15));

        System.out.println("\nMethod charProperties:\n");
		// method charProperties
        System.out.println(dwc.charProperties(' '));
        System.out.println(dwc.charProperties('1'));
        System.out.println(dwc.charProperties('B'));
        System.out.println(dwc.charProperties('b'));
    }

}
