package printTimesTable;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TimeTable {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("TimeTable.txt");
			for(int i=0; i<=10; i++)
			{
				for(int j=0; j<=10; j++){
				pw.format("%d + %d", i, j);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Available");
			e.printStackTrace();
		}

	}

}
