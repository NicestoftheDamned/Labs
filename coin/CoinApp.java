package coin;

import java.awt.Dimension;

import javax.swing.JFrame;

public class CoinApp {

	public static void main(String[] args) {
		
		// display window
		CoinGui coin = new CoinGui();
		coin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		coin.setSize(new Dimension(500, 300));
		coin.setVisible(true);
		
		for(Coin c:Coin.values()){
			System.out.println(c.toString());
			
		}
		
		

	}

}
