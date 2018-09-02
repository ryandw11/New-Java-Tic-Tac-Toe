package me.ryandw11.tictactoe.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import me.ryandw11.tictactoe.TicTacToe;
import me.ryandw11.tictactoe.util.TicMode;

public class TitleScreen extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JButton singleButton, multiButton;
	
	public TitleScreen() {
		super("Tic-Tac-Toe");
		this.setSize(400, 300);
		
		this.constructGui();
		
		this.setVisible(true);
		this.setLocation(700, 200);
		this.setResizable(false);
	}
	
	public void constructGui() {
		JPanel panel = new JPanel();
		JPanel buttonPane = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		JLabel title = new JLabel("Tic Tac Toe");
		
		title.setFont(new Font("Tic Tac Toe", Font.PLAIN, 30));
		
		title.setToolTipText("Created by: Ryandw11");
		

		
		singleButton = new JButton("Singleplayer");
		multiButton = new JButton("Multiplayer");
		
		panel.add(title);
		//panel.add(singleButton);
		//panel.add(multiButton);
		panel.add(Box.createRigidArea(new Dimension(120,0)));
		panel.setBackground(Color.LIGHT_GRAY);
		
		buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
		buttonPane.add(Box.createRigidArea(new Dimension(90, 0)));
		buttonPane.add(singleButton);
		buttonPane.add(Box.createRigidArea(new Dimension(10, 0)));
		buttonPane.add(multiButton);
		buttonPane.setBackground(Color.LIGHT_GRAY);
		
		Container contentPane = getContentPane();
		contentPane.add(panel, BorderLayout.NORTH);
		contentPane.add(buttonPane, BorderLayout.SOUTH);
		contentPane.setBackground(Color.LIGHT_GRAY);
		
		//this.add(panel);
		
		singleButton.addActionListener(this);
		multiButton.addActionListener(this);
		
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == singleButton) {
			TicTacToe ttt = new TicTacToe();
			ttt.mode = TicMode.SinglePlayer;
			this.dispose();
			ttt.singleInstance = new SingleplayerScreen();
			ttt.singleInstance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JOptionPane.showMessageDialog(null, "Welcome to singleplayer! Click a box to add an X. The computer will automaticly go.", "Welcome", JOptionPane.PLAIN_MESSAGE);
		}
		else if(e.getSource() == multiButton){
			TicTacToe.mode = TicMode.MultiPlayer;
			TicTacToe ttt = new TicTacToe();
			ttt.mode = TicMode.MultiPlayer;
			this.dispose();
			ttt.multiInstance = new MultiplayerScreen();
			ttt.multiInstance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JOptionPane.showMessageDialog(null, "Welcome to multiplayer! Player One is X and Player Two is O. Player One goes first.", "Welcome", JOptionPane.PLAIN_MESSAGE);
		}
		
	}

}
