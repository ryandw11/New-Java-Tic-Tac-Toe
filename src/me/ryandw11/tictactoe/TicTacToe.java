package me.ryandw11.tictactoe;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import me.ryandw11.tictactoe.ai.MultiplayerAI;
import me.ryandw11.tictactoe.ai.singleplayer.SingleplayerAIHard;
import me.ryandw11.tictactoe.gui.MultiplayerScreen;
import me.ryandw11.tictactoe.gui.SingleplayerScreen;
import me.ryandw11.tictactoe.gui.TitleScreen;
import me.ryandw11.tictactoe.util.Singleplayer;
import me.ryandw11.tictactoe.util.TicMode;

public class TicTacToe {
	
	public static TicMode mode;
	
	public static Singleplayer sai;
	public static MultiplayerAI mai;
	
	public static SingleplayerScreen singleInstance;
	public static MultiplayerScreen multiInstance;
	
	public TicTacToe() {
		
	}

	public static void main(String[] args) {
		sai = new SingleplayerAIHard();
		mai = new MultiplayerAI();
		
		TitleScreen ts = new TitleScreen();
		ts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("Tic-Tac-Toe - Developed by: Ryandw11");
		while(true) {
			@SuppressWarnings("unused")
			String s = "" + mode; //No clue why this is needed. Ask java why.
				if(mode == TicMode.SinglePlayer) {
					if(!sai.getMyTurn()) {
						try {
							Thread.sleep(150);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						sai.computerMove();
						singleInstance.panel.updateUI();
						sai.setMyTurn(true);
						sai.checkWin();
					}
					
					if(sai.getComputerWin()) {
						JOptionPane.showMessageDialog(null, "The Computer Wins", "Winner", JOptionPane.OK_OPTION);
						mode = null;
						TitleScreen tsa = new TitleScreen();
						tsa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						sai.reset();
						singleInstance.dispose();
						singleInstance = null;
						sai = new SingleplayerAIHard();
					}
					else if(sai.getPlayerWin()) {
						JOptionPane.showMessageDialog(null, "The Player Wins", "Winner", JOptionPane.QUESTION_MESSAGE);
						mode = null;
						TitleScreen tsa = new TitleScreen();
						tsa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						singleInstance.dispose();
						sai.reset();
						singleInstance = null;
						sai = new SingleplayerAIHard();
					}
					else if(sai.getTie()) {
						JOptionPane.showMessageDialog(null, "It's a tie game!", "Tie", JOptionPane.WARNING_MESSAGE);
						mode = null;
						TitleScreen tsa = new TitleScreen();
						tsa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						singleInstance.dispose();
						sai.reset();
						singleInstance = null;
						sai = new SingleplayerAIHard();
					}
					
					
				}// end of single player
				else if(mode == TicMode.MultiPlayer) {
					mai.checkWin();
					
					if(mai.getPlayer1Win()) {
						JOptionPane.showMessageDialog(null, "Player One Wins", "Winner", JOptionPane.QUESTION_MESSAGE);
						mode = null;
						TitleScreen tsa = new TitleScreen();
						tsa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						mai.reset();
						multiInstance.dispose();
						multiInstance = null;
						mai = new MultiplayerAI();
					}
					else if(mai.getPlayer2Win()) {
						JOptionPane.showMessageDialog(null, "Player Two Wins", "Winner", JOptionPane.QUESTION_MESSAGE);
						mode = null;
						TitleScreen tsa = new TitleScreen();
						tsa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						multiInstance.dispose();
						mai.reset();
						multiInstance = null;
						mai = new MultiplayerAI();
					}
					else if(mai.getTie()) {
						JOptionPane.showMessageDialog(null, "It's a tie game!", "Tie", JOptionPane.WARNING_MESSAGE);
						mode = null;
						TitleScreen tsa = new TitleScreen();
						tsa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						multiInstance.dispose();
						mai.reset();
						multiInstance = null;
						mai = new MultiplayerAI();
					}
				}
		}
		
	}

}
