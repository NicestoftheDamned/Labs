package guiDemo;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.*;
	public class GuiWindow extends JFrame{

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//window.setVisible(true);
		window.setSize(400, 400);
		window.setLayout(new FlowLayout());
		window.setVisible(true);
		
		JPanel pan1 = new JPanel();
		pan1.setBackground(Color.MAGENTA);
		window.add(pan1);
		pan1.setSize(100, 300);
		JLabel label = new JLabel("label 1");
		pan1.add(label);
		pan1.setSize(100, 300);
		JButton button1 = new JButton("Cancel");
		window.add(button1);
		button1.setSize(100, 200);
		button1.setVisible(true);
		
		JPanel pan2 = new JPanel();
		pan2.setBackground(Color.CYAN);
		window.add(pan2);
		pan2.setSize(100, 400);
		JLabel label2 = new JLabel("label 2");
		pan2.add(label2);
		JButton button2 = new JButton("OK");
		window.add(button2);
		button2.setSize(100, 200);
		
		window.repaint();
	}

}
