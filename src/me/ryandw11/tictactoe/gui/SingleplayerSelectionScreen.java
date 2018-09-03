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
import me.ryandw11.tictactoe.ai.singleplayer.SingleplayerAIEasy;
import me.ryandw11.tictactoe.ai.singleplayer.SingleplayerAIHard;
import me.ryandw11.tictactoe.ai.singleplayer.SingleplayerAIMedium;
import me.ryandw11.tictactoe.util.TicMode;

public class SingleplayerSelectionScreen extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JButton easyButton, mediumButton, hardButton;
	
	public SingleplayerSelectionScreen() {
		super("Tic-Tac-Toe - Singleplayer");
		this.setSize(500, 300);
		
		this.constructGui();
		
		this.setVisible(true);
		this.setLocation(650, 200);
		this.setResizable(false);
	}
	
	public void constructGui() {
		JPanel panel = new JPanel();
		JPanel buttonPane = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		JLabel title = new JLabel("Select the computer difficulty.");
		
		title.setFont(new Font("Tic Tac Toe", Font.PLAIN, 30));
		
		title.setToolTipText("Created by: Ryandw11");
		

		
		easyButton = new JButton("Easy");
		mediumButton = new JButton("Medium");
		hardButton = new JButton("Hard");
		
		panel.add(title);
		panel.add(Box.createRigidArea(new Dimension(110,0)));
		panel.setBackground(Color.LIGHT_GRAY);
		
		buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
		buttonPane.add(Box.createRigidArea(new Dimension(140, 0)));
		buttonPane.add(easyButton);
		buttonPane.add(Box.createRigidArea(new Dimension(10, 0)));
		buttonPane.add(mediumButton);
		buttonPane.add(Box.createRigidArea(new Dimension(10, 0)));
		buttonPane.add(hardButton);
		buttonPane.setBackground(Color.LIGHT_GRAY);
		
		Container contentPane = getContentPane();
		contentPane.add(panel, BorderLayout.NORTH);
		contentPane.add(buttonPane, BorderLayout.SOUTH);
		contentPane.setBackground(Color.LIGHT_GRAY);
		
		//this.add(panel);
		
		easyButton.addActionListener(this);
		mediumButton.addActionListener(this);
		hardButton.addActionListener(this);
		
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == easyButton) {
			TicTacToe ttt = new TicTacToe();
			ttt.sai = new SingleplayerAIEasy();
			ttt.mode = TicMode.SinglePlayer;
			this.dispose();
			ttt.singleInstance = new SingleplayerScreen();
			ttt.singleInstance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JOptionPane.showMessageDialog(null, "Welcome to singleplayer! Click a box to add an X. The computer will automaticly go.", "Welcome", JOptionPane.PLAIN_MESSAGE);
		}
		else if(e.getSource() == mediumButton){
			TicTacToe ttt = new TicTacToe();
			ttt.sai = new SingleplayerAIMedium();
			ttt.mode = TicMode.SinglePlayer;
			this.dispose();
			ttt.singleInstance = new SingleplayerScreen();
			ttt.singleInstance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JOptionPane.showMessageDialog(null, "Welcome to singleplayer! Click a box to add an X. The computer will automaticly go.", "Welcome", JOptionPane.PLAIN_MESSAGE);
		}
		else if(e.getSource() == hardButton){
			TicTacToe ttt = new TicTacToe();
			ttt.sai = new SingleplayerAIHard();
			ttt.mode = TicMode.SinglePlayer;
			this.dispose();
			ttt.singleInstance = new SingleplayerScreen();
			ttt.singleInstance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JOptionPane.showMessageDialog(null, "Welcome to singleplayer! Click a box to add an X. The computer will automaticly go.", "Welcome", JOptionPane.PLAIN_MESSAGE);
		}
		
	}

}
