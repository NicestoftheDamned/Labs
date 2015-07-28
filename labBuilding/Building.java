package labBuilding;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Building extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// TODO: write code to draw the building
		Random rand = new Random();
		
		int rd = rand.nextInt(2) * 255;
		int gr = rand.nextInt(2) * 255;
		int bl = rand.nextInt(2) * 255;
              
		g.setColor(new Color(rd,gr,bl));
		g.fillRect(75, 50, 300, 400 );
		
		for(int i=90; i<325; i+=75)
		{
			for(int j=80; j<400; j+=75)
			{	
			g.setColor(new Color(rd,gr,bl));
			g.fill3DRect(i, j, 35, 50, true);
			}
		}
	}	
}
