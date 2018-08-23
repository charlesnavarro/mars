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
	private JLabel earthLabel, marsLabel, passNumLabel, passengersLabel, spaceshipLabel,
					manEarthLbl, womanEarthLbl, lionEarthLbl, cowEarthLbl, grainEarthLbl,
					manMarsLbl, womanMarsLbl, lionMarsLbl, cowMarsLbl, grainMarsLbl;
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
		
		earthLabel = new JLabel("");
		earthIcon = new ImageIcon(this.getClass().getResource("Earth.png"));
		earthLabel.setIcon(earthIcon);
		earthLabel.setBounds(-71, 180, 609, 517);
		contentPane.add(earthLabel);
		
		marsLabel = new JLabel("");
		marsLabel.setBackground(new Color(0, 0, 128));
		marsIcon = new ImageIcon(this.getClass().getResource("Mars.png"));
		marsLabel.setIcon(marsIcon);
		marsLabel.setBounds(878, -63, 733, 912);
		contentPane.add(marsLabel);
		
		spaceshipLabel = new JLabel("");
		spaceshipIcon = new ImageIcon(this.getClass().getResource("Spaceship.png"));
		spaceshipLabel.setIcon(spaceshipIcon);
		spaceshipLabel.setBounds(626, 303, 256, 281);
		contentPane.add(spaceshipLabel);
		
		manEarthLbl = new JLabel("");
		manIcon = new ImageIcon(this.getClass().getResource("Man.png"));
		manEarthLbl.setIcon(manIcon);
		manEarthLbl.setBounds(20, 620, 256, 281);
		contentPane.add(manEarthLbl);
		
		womanEarthLbl = new JLabel("");
		womanIcon = new ImageIcon(this.getClass().getResource("Woman.png"));
		womanEarthLbl.setIcon(womanIcon);
		womanEarthLbl.setBounds(120, 620, 256, 281);
		contentPane.add(womanEarthLbl);
		
		lionEarthLbl = new JLabel("");
		lionIcon = new ImageIcon(this.getClass().getResource("Lion.png"));
		lionEarthLbl.setIcon(lionIcon);
		lionEarthLbl.setBounds(220, 620, 256, 281);
		contentPane.add(lionEarthLbl);
		
		cowEarthLbl = new JLabel("");
		cowIcon = new ImageIcon(this.getClass().getResource("Cow.png"));
		cowEarthLbl.setIcon(cowIcon);
		cowEarthLbl.setBounds(320, 620, 256, 281);
		contentPane.add(cowEarthLbl);
		
		grainEarthLbl = new JLabel("");
		grainIcon = new ImageIcon(this.getClass().getResource("Grain.png"));
		grainEarthLbl.setIcon(grainIcon);
		grainEarthLbl.setBounds(420, 620, 256, 281);
		contentPane.add(grainEarthLbl);
		
		manMarsLbl = new JLabel("");
		manIcon = new ImageIcon(this.getClass().getResource("Man.png"));
		manMarsLbl.setIcon(manIcon);
		manMarsLbl.setBounds(920, 620, 256, 281);
		contentPane.add(manMarsLbl);
		manMarsLbl.setVisible(false);
		
		womanMarsLbl = new JLabel("");
		womanIcon = new ImageIcon(this.getClass().getResource("Woman.png"));
		womanMarsLbl.setIcon(womanIcon);
		womanMarsLbl.setBounds(1020, 620, 256, 281);
		contentPane.add(womanMarsLbl);
		womanMarsLbl.setVisible(false);
		
		lionMarsLbl = new JLabel("");
		lionIcon = new ImageIcon(this.getClass().getResource("Lion.png"));
		lionMarsLbl.setIcon(lionIcon);
		lionMarsLbl.setBounds(1120, 620, 256, 281);
		contentPane.add(lionMarsLbl);
		lionMarsLbl.setVisible(false);
		
		cowMarsLbl = new JLabel("");
		cowIcon = new ImageIcon(this.getClass().getResource("Cow.png"));
		cowMarsLbl.setIcon(cowIcon);
		cowMarsLbl.setBounds(1220, 620, 256, 281);
		contentPane.add(cowMarsLbl);
		cowMarsLbl.setVisible(false);
		
		grainMarsLbl = new JLabel("");
		grainIcon = new ImageIcon(this.getClass().getResource("Grain.png"));
		grainMarsLbl.setIcon(grainIcon);
		grainMarsLbl.setBounds(1320, 620, 256, 281);
		contentPane.add(grainMarsLbl);
		grainMarsLbl.setVisible(false);
		
		btnMan = new JButton("");
		btnMan.setBounds(553, 0, 97, 99);
		optionsPane.add(btnMan);
		btnMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				manMarsLbl.setVisible(true);
			}
		});
		btnMan.setIcon(manIcon);

		btnWoman = new JButton("");
		btnWoman.setBounds(662, 0, 97, 99);
		optionsPane.add(btnWoman);
		btnWoman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				womanMarsLbl.setVisible(true);
			}
		});
		btnWoman.setIcon(womanIcon);
		
		btnLion = new JButton("");
		lionIcon = new ImageIcon(this.getClass().getResource("Lion.png"));
		btnLion.setIcon(lionIcon);
		btnLion.setBounds(771, 0, 97, 99);
		btnLion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lionMarsLbl.setVisible(true);
			}
		});
		optionsPane.add(btnLion);
		
		btnCow = new JButton("");
		cowIcon = new ImageIcon(this.getClass().getResource("Cow.png"));
		btnCow.setIcon(cowIcon);
		btnCow.setBounds(883, 0, 97, 99);
		btnCow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cowMarsLbl.setVisible(true);
			}
		});
		optionsPane.add(btnCow);
		
		btnGrain = new JButton("");
		grainIcon = new ImageIcon(this.getClass().getResource("Grain.png"));
		btnGrain.setIcon(grainIcon);
		btnGrain.setBounds(996, 0, 97, 99);
		btnGrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				grainMarsLbl.setVisible(true);
			}
		});
		optionsPane.add(btnGrain);
	}
}
