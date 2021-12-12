package com.jfreyberger;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jfreyberger.ClassPicker;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class Start extends JPanel {

	/**
	 * Create the panel.
	 */
	public Start() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setBackground(new Color(102, 51, 0));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblWelcome = new JLabel("Welcome to the WoW Randomizer!");
		lblWelcome.setForeground(new Color(255, 255, 0));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Rockwell", Font.PLAIN, 20));
		add(lblWelcome);
		
		JButton btnGo = new JButton("Find me a class");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblWelcome.setText("You should play a: " + ClassPicker.roll());
			}
		});
		add(btnGo, BorderLayout.SOUTH);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(Start.class.getResource("/images/wowLogo.png")));
		lblIcon.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblIcon, BorderLayout.NORTH);

	}

}
