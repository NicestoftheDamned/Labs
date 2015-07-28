package exceptionHandling;

import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionHandling {
	
	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		boolean done = false;
		do{
	try{
		int digit = numberFromUser();
		int result = sevenModulusN(digit);
		System.out.printf("7 %% %d = %d", digit, result);
		done = true;
			
		}catch(InputMismatchException e){
			System.out.println("The number needs to be a whole number");
		//	input.next();
		}catch(IllegalArgumentException e){
			e.getMessage();
			System.out.println("An error occured");
		}catch(ArithmeticException e){
			e.getMessage();
			System.out.println("Zero cannot be divided.");
		}
		
		}while(!done);
	}
	private static int numberFromUser()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("number: ");
		int number = input.nextInt();
		return number;
	}

	private static int sevenModulusN(int number)
	{
		return 7 % number;
	}

}

