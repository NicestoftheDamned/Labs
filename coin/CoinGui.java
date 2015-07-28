package coin;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

import java.awt.TextField;
import java.awt.Color;
import javax.swing.UIManager;

public class CoinGui extends JFrame{
	public CoinGui() {
		getContentPane().setBackground(UIManager.getColor("Desktop.background"));
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
		JTextArea display = new JTextArea();
		display.setBackground(UIManager.getColor("Desktop.background"));
		display.setMargin(new Insets(60, 100, 50, 50));
		display.setFont(new Font("Futura", Font.PLAIN, 26));
		
		button3(display);
		
		button2(display);
		
		button1(display);
		
		button(display);

		display.setPreferredSize(new Dimension(500,150));;
		getContentPane().add(display);
	}

	private void button(JTextArea display) {
		JButton btnNewButton = new JButton();
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coin quarter = Coin.QUARTER;
				display.setText(quarter.toString());	
			}
		});
		btnNewButton.setMargin(new Insets(0, 4, 0, 4));
		btnNewButton.setPreferredSize(new Dimension(90, 90));
		Icon quarter = new ImageIcon(getClass().getResource("USQuarter.png"));
		btnNewButton.setIcon(quarter);
		getContentPane().add(btnNewButton);
	}

	private void button1(JTextArea display) {
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coin dime = Coin.DIME;
				display.setText(dime.toString());
			}
		});
		btnNewButton_1.setMargin(new Insets(0, 4, 0, 4));
		btnNewButton_1.setPreferredSize(new Dimension(90, 90));
		Icon dime = new ImageIcon(getClass().getResource("USDime.png"));
		btnNewButton_1.setIcon(dime);
		getContentPane().add(btnNewButton_1);
	}

	private void button2(JTextArea display) {
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coin nickel = Coin.NICKLE;
				display.setText(nickel.toString());
			}
		});
		btnNewButton_2.setMargin(new Insets(0, 4, 0, 4));
		btnNewButton_2.setPreferredSize(new Dimension(90, 90));
		Icon nickel = new ImageIcon(getClass().getResource("USNickel.png"));
		btnNewButton_2.setIcon(nickel);
		getContentPane().add(btnNewButton_2);
	}

	private void button3(JTextArea display) {
		JButton btnNewButton_3 = new JButton();
		btnNewButton_3.setFont(new Font("Futura", Font.PLAIN, 13));
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coin penny = Coin.CENT;
				display.setText(penny.toString());
				
			}
		});
		btnNewButton_3.setMargin(new Insets(0, 4, 0, 4));
		btnNewButton_3.setPreferredSize(new Dimension(90, 90));
		Icon penny = new ImageIcon(getClass().getResource("USCent.png"));
		btnNewButton_3.setIcon(penny);
		getContentPane().add(btnNewButton_3);
	}

}
