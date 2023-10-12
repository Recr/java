package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Age extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Age frame = new Age();
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
	public Age() {
		setTitle("Verifier");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Age");
		lblNewLabel.setBounds(71, 14, 66, 14);
		contentPane.add(lblNewLabel);
		
		lblResult = new JLabel("");
		lblResult.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblResult.setBounds(71, 88, 295, 44);
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblResult);
		
		textField = new JTextField();
		textField.setBounds(147, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Verify");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a = Integer.parseInt(textField.getText());
				if(a < 18) {
					lblResult.setText("You're too young to vote!");
				}else {
					lblResult.setText("You're old enough to vote!");
				}
			}
		});
		btnNewButton.setBounds(243, 10, 76, 23);
		contentPane.add(btnNewButton);
	}

}
