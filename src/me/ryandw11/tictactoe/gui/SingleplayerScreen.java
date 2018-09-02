package me.ryandw11.tictactoe.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import me.ryandw11.tictactoe.TicTacToe;
import me.ryandw11.tictactoe.ai.SingleplayerAI;

public class SingleplayerScreen extends JFrame implements ActionListener {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	SingleplayerAI sai = TicTacToe.sai;
	
	
	public JPanel panel = new JPanel(new GridLayout(3, 3));
	
	public SingleplayerScreen() {
		super("Tic-Tac-Toe Singleplayer");
		
		this.setSize(500, 500);
		
		this.guiConstructor();
		
		this.setVisible(true);
		this.setLocation(800, 300);
		
	}
	
	private void guiConstructor() {
		
		sai.define();
		
		sai.a1.addActionListener(this);
		sai.a2.addActionListener(this);
		sai.a3.addActionListener(this);
		sai.b1.addActionListener(this);
		sai.b2.addActionListener(this);
		sai.b3.addActionListener(this);
		sai.c1.addActionListener(this);
		sai.c2.addActionListener(this);
		sai.c3.addActionListener(this);
		
		panel.add(sai.a1);
		panel.add(sai.a2);
		panel.add(sai.a3);
		panel.add(sai.b1);
		panel.add(sai.b2);
		panel.add(sai.b3);
		panel.add(sai.c1);
		panel.add(sai.c2);
		panel.add(sai.c3);
		
		this.add(panel);
		
	}
	
	public void updateScreen() {
		panel.removeAll();
		panel.add(sai.a1);
		panel.add(sai.a2);
		panel.add(sai.a3);
		panel.add(sai.b1);
		panel.add(sai.b2);
		panel.add(sai.b3);
		panel.add(sai.c1);
		panel.add(sai.c2);
		panel.add(sai.c3);
	}
	
	public void killScreen() {
		this.dispose();
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!sai.myTurn)
			return;
		if(e.getSource() == sai.a1) {
			if(sai.board[0].equals(" ")) {
				sai.board[0] = "X";
				sai.a1.setText(sai.board[0]);
				sai.myTurn = false;
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.a2) {
			if(sai.board[1].equals(" ")) {
				sai.board[1] = "X";
				sai.a2.setText(sai.board[1]);
				sai.myTurn = false;
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.a3) {
			if(sai.board[2].equals(" ")) {
				sai.board[2] = "X";
				sai.a3.setText(sai.board[2]);
				sai.myTurn = false;
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.b1) {
			if(sai.board[3].equals(" ")) {
				sai.board[3] = "X";
				sai.b1.setText(sai.board[3]);
				sai.myTurn = false;
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.b2) {
			if(sai.board[4].equals(" ")) {
				sai.board[4] = "X";
				sai.b2.setText(sai.board[4]);
				sai.myTurn = false;
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.b3) {
			if(sai.board[5].equals(" ")) {
				sai.board[5] = "X";
				sai.b3.setText(sai.board[5]);
				sai.myTurn = false;
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.c1) {
			if(sai.board[6].equals(" ")) {
				sai.board[6] = "X";
				sai.c1.setText(sai.board[6]);
				sai.myTurn = false;
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.c2) {
			if(sai.board[7].equals(" ")) {
				sai.board[7] = "X";
				sai.c2.setText(sai.board[7]);
				sai.myTurn = false;
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.c3) {
			if(sai.board[8].equals(" ")) {
				sai.board[8] = "X";
				sai.c3.setText(sai.board[8]);
				sai.myTurn = false;
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}	
	}
	
	
	
	

}
