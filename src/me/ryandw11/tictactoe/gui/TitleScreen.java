package me.ryandw11.tictactoe.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import me.ryandw11.tictactoe.TicTacToe;
import me.ryandw11.tictactoe.util.TicMode;

public class TitleScreen extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton singleButton, multiButton;
	
	public TitleScreen() {
		super("Tic-Tac-Toe");
		this.setSize(200, 300);
		
		this.constructGui();
		
		this.setVisible(true);
		this.setLocation(800, 300);
	}
	
	public void constructGui() {
		JPanel panel = new JPanel();
		
		JLabel title = new JLabel("Tic Tac Toe");

		
		singleButton = new JButton("Singleplayer");
		multiButton = new JButton("Multiplayer");
		
		panel.add(title);
		panel.add(singleButton);
		panel.add(multiButton);
		panel.setBackground(Color.LIGHT_GRAY);
		this.add(panel);
		
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
			ttt.openInstance = new SingleplayerScreen();
			ttt.openInstance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else if(e.getSource() == multiButton){
			TicTacToe.mode = TicMode.MultiPlayer;
			this.dispose();
		}
		
	}

}
