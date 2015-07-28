package labFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MountainApp {
	public static void main(String[] args) throws FileNotFoundException {
		
		LinkedList <Mountain> mountainList = new LinkedList();
		
		
		try(Scanner reader = new Scanner(MountainApp.class.getResourceAsStream("Mountains.csv"))){
				while(reader.hasNext()){
				String mtn = reader.nextLine();
				
				Mountain mountain = getMountain(mtn);
				if(mountain != null){
					mountainList.add(mountain);
				}
			}
			
		}
			for(Mountain m:mountainList){
				System.out.println(m.toString());
			}
		}

			private static Mountain getMountain(String mtn) {
				String[] a=  mtn.split(",");
				Mountain mount;
				try{
					mount = new Mountain(a[0], Integer.parseInt(a[1]), Boolean.parseBoolean(a[2])); 
					return mount;
				}
				catch(NumberFormatException e){
					e.getStackTrace();
					System.out.println("Not a Number");
				}
				return null;
		
		
	}
	}

