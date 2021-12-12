package com.jfreyberger;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EtchedBorder;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;

public class Main {

	private JFrame frmWowRandomizer;

	/**
	 9/* Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmWowRandomizer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWowRandomizer = new JFrame();
		frmWowRandomizer.setTitle("WoW Randomizer");
		frmWowRandomizer.getContentPane().setBackground(Color.DARK_GRAY);
		
		JPanel mainView = new Start();
		mainView.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		frmWowRandomizer.getContentPane().add(mainView, BorderLayout.CENTER);

		
		
		
		frmWowRandomizer.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/images/wowIcon.png")));
		frmWowRandomizer.setBounds(100, 100, 693, 405);
		frmWowRandomizer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmWowRandomizer.setJMenuBar(menuBar);
		
		JMenu mnFilters = new JMenu("Filters");
		menuBar.add(mnFilters);
		
		JMenu mnRole = new JMenu("Role");
		mnFilters.add(mnRole);
		
		JCheckBoxMenuItem chckbxmntmTank = new JCheckBoxMenuItem("Tank");
		chckbxmntmTank.setSelected(true);
		mnRole.add(chckbxmntmTank);
		
		JCheckBoxMenuItem chckbxmntmHealer = new JCheckBoxMenuItem("Healer");
		chckbxmntmHealer.setSelected(true);
		mnRole.add(chckbxmntmHealer);
		
		JCheckBoxMenuItem chckbxmntmDPS = new JCheckBoxMenuItem("DPS");
		chckbxmntmDPS.setSelected(true);
		mnRole.add(chckbxmntmDPS);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
