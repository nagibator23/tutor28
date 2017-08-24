package by.zti.main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

public class MainWindow extends JFrame {

	private JPanel panel1;
	private JPanel panel2;
	private JTabbedPane tabbedPane;
	private JTextArea txtrEnterUrlHere;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private Choice choice;
	private JLabel lblNewLabel;
	private JButton btnNewButton_2;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmSaveImage;
	private JMenu mnOptions;
	private JMenuItem mntmExit;
	private JLabel imagelabel;
	private JPanel panel;
	private JScrollPane scrollPane;

	public MainWindow(int width, int height) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(640,480);
		getContentPane().setLayout(null);
		
		panel1=new JPanel(null);
		panel2=new JPanel(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 65, 535, 273);
		getContentPane().add(tabbedPane);
		
		setResizable(false);
		tabbedPane.addTab("Tab1", panel1);
		
		txtrEnterUrlHere = new JTextArea();
		txtrEnterUrlHere.setText("Enter URL here...");
		txtrEnterUrlHere.setBounds(64, 37, 440, 239);
		panel1.add(txtrEnterUrlHere);
		
		btnNewButton = new JButton("Get Image");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Main.setImage(new URL(txtrEnterUrlHere.getText()));
				} catch (Exception e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "invalid url or no internet connection");
				}
			}
		});
		btnNewButton.setBounds(10, 3, 166, 23);
		panel1.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Get File");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(267, 3, 159, 23);
		panel1.add(btnNewButton_1);
		tabbedPane.addTab("Tab2", panel2);
		panel2.setLayout(null);
		
		choice = new Choice();
		choice.setBounds(450, 40, 51, 20);
		panel2.add(choice);
		choice.add("png");
		choice.add("jpg");
		
		lblNewLabel = new JLabel("format:");
		lblNewLabel.setBounds(398, 41, 46, 14);
		panel2.add(lblNewLabel);
		
		btnNewButton_2 = new JButton("View");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Main.getImage()==null){return;}
				imagelabel.setIcon(new ImageIcon(Main.getImage()));
				imagelabel.updateUI();
			}
		});
		btnNewButton_2.setBounds(22, 37, 89, 23);
		panel2.add(btnNewButton_2);
		
	scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 62, 520, 183);
		panel2.add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
	imagelabel = new JLabel("");
		panel.add(imagelabel, BorderLayout.CENTER);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 634, 21);
		getContentPane().add(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmSaveImage = new JMenuItem("Save Image");
		mnFile.add(mntmSaveImage);
		
		mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		mntmExit = new JMenuItem("Exit");
		mnOptions.add(mntmExit);
		
		setVisible(true);
		
	}
}
