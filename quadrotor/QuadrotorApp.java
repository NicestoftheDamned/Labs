package quadrotor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuadrotorApp {

	public static void main(String[] args) {
		List<Quadrotor> rotors = Arrays.asList(
				new Quadrotor(2,4,2), new Quadrotor(3,4,4), new Quadrotor(4,4,6),
				new Quadrotor(5,4,2), new Quadrotor(6,4,4), new Quadrotor(7,4,6));
		
		System.out.println(rotors.toString());
		changeOrientation(rotors);
		System.out.println(rotors);
		
		Quadrotor search = new Quadrotor(4,6,4);
		
		if (rotors.contains(search)){
			System.out.printf("Rotors does contain %s\n", search);
			
		}else{
			System.out.printf("Rotors does not contain %s\n", search);
		}
		
		rotors = new ArrayList<Quadrotor>(Arrays.asList( new Quadrotor(2,4,2), new Quadrotor(3, 4, 4), new Quadrotor(4, 4, 6), 
											new Quadrotor(5, 4, 2), new Quadrotor(6, 4, 4), new Quadrotor(7, 4, 6)));
		
			changeOrientation(rotors);
			// remove search
			rotors.remove(search);
			System.out.println(rotors);
			
			// remove element 0
			rotors.remove(0);
			System.out.println(rotors);
						
		}

	private static void changeOrientation(List<Quadrotor> array){
		
		Quadrotor temp[] = new Quadrotor[array.size()];
		int i = 0;
		for(Object o : array)
		{
			Quadrotor q = (Quadrotor)o;
			int x = q.getX();
			int y = q.getY();
			int z = q.getZ();

			temp[i] = new Quadrotor(y,x,z);
			i++;
		}

		int j = 0;
		for(Quadrotor Q : temp)
		{
			array.set(j,Q);
			j++;
		}
	}

	}


