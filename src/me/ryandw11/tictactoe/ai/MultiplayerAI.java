package me.ryandw11.tictactoe.ai;

import java.awt.Font;

import javax.swing.JButton;

public class MultiplayerAI {
	
	public boolean player1Win = false;
	public boolean player2Win = false;
	public String currentTurn;
	public boolean tie = false;
	public String[] board = { " ", " ", " ", " ", " ", " ", " ", " ", " " }; 
	
	public JButton a1, a2, a3, b1, b2, b3, c1, c2, c3;
	
	public MultiplayerAI() {
		currentTurn = "X";
	}
	
	
	
	public void define() {
		a1 = new JButton(board[0]);
		a2 = new JButton(board[1]);
		a3 = new JButton(board[2]);
		b1 = new JButton(board[3]);
		b2 = new JButton(board[4]);
		b3 = new JButton(board[5]);
		c1 = new JButton(board[6]);
		c2 = new JButton(board[7]);
		c3 = new JButton(board[8]);
		
		a1.setFont(new Font("Arial", Font.PLAIN, 80));
		a2.setFont(new Font("Arial", Font.PLAIN, 80));
		a3.setFont(new Font("Arial", Font.PLAIN, 80));
		b1.setFont(new Font("Arial", Font.PLAIN, 80));
		b2.setFont(new Font("Arial", Font.PLAIN, 80));
		b3.setFont(new Font("Arial", Font.PLAIN, 80));
		c1.setFont(new Font("Arial", Font.PLAIN, 80));
		c2.setFont(new Font("Arial", Font.PLAIN, 80));
		c3.setFont(new Font("Arial", Font.PLAIN, 80));
	}
	
	public void nextTurn() {
		if(currentTurn.equals("X")) {
			currentTurn = "O";
		}else {
			currentTurn = "X";
		}
	}
	
