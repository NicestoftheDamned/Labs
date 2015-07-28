package labPolymorphism;


public class DogApp
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Greyhound");
        System.out.printf("%s%n", myDog);
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        System.out.printf("%s%n", mySledDog);
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        System.out.printf("%s%n", myCircusDog);
        actAsDog(myCircusDog);
        
        System.out.println("Using an Array:\n");
        
        Dog[] dogs = new Dog[]{myDog, mySledDog, myCircusDog};
        
        for(Dog d:dogs){
        	System.out.printf("%s%n", d);
        	if(d instanceof SledDog){
        		SledDog sd = (SledDog) d;
        		sd.pullSled();
        	}	
        	actAsDog(d);
        }
    }

    private static void actAsDog(Dog d)
    {
        d.communicate();
        d.move();
        System.out.println();
    }
}
