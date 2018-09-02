package me.ryandw11.tictactoe.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import me.ryandw11.tictactoe.TicTacToe;
import me.ryandw11.tictactoe.ai.MultiplayerAI;

public class MultiplayerScreen extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	private MultiplayerAI mai;
	
	public JPanel panel = new JPanel(new GridLayout(3, 3));
	
	public MultiplayerScreen() {
		super("Tic-Tac-Toe  Multiplayer");
		mai = TicTacToe.mai;
		
		this.setSize(500, 500);
		
		this.guiConstructor();
		
		this.setVisible(true);
		this.setLocation(700, 200);
	}
	
	private void guiConstructor() {
		mai.define();
		
		mai.a1.addActionListener(this);
		mai.a2.addActionListener(this);
		mai.a3.addActionListener(this);
		mai.b1.addActionListener(this);
		mai.b2.addActionListener(this);
		mai.b3.addActionListener(this);
		mai.c1.addActionListener(this);
		mai.c2.addActionListener(this);
		mai.c3.addActionListener(this);
		
		panel.add(mai.a1);
		panel.add(mai.a2);
		panel.add(mai.a3);
		panel.add(mai.b1);
		panel.add(mai.b2);
		panel.add(mai.b3);
		panel.add(mai.c1);
		panel.add(mai.c2);
		panel.add(mai.c3);
		
		this.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mai.a1) {
			if(mai.board[0].equals(" ")) {
				mai.board[0] = mai.currentTurn;
				mai.a1.setText(mai.board[0]);
				mai.nextTurn();
			}else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot take", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == mai.a2) {
			if(mai.board[1].equals(" ")) {
				mai.board[1] = mai.currentTurn;
				mai.a2.setText(mai.board[1]);
				mai.nextTurn();
			}else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot take", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == mai.a3) {
			if(mai.board[2].equals(" ")) {
				mai.board[2] = mai.currentTurn;
				mai.a3.setText(mai.board[2]);
				mai.nextTurn();
			}else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot take", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == mai.b1) {
			if(mai.board[3].equals(" ")) {
				mai.board[3] = mai.currentTurn;
				mai.b1.setText(mai.board[3]);
				mai.nextTurn();
			}else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot take", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == mai.b2) {
			if(mai.board[4].equals(" ")) {
				mai.board[4] = mai.currentTurn;
				mai.b2.setText(mai.board[4]);
				mai.nextTurn();
			}else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot take", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == mai.b3) {
			if(mai.board[5].equals(" ")) {
				mai.board[5] = mai.currentTurn;
				mai.b3.setText(mai.board[5]);
				mai.nextTurn();
			}else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot take", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == mai.c1) {
			if(mai.board[6].equals(" ")) {
				mai.board[6] = mai.currentTurn;
				mai.c1.setText(mai.board[6]);
				mai.nextTurn();
			}else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot take", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == mai.c2) {
			if(mai.board[7].equals(" ")) {
				mai.board[7] = mai.currentTurn;
				mai.c2.setText(mai.board[7]);
				mai.nextTurn();
			}else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot take", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == mai.c3) {
			if(mai.board[8].equals(" ")) {
				mai.board[8] = mai.currentTurn;
				mai.c3.setText(mai.board[8]);
				mai.nextTurn();
			}else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot take", JOptionPane.ERROR_MESSAGE);
			}
		}
		
	}// end of action

}
