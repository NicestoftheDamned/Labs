package introGUI;
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

	public static void main(String[] args) {
	

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400, 600);
		frame.setLayout(new FlowLayout());
		frame.setBackground(Color.RED);
		frame.setSize(400, 600);
		frame.setLayout(new BorderLayout());
		Font font1 = new Font("Copperplate", Font.BOLD, 33);
		Font font2 = new Font("Copperplate", Font.BOLD, 77);
		Font font3 = new Font("Copperplate", Font.BOLD, 16);

		JLabel lbl1 = new JLabel("My First GUI");
		lbl1.setForeground(Color.GREEN);
		lbl1.setFont(font1);
		
		JButton btn1 = new JButton("WEST");
		
		JLabel lbl2 = new JLabel("Hi",SwingConstants.CENTER);
		lbl2.setFont(font2);
		lbl2.setForeground(Color.ORANGE);
		
		JTextField Text = new JTextField(16);
		JLabel lbl3 = new JLabel("Name");
		
		JPanel pnl1 = new JPanel();
		pnl1.setBackground(Color.BLUE);
		pnl1.add(lbl1);
		
		JPanel pnl2 = new JPanel(new BorderLayout());
		pnl2.setBackground(Color.RED);
		pnl2.add(lbl2);
		
		JPanel pnl3 = new JPanel();
		pnl3.add(lbl3);
		pnl3.add(Text);
		
		frame.add(pnl2,BorderLayout.CENTER);
		frame.add(btn1, BorderLayout.WEST);
		frame.add(pnl1,BorderLayout.NORTH);
		frame.add(pnl3, BorderLayout.SOUTH);
		
		
	}

}
