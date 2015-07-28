package layoutManager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.SwingConstants;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class LayoutManager extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	Boolean first = true;
	public static void main(String[] args) {
		Boolean first = true;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutManager frame = new LayoutManager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LayoutManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 400);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Futura", Font.PLAIN, 13));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{440, 0};
		gbl_contentPane.rowHeights = new int[]{75, 75, 75, 75, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblCantReadTiny = row1();
		GridBagConstraints gbc_lblCantReadTiny = new GridBagConstraints();
		gbc_lblCantReadTiny.fill = GridBagConstraints.BOTH;
		gbc_lblCantReadTiny.ipadx = 20;
		gbc_lblCantReadTiny.insets = new Insets(0, 0, 5, 0);
		gbc_lblCantReadTiny.gridx = 0;
		gbc_lblCantReadTiny.gridy = 0;
		contentPane.add(lblCantReadTiny, gbc_lblCantReadTiny);
		
		JButton btnNewButton_2 = row2();
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 1;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JLabel lblNewLabel = row3();
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnNewButton_3 = row4();
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 3;
		contentPane.add(btnNewButton_3, gbc_btnNewButton_3);
		
		btnNewButton_2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(btnNewButton_2.getBackground().equals(Color.BLUE))
					btnNewButton_2.setBackground(Color.GREEN);
				else if(btnNewButton_2.getBackground().equals(Color.GREEN)){
					btnNewButton_2.setBackground(Color.BLUE);
					lblNewLabel.setBackground(Color.YELLOW);
				}	
			}
					
			});	

	}

	private JButton row4() {
		JButton btnNewButton_3 = new JButton("Button");
		btnNewButton_3.setFont(new Font("Futura", Font.ITALIC, 20));
		btnNewButton_3.setBackground(Color.BLUE);
		btnNewButton_3.setOpaque(true);
		return btnNewButton_3;
	}

	private JLabel row3() {
		JLabel lblNewLabel = new JLabel("Hi");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 14));
		return lblNewLabel;
	}

	private JButton row2() {
		JButton btnNewButton_2 = new JButton("Click Me!");
		btnNewButton_2.setFont(new Font("Futura", Font.ITALIC, 22));
		btnNewButton_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2.setOpaque(true);
		btnNewButton_2.setActionCommand("Click Me");
		btnNewButton_2.setBackground(Color.BLUE);
		return btnNewButton_2;
	}

	private JLabel row1() {
		JLabel lblCantReadTiny = new JLabel("Can't Read Tiny Text");
		lblCantReadTiny.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblCantReadTiny.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCantReadTiny.setFont(new Font("Futura", Font.PLAIN, 13));
		lblCantReadTiny.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblCantReadTiny.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantReadTiny.setPreferredSize(new Dimension(129, 32));
		lblCantReadTiny.setForeground(new Color(0, 0, 0));
		lblCantReadTiny.setOpaque(true);
		lblCantReadTiny.setBackground(Color.RED);
		return lblCantReadTiny;
	}

}
