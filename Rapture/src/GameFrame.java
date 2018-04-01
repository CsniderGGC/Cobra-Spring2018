import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

import javax.swing.JTextPane;

public class GameFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameFrame frame = new GameFrame();
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
	public GameFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\MP\\Desktop\\Cobra-Spring2018\\Icons\\bloody_hospital.jpg"));
		setFont(new Font("Dialog", Font.BOLD, 18));
		setTitle("Medical Rapture");
		setForeground(new Color(139, 0, 0));
		setBackground(new Color(128, 128, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Start New Game");
		btnNewButton.setBounds(62, 5, 134, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Load");
		btnNewButton_1.setBounds(284, 5, 89, 23);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.setBounds(478, 5, 89, 23);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit Game");
		btnNewButton_3.setBounds(671, 5, 111, 23);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 39, 242, 253);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.GRAY);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(262, 39, 193, 253);
		panel_1.setForeground(Color.LIGHT_GRAY);
		panel_1.setBackground(new Color(192, 192, 192));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Examine");
		btnNewButton_4.setBounds(101, 205, 88, 20);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(btnNewButton_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(8, 11, 175, 88);
		panel_6.setBackground(Color.DARK_GRAY);
		panel_1.add(panel_6);
		
		JButton btnNewButton_6 = new JButton("Attack/Flee");
		btnNewButton_6.setBounds(2, 230, 88, 20);
		btnNewButton_6.setForeground(SystemColor.desktop);
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Examine Object");
		btnNewButton_7.setBounds(101, 230, 88, 20);
		btnNewButton_7.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 9));
		panel_1.add(btnNewButton_7);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(35, 102, 113, 96);
		panel_7.setBackground(new Color(105, 105, 105));
		panel_1.add(panel_7);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSearch.setBounds(2, 204, 88, 20);
		panel_1.add(btnSearch);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(465, 39, 402, 253);
		panel_2.setForeground(Color.GRAY);
		panel_2.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 382, 232);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(152, 157, 7, 20);
		panel_2.add(textPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 303, 242, 167);
		panel_3.setForeground(Color.GRAY);
		panel_3.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(Color.GREEN);
		progressBar.setBackground(Color.RED);
		progressBar.setBounds(45, 130, 151, 26);
		panel_3.add(progressBar);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBounds(10, 11, 67, 108);
		panel_3.add(panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBounds(88, 28, 144, 76);
		panel_3.add(panel_21);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(262, 303, 193, 167);
		panel_4.setForeground(Color.GRAY);
		panel_4.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton_9 = new JButton("W");
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_9.setBounds(18, 60, 48, 47);
		panel_4.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("E");
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_10.setBounds(125, 60, 48, 47);
		panel_4.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("S");
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_11.setBounds(73, 109, 48, 47);
		panel_4.add(btnNewButton_11);
		
		JButton btnNewButton_8 = new JButton("N");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_8.setBounds(73, 11, 48, 47);
		panel_4.add(btnNewButton_8);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(465, 303, 402, 167);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.DARK_GRAY);
		panel_8.setBounds(10, 27, 49, 44);
		panel_5.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.DARK_GRAY);
		panel_9.setBounds(69, 27, 49, 44);
		panel_5.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.DARK_GRAY);
		panel_10.setBounds(128, 27, 49, 44);
		panel_5.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.DARK_GRAY);
		panel_11.setBounds(187, 27, 49, 44);
		panel_5.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.DARK_GRAY);
		panel_12.setBounds(246, 27, 49, 44);
		panel_5.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.DARK_GRAY);
		panel_13.setBounds(306, 27, 49, 44);
		panel_5.add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.DARK_GRAY);
		panel_14.setBounds(10, 82, 49, 44);
		panel_5.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.DARK_GRAY);
		panel_15.setBounds(69, 82, 49, 44);
		panel_5.add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.DARK_GRAY);
		panel_16.setBounds(128, 82, 49, 44);
		panel_5.add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.DARK_GRAY);
		panel_17.setBounds(187, 82, 49, 44);
		panel_5.add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.DARK_GRAY);
		panel_18.setBounds(246, 82, 49, 44);
		panel_5.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(Color.DARK_GRAY);
		panel_19.setBounds(306, 82, 49, 44);
		panel_5.add(panel_19);
		
		JButton btnExamine = new JButton("Examine");
		btnExamine.setBounds(0, 144, 89, 23);
		panel_5.add(btnExamine);
		
		JButton btnEquipeunequipe = new JButton("Equipe/Unequipe");
		btnEquipeunequipe.setBounds(94, 144, 102, 23);
		panel_5.add(btnEquipeunequipe);
		
		JButton btnNewButton_12 = new JButton("Drop");
		btnNewButton_12.setBounds(206, 144, 89, 23);
		panel_5.add(btnNewButton_12);
		
		JButton btnUtilize = new JButton("Utilize");
		btnUtilize.setBounds(303, 144, 89, 23);
		panel_5.add(btnUtilize);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
}
