import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JFormattedTextField;
import java.awt.SystemColor;

public class Pet_Store {
	
	ButtonGroup group=new ButtonGroup();
	private JFrame frame;
	private JTextField text1TF;
	private JTextField text2TF;
	private JTextField text3TF;
	private JRadioButton cat;
	private JRadioButton dog;
	private JRadioButton bird;
	private JTextField totalTF;
	private JTextField giftTF;
	private JTextField taxTF;
	private JTextField subtotalTF;

	/**
	 * Launch the application.
	 */
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pet_Store window = new Pet_Store();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pet_Store() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		 
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.info);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(100, 100, 627, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pet Store");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(254, 10, 111, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Animal :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(85, 33, 93, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		cat = new JRadioButton("Cat");
		cat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cat.isSelected()) {
					dog.setSelected(false);
					bird.setSelected(false);
				}
			}
		});
		cat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cat.setBounds(95, 66, 60, 21);
		frame.getContentPane().add(cat);
		
		dog = new JRadioButton("Dog");
		dog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dog.isSelected()) {
					cat.setSelected(false);
					bird.setSelected(false);
				}
			}
		});
		dog.setFont(new Font("Tahoma", Font.PLAIN, 15));
		dog.setBounds(95, 96, 74, 21);
		frame.getContentPane().add(dog);
		
		bird = new JRadioButton("Bird");
		bird.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bird.isSelected()) {
					dog.setSelected(false);
					cat.setSelected(false);
				}
			}
		});
		bird.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bird.setBounds(95, 125, 83, 21);
		frame.getContentPane().add(bird);
		
		JLabel lblNewLabel_3 = new JLabel("Qnt");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(476, 69, 30, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Qnt");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(476, 96, 45, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Qnt");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(477, 109, 47, 37);
		frame.getContentPane().add(lblNewLabel_5);
		
		text1TF = new JTextField();
		text1TF.setBounds(516, 68, 30, 20);
		frame.getContentPane().add(text1TF);
		text1TF.setColumns(10);
		
		text2TF = new JTextField();
		text2TF.setBounds(516, 96, 30, 19);
		frame.getContentPane().add(text2TF);
		text2TF.setColumns(10);
		
		text3TF = new JTextField();
		text3TF.setBounds(516, 121, 30, 19);
		frame.getContentPane().add(text3TF);
		text3TF.setColumns(10);
		
	
		JButton Exit = new JButton("Exit");
		Exit.setBackground(SystemColor.text);
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Exit.setBounds(37, 349, 95, 73);
		frame.getContentPane().add(Exit);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("For every purchase over 15 LV is included a free candy for your pet !");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(95, 170, 484, 38);
		frame.getContentPane().add(lblNewLabel_6);
		
		JCheckBox food = new JCheckBox("Food  3LV");
		food.setFont(new Font("Tahoma", Font.PLAIN, 14));
		food.setBounds(377, 65, 93, 21);
		frame.getContentPane().add(food);
		
		JCheckBox toilet = new JCheckBox("Toilet  5LV");
		toilet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		toilet.setBounds(377, 93, 95, 21);
		frame.getContentPane().add(toilet);
		
		JCheckBox toys = new JCheckBox("Toys  4LV");
		toys.setFont(new Font("Tahoma", Font.PLAIN, 14));
		toys.setBounds(376, 118, 95, 21);
		frame.getContentPane().add(toys);
	
		JButton bag = new JButton("Calculate");
		bag.setBackground(SystemColor.text);
		bag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total;
				double subTotal=0;
				final double TAXRATE=0.1;
				double tax;
				
				if(dog.isSelected()&&food.isSelected()||cat.isSelected()&&food.isSelected()||bird.isSelected()&&food.isSelected()) {
					int text1=Integer.parseInt(text1TF.getText());
					subTotal+=3*text1;
				}
				if(dog.isSelected()&&toilet.isSelected()||cat.isSelected()&&toilet.isSelected()||bird.isSelected()&&toilet.isSelected()) {
					int text2=Integer.parseInt(text2TF.getText());
					subTotal+=5*text2;
				}
				if(dog.isSelected()&&toys.isSelected()||cat.isSelected()&&toys.isSelected()||dog.isSelected()&&toys.isSelected()) {
					int text3=Integer.parseInt(text3TF.getText());
					subTotal+=4*text3;
				}
			
				subtotalTF.setText(Double.toString(subTotal));
				
				
				tax=subTotal*TAXRATE;
				taxTF.setText(Double.toString(tax));
				
				total=subTotal+tax;
				totalTF.setText(Double.toString(total));
				
				if(total>=15) {
				  giftTF.setText("yes");
				}
				else {
					giftTF.setText("no");
				}
				
				
			}
		});
		bag.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bag.setBounds(37, 215, 95, 44);
		frame.getContentPane().add(bag);
		
		
		
		JButton clean = new JButton("Clean all");
		clean.setBackground(SystemColor.text);
		clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cat.setSelected(false);
				dog.setSelected(false);
				bird.setSelected(false);
				food.setSelected(false);
				toilet.setSelected(false);
				toys.setSelected(false);
				text1TF.setText("");
				text2TF.setText("");
				text3TF.setText("");
				subtotalTF.setText(null);
				taxTF.setText(null);
				totalTF.setText(null);
				giftTF.setText(null);
				
			}
		});
		clean.setFont(new Font("Tahoma", Font.PLAIN, 15));
		clean.setBounds(37, 291, 95, 38);
		frame.getContentPane().add(clean);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.control);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(37, 33, 192, 127);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.control);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(375, 33, 204, 127);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Type of Product :");
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		totalTF = new JTextField();
		totalTF.setBounds(317, 330, 96, 19);
		frame.getContentPane().add(totalTF);
		totalTF.setColumns(10);
		
		JLabel wfwfw = new JLabel("Total");
		wfwfw.setFont(new Font("Tahoma", Font.PLAIN, 16));
		wfwfw.setBounds(247, 327, 60, 21);
		frame.getContentPane().add(wfwfw);
		
		giftTF = new JTextField();
		giftTF.setBounds(317, 377, 96, 19);
		frame.getContentPane().add(giftTF);
		giftTF.setColumns(10);
		
		JLabel hahaha = new JLabel("Gift ?");
		hahaha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		hahaha.setHorizontalAlignment(SwingConstants.CENTER);
		hahaha.setBounds(247, 375, 45, 18);
		frame.getContentPane().add(hahaha);
		
		taxTF = new JTextField();
		taxTF.setBounds(317, 289, 96, 19);
		frame.getContentPane().add(taxTF);
		taxTF.setColumns(10);
		
		JLabel jajaja = new JLabel("Tax");
		jajaja.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jajaja.setBounds(247, 284, 37, 25);
		frame.getContentPane().add(jajaja);
		
		subtotalTF = new JTextField();
		subtotalTF.setBounds(317, 240, 96, 19);
		frame.getContentPane().add(subtotalTF);
		subtotalTF.setColumns(10);
		
		JLabel wewwe = new JLabel("Subtotal");
		wewwe.setForeground(Color.BLACK);
		wewwe.setBackground(Color.RED);
		wewwe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		wewwe.setBounds(243, 241, 93, 18);
		frame.getContentPane().add(wewwe);
		
		
		
	
		
		
	}
}