	public void reset() {
		player1Win = false;
		player2Win = false;
		currentTurn = "X";
		tie = false;
		a1.setText(" ");
		a2.setText(" ");
		a3.setText(" ");
		b1.setText(" ");
		b2.setText(" ");
		b3.setText(" ");
		c1.setText(" ");
		c2.setText(" ");
		c3.setText(" ");
		
		for(int i = 0; i > board.length; i++) {
			board[i] = " ";
		}
	}
	
	
	/**
	 * Check if someone won.
	 */
	public void checkWin() {
		/**
		 * Computer first
		 */
		if(board[0].equals("O") && board[1].equals("O") && board[2].equals("O")) {
			player2Win = true;
		}
		else if(board[0].equals("O") && board[2].equals("O") && board[1].equals("O")) {
			player2Win = true;
		}
		else if(board[0].equals("O") && board[2].equals("O") && board[1].equals("O")) {
			player2Win = true;
		}
		//B
		else if(board[3].equals("O") && board[4].equals("O") && board[5].equals("O")) {
			player2Win = true;
		}
		else if(board[3].equals("O") && board[4].equals("O") && board[5].equals("O")) {
			player2Win = true;
		}
		else if(board[3].equals("O") && board[4].equals("O") && board[5].equals("O")) {
			player2Win = true;
		}
		//C
		else if(board[6].equals("O") && board[7].equals("O") && board[8].equals("O")) {
			player2Win = true;
		}
		else if(board[6].equals("O") && board[7].equals("O") && board[8].equals("O")) {
			player2Win = true;
		}
		else if(board[6].equals("O") && board[7].equals("O") && board[8].equals("O")) {
			player2Win = true;
		}
		/**
		 * If Down
		 */
		else if(board[0].equals("O") && board[3].equals("O") && board[6].equals("O")) {
			player2Win = true;
		}
		else if(board[0].equals("O") && board[3].equals("O") && board[6].equals("O")) {
			player2Win = true;
		}
		else if(board[0].equals("O") && board[3].equals("O") && board[6].equals("O")) {
			player2Win = true;
		}
		// Line 2
		else if(board[1].equals("O") && board[4].equals("O") && board[7].equals("O")) {
			player2Win = true;
		}
		else if(board[1].equals("O") && board[4].equals("O") && board[7].equals("O")) {
			player2Win = true;
		}
		else if(board[1].equals("O") && board[4].equals("O") && board[7].equals("O")) {
			player2Win = true;
		}
		// Line 3
		else if(board[2].equals("O") && board[5].equals("O") && board[8].equals("O")) {
			player2Win = true;
		}
		else if(board[2].equals("O") && board[5].equals("O") && board[8].equals("O")) {
			player2Win = true;
		}
		else if(board[2].equals("O") && board[5].equals("O") && board[8].equals("O")) {
			player2Win = true;
		}
		/**
		 * Diagonal
		 */
		else if(board[0].equals("O") && board[4].equals("O") && board[8].equals("O")) {
			player2Win = true;
		}
		else if(board[0].equals("O") && board[4].equals("O") && board[8].equals("O")) {
			player2Win = true;
		}
		else if(board[0].equals("O") && board[4].equals("O") && board[8].equals("O")) {
			player2Win = true;
		}
		// Diagonal 2
		else if(board[2].equals("O") && board[4].equals("O") && board[6].equals("O")) {
			player2Win = true;
		}
		else if(board[2].equals("O") && board[4].equals("O") && board[6].equals("O")) {
			player2Win = true;
		}
		else if(board[2].equals("O") && board[4].equals("O") && board[6].equals("O")) {
			player2Win = true;
		}
		/*
		 * 
		 * Check if the player won.
		 * 
		 */
		
		else if(board[0].equals("X") && board[1].equals("X") && board[2].equals("X")) {
			player1Win = true;
		}
		else if(board[0].equals("X") && board[2].equals("X") && board[1].equals("X")) {
			player1Win = true;
		}
		else if(board[0].equals("X") && board[2].equals("X") && board[1].equals("X")) {
			player1Win = true;
		}
		//B
		else if(board[3].equals("X") && board[4].equals("X") && board[5].equals("X")) {
			player1Win = true;
		}
		else if(board[3].equals("X") && board[4].equals("X") && board[5].equals("X")) {
			player1Win = true;
		}
		else if(board[3].equals("X") && board[4].equals("X") && board[5].equals("X")) {
			player1Win = true;
		}
		//C
		else if(board[6].equals("X") && board[7].equals("X") && board[8].equals("X")) {
			player1Win = true;
		}
		else if(board[6].equals("X") && board[7].equals("X") && board[8].equals("X")) {
			player1Win = true;
		}
		else if(board[6].equals("X") && board[7].equals("X") && board[8].equals("X")) {
			player1Win = true;
		}
		/**
		 * If Down
		 */
		else if(board[0].equals("X") && board[3].equals("X") && board[6].equals("X")) {
			player1Win = true;
		}
		else if(board[0].equals("X") && board[3].equals("X") && board[6].equals("X")) {
			player1Win = true;
		}
		else if(board[0].equals("X") && board[3].equals("X") && board[6].equals("X")) {
			player1Win = true;
		}
		// Line 2
		else if(board[1].equals("X") && board[4].equals("X") && board[7].equals("X")) {
			player1Win = true;
		}
		else if(board[1].equals("X") && board[4].equals("X") && board[7].equals("X")) {
			player1Win = true;
		}
		else if(board[1].equals("X") && board[4].equals("X") && board[7].equals("X")) {
			player1Win = true;
		}
		// Line 3
		else if(board[2].equals("X") && board[5].equals("X") && board[8].equals("X")) {
			player1Win = true;
		}
		else if(board[2].equals("X") && board[5].equals("X") && board[8].equals("X")) {
			player1Win = true;
		}
		else if(board[2].equals("X") && board[5].equals("X") && board[8].equals("X")) {
			player1Win = true;
		}
		/**
		 * Diagonal
		 */
		else if(board[0].equals("X") && board[4].equals("X") && board[8].equals("X")) {
			player1Win = true;
		}
		else if(board[0].equals("X") && board[4].equals("X") && board[8].equals("X")) {
			player1Win = true;
		}
		else if(board[0].equals("X") && board[4].equals("X") && board[8].equals("X")) {
			player1Win = true;
		}
		// Diagonal 2
		else if(board[2].equals("X") && board[4].equals("X") && board[6].equals("X")) {
			player1Win = true;
		}
		else if(board[2].equals("X") && board[4].equals("X") && board[6].equals("X")) {
			player1Win = true;
		}
		else if(board[2].equals("X") && board[4].equals("X") && board[6].equals("X")) {
			player1Win = true;
		}
		else {
			if(!board[0].equals(" ") && !board[1].equals(" ") && !board[2].equals(" ") && !board[3].equals(" ") && !board[4].equals(" ") &&
					!board[5].equals(" ") && !board[6].equals(" ") && !board[7].equals(" ") && !board[8].equals(" ")) {
				tie = true;
			}
		}
		
	}
	
	/**
	 * Get if the player is currently winning.
	 * @return
	 */
	public boolean getPlayer1Win() {
		return player1Win;
	}
	/**
	 * Get if the computer is won.
	 * @return
	 */
	public boolean getPlayer2Win() {
		return player2Win;
	}
	/**
	 * Get if there was a tie
	 * @return
	 */
	public boolean getTie() {
		return tie;
	}
	
}
