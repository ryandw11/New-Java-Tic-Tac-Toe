package me.ryandw11.tictactoe.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import me.ryandw11.tictactoe.TicTacToe;
import me.ryandw11.tictactoe.util.Singleplayer;

public class SingleplayerScreen extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	
	Singleplayer sai = TicTacToe.sai;
	
	
	public JPanel panel = new JPanel(new GridLayout(3, 3));
	
	public SingleplayerScreen() {
		super("Tic-Tac-Toe || AN INTERNAL ERROR HAS OCCURRED.");
		this.setTitle(sai.getTitle());
		
		
		this.setSize(500, 500);
		
		this.guiConstructor();
		
		this.setVisible(true);
		this.setLocation(700, 200);
		
	}
	
	private void guiConstructor() {
		
		sai.define();
		
		sai.getA1().addActionListener(this);
		sai.getA2().addActionListener(this);
		sai.getA3().addActionListener(this);
		sai.getB1().addActionListener(this);
		sai.getB2().addActionListener(this);
		sai.getB3().addActionListener(this);
		sai.getC1().addActionListener(this);
		sai.getC2().addActionListener(this);
		sai.getC3().addActionListener(this);
		
		panel.add(sai.getA1());
		panel.add(sai.getA2());
		panel.add(sai.getA3());
		panel.add(sai.getB1());
		panel.add(sai.getB2());
		panel.add(sai.getB3());
		panel.add(sai.getC1());
		panel.add(sai.getC2());
		panel.add(sai.getC3());
		
		this.add(panel);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!sai.getMyTurn())
			return;
		if(e.getSource() == sai.getA1()) {
			if(sai.getBoardContent(0).equals(" ")) {
				sai.setBoard(0, "X");
				sai.setA1(sai.getBoardContent(0));
				sai.setMyTurn(false);
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.getA2()) {
			if(sai.getBoardContent(1).equals(" ")) {
				sai.setBoard(1, "X");
				sai.setA2(sai.getBoardContent(1));
				sai.setMyTurn(false);
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.getA3()) {
			if(sai.getBoardContent(2).equals(" ")) {
				sai.setBoard(2, "X");
				sai.setA3(sai.getBoardContent(2));
				sai.setMyTurn(false);
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.getB1()) {
			if(sai.getBoardContent(3).equals(" ")) {
				sai.setBoard(3, "X");
				sai.setB1(sai.getBoardContent(3));
				sai.setMyTurn(false);
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.getB2()) {
			if(sai.getBoardContent(4).equals(" ")) {
				sai.setBoard(4, "X");
				sai.setB2(sai.getBoardContent(4));
				sai.setMyTurn(false);
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.getB3()) {
			if(sai.getBoardContent(5).equals(" ")) {
				sai.setBoard(5, "X");
				sai.setB3(sai.getBoardContent(5));
				sai.setMyTurn(false);
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.getC1()) {
			if(sai.getBoardContent(6).equals(" ")) {
				sai.setBoard(6, "X");
				sai.setC1(sai.getBoardContent(6));
				sai.setMyTurn(false);
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.getC2()) {
			if(sai.getBoardContent(7).equals(" ")) {
				sai.setBoard(7, "X");
				sai.setC2(sai.getBoardContent(7));
				sai.setMyTurn(false);
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() == sai.getC3()) {
			if(sai.getBoardContent(8).equals(" ")) {
				sai.setBoard(8, "X");
				sai.setC3(sai.getBoardContent(8));
				sai.setMyTurn(false);
			}
			else {
				JOptionPane.showMessageDialog(this, "That space is already taken!", "Spot taken", JOptionPane.ERROR_MESSAGE);
			}
		}	
	}
	
	
	
	

}
