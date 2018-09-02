package me.ryandw11.tictactoe;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import me.ryandw11.tictactoe.ai.SingleplayerAI;
import me.ryandw11.tictactoe.gui.SingleplayerScreen;
import me.ryandw11.tictactoe.gui.TitleScreen;
import me.ryandw11.tictactoe.util.TicMode;

public class TicTacToe {
	
	public static TicMode mode;
	
	public static SingleplayerAI sai;
	
	public static SingleplayerScreen openInstance;
	
	public TicTacToe() {
		
	}

	public static void main(String[] args) {
		sai = new SingleplayerAI();
		TitleScreen ts = new TitleScreen();
		ts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("Tic-Tac-Toe - Developed by: Ryandw11");
		while(true) {
			@SuppressWarnings("unused")
			String s = "" + mode; //No clue why this is needed. Ask java why.
				if(mode == TicMode.SinglePlayer) {
					if(!sai.myTurn) {
						sai.computerMove();
						openInstance.panel.updateUI();
						sai.myTurn = true;
						sai.checkWin();
					}
					
					if(sai.getComputerWin()) {
						JOptionPane.showMessageDialog(null, "The Computer Wins", "Winner", JOptionPane.OK_OPTION);
						mode = null;
						TitleScreen tsa = new TitleScreen();
						tsa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						sai.reset();
						openInstance.killScreen();
						openInstance = null;
						sai = new SingleplayerAI();
					}
					if(sai.getPlayerWin()) {
						JOptionPane.showMessageDialog(null, "The Player Wins", "Winner", JOptionPane.OK_OPTION);
						mode = null;
						TitleScreen tsa = new TitleScreen();
						tsa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						openInstance.killScreen();
						sai.reset();
						openInstance = null;
						sai = new SingleplayerAI();
					}
					if(sai.getTie()) {
						JOptionPane.showMessageDialog(null, "It's a tie game!", "Tie", JOptionPane.OK_OPTION);
						mode = null;
						TitleScreen tsa = new TitleScreen();
						tsa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						openInstance.killScreen();
						sai.reset();
						openInstance = null;
						sai = new SingleplayerAI();
					}
					
					
				}
		}
		
	}

}
