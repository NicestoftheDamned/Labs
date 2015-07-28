package quadrotor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuadrotorApp {

	public static void main(String[] args) {
		List<Quadrotor> rotors = Arrays.asList(
				new Quadrotor(2,4,4), new Quadrotor(3,4,4), new Quadrotor(4,4,6),
				new Quadrotor(5,4,2), new Quadrotor(6,4,4), new Quadrotor(7,4,6));
		
		System.out.println(rotors.toString());
	//	changeOrientation(rotors);
		System.out.println(rotors);
		
		Quadrotor quad = new Quadrotor(4,6,4);
		
//		if (rotors.contains(quad));
//			rotors.remove(index);
//			System.out.println(rotors);
		
	}
	private static <Quadrotor> void changeOrientation(){
		
			
			
		}
		
		
	}
//}


