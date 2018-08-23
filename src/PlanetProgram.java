import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.image.*;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlanetProgram extends JFrame {

	private JPanel contentPane, optionsPane;
	private ImageIcon earthIcon, marsIcon, manIcon, womanIcon, lionIcon, cowIcon, grainIcon, spaceshipIcon;
	private JLabel earthLabel, marsLabel, passNumLabel, passengersLabel, spaceshipLabel;
	private JComboBox numberCmb, passengersCmb;
	private JButton btnMan, btnWoman, btnLion, btnCow, btnGrain;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlanetProgram frame = new PlanetProgram();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public PlanetProgram() {
		setBackground(new Color(0, 0, 128));
		try {
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e) {}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		optionsPane = new JPanel();
		optionsPane.setBounds(0, 843, 1500, 112);
		contentPane.add(optionsPane);
		optionsPane.setLayout(null);
		
		passNumLabel = new JLabel("How many passengers?");
		passNumLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
		passNumLabel.setBounds(20, 13, 239, 24);
		optionsPane.add(passNumLabel);
		
		numberCmb = new JComboBox();
		numberCmb.addItem("1");
		numberCmb.addItem("2");
		numberCmb.setBounds(270, 13, 40, 30);
		optionsPane.add(numberCmb);
		
		passengersLabel = new JLabel("Which passengers?");
		passengersLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
		passengersLabel.setBounds(332, 13, 239, 24);
		optionsPane.add(passengersLabel);
		manIcon = new ImageIcon(this.getClass().getResource("Man.png"));
		womanIcon = new ImageIcon(this.getClass().getResource("Woman.png"));
		
		btnLion = new JButton("");
		lionIcon = new ImageIcon(this.getClass().getResource("Lion.png"));
		btnLion.setIcon(lionIcon);
		btnLion.setBounds(771, 0, 97, 99);
		optionsPane.add(btnLion);
		
		btnCow = new JButton("");
		cowIcon = new ImageIcon(this.getClass().getResource("Cow.png"));
		btnCow.setIcon(cowIcon);
		btnCow.setBounds(883, 0, 97, 99);
		optionsPane.add(btnCow);
		
		btnGrain = new JButton("");
		grainIcon = new ImageIcon(this.getClass().getResource("Grain.png"));
		btnGrain.setIcon(grainIcon);
		btnGrain.setBounds(996, 0, 97, 99);
		optionsPane.add(btnGrain);
		
		btnWoman = new JButton("");
		btnWoman.setBounds(662, 0, 97, 99);
		optionsPane.add(btnWoman);
		btnWoman.setIcon(womanIcon);
		
		btnMan = new JButton("");
		btnMan.setBounds(553, 0, 97, 99);
		optionsPane.add(btnMan);
		btnMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMan.setIcon(manIcon);
		
		
		earthLabel = new JLabel("");
		earthIcon = new ImageIcon(this.getClass().getResource("Earth.png"));
		earthLabel.setIcon(earthIcon);
		earthLabel.setBounds(-71, 180, 609, 517);
		contentPane.add(earthLabel);
		
		marsLabel = new JLabel("");
		marsLabel.setBackground(new Color(0, 0, 128));
		marsIcon = new ImageIcon(this.getClass().getResource("Mars.png"));
		marsLabel.setIcon(marsIcon);
		marsLabel.setBounds(878, 0, 733, 912);
		contentPane.add(marsLabel);
		
		spaceshipLabel = new JLabel("");
		spaceshipIcon = new ImageIcon(this.getClass().getResource("Spaceship.png"));
		spaceshipLabel.setIcon(spaceshipIcon);
		spaceshipLabel.setBounds(648, 328, 234, 248);
		contentPane.add(spaceshipLabel);
		
		
		
		
	}
}
