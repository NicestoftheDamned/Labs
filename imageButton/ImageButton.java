package imageButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageButton extends JFrame{

		final JButton imgButton;
		final Icon clickImage;
		
		public ImageButton(){
			super("Lab Button");
			Icon image1= new ImageIcon( getClass().getResource("image1.png"));
			Icon image2 = new ImageIcon(getClass().getResource("image2.png"));
			clickImage = new ImageIcon(getClass().getResource("image3.gif"));
			imgButton = new JButton(image1);
			imgButton.setRolloverIcon(image2);
			add(imgButton);
			ButtonClickEventHandler handler = new ButtonClickEventHandler();
			imgButton.addActionListener(handler);
		}
		
		private class ButtonClickEventHandler implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
			imgButton.setRolloverEnabled(false);
			imgButton.setIcon(clickImage);
			
				
			}
			
		}
			
		}

