import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Pet_Store {
	int sum=0;
	private JFrame frame;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;

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
		frame.setBounds(100, 100, 558, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(175, 201, 349, 228);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("Pet Store");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(243, 20, 95, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Animal:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(47, 75, 74, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton cat = new JRadioButton("Cat");
		cat.setBounds(95, 73, 103, 21);
		frame.getContentPane().add(cat);
		
		JRadioButton dog = new JRadioButton("Dog");
		dog.setBounds(95, 94, 103, 21);
		frame.getContentPane().add(dog);
		
		JRadioButton bird = new JRadioButton("Bird");
		bird.setBounds(95, 119, 103, 21);
		frame.getContentPane().add(bird);
		
		JLabel lblNewLabel_3 = new JLabel("Qnt");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(456, 75, 68, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Qnt");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(456, 96, 45, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("Type of Product:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(190, 75, 150, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		text1 = new JTextField();
		text1.setBounds(484, 74, 30, 19);
		frame.getContentPane().add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBounds(484, 95, 30, 19);
		frame.getContentPane().add(text2);
		text2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Qnt");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(433, 121, 45, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		text3 = new JTextField();
		text3.setBounds(484, 120, 30, 19);
		frame.getContentPane().add(text3);
		text3.setColumns(10);
		
	
		JButton checkout = new JButton("Checkout");
		checkout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("------- Thank you for the purchase!--------\n");
			}
		});
		checkout.setFont(new Font("Tahoma", Font.PLAIN, 12));
		checkout.setBounds(37, 349, 95, 73);
		frame.getContentPane().add(checkout);
		
		JLabel lblNewLabel_6 = new JLabel("For every purchase over 10 LV is included a free candy for your pet");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(155, 164, 389, 38);
		frame.getContentPane().add(lblNewLabel_6);
		
		JCheckBox food = new JCheckBox("Food- 3LV");
		food.setFont(new Font("Tahoma", Font.PLAIN, 14));
		food.setBounds(318, 73, 93, 21);
		frame.getContentPane().add(food);
		
		JCheckBox toilet = new JCheckBox("Toilet- 5LV");
		toilet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		toilet.setBounds(318, 94, 124, 21);
		frame.getContentPane().add(toilet);
		
		JCheckBox accessories = new JCheckBox("Accessories- 4LV");
		accessories.setFont(new Font("Tahoma", Font.PLAIN, 14));
		accessories.setBounds(298, 117, 170, 21);
		frame.getContentPane().add(accessories);
		
		
		JButton bag = new JButton("Add to bag");
		bag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				if(food.isSelected()) {
					sum+=3;
				}
				if(toilet.isSelected()) {
					sum+=5;
				}
				if(accessories.isSelected()) {
					sum+=4;
				}
				
				textArea.append("Your goods are added to bag!\n");
			}
		});
		bag.setFont(new Font("Tahoma", Font.PLAIN, 11));
		bag.setBounds(37, 215, 95, 44);
		frame.getContentPane().add(bag);
		
		
		
		JButton clean = new JButton("Clean all");
		clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cat.setSelected(false);
				dog.setSelected(false);
				bird.setSelected(false);
				food.setSelected(false);
				toilet.setSelected(false);
				accessories.setSelected(false);
				text1.setText("");
				text2.setText("");
				text3.setText("");
				textArea.setText("");
				
			}
		});
		clean.setFont(new Font("Tahoma", Font.PLAIN, 12));
		clean.setBounds(37, 291, 95, 38);
		frame.getContentPane().add(clean);
		
	
		
		
	}
}
