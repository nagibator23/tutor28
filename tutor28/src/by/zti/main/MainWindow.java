package by.zti.main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainWindow extends JFrame {

	public MainWindow(int width, int height) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(640,480);
		getContentPane().setLayout(null);
		
		JPanel panel1=new JPanel(null);
		JPanel panel2=new JPanel(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 65, 535, 273);
		getContentPane().add(tabbedPane);
		setVisible(true);
		setResizable(false);
		tabbedPane.addTab("Tab1", panel1);
		
		JTextArea txtrEnterUrlHere = new JTextArea();
		txtrEnterUrlHere.setText("Enter URL here...");
		txtrEnterUrlHere.setBounds(64, 37, 440, 239);
		panel1.add(txtrEnterUrlHere);
		
		JButton btnNewButton = new JButton("Get Image");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(1);
			}
		});
		btnNewButton.setBounds(10, 3, 166, 23);
		panel1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Get File");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(267, 3, 159, 23);
		panel1.add(btnNewButton_1);
		tabbedPane.addTab("Tab2", panel2);
		panel2.setLayout(null);
		
		Choice choice = new Choice();
		choice.setBounds(450, 40, 51, 20);
		panel2.add(choice);
		choice.add("png");
		choice.add("jpg");
		
		JLabel lblNewLabel = new JLabel("format:");
		lblNewLabel.setBounds(398, 41, 46, 14);
		panel2.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("View");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(22, 37, 89, 23);
		panel2.add(btnNewButton_2);
		
	}
}
