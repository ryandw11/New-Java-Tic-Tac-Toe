package me.ryandw11.tictactoe.ai.singleplayer;

import java.awt.Font;
import java.util.Random;

import javax.swing.JButton;

import me.ryandw11.tictactoe.util.Singleplayer;

public class SingleplayerAIHard implements Singleplayer {
	
	public boolean playerWin = false;
	public boolean comWin = false;
	public boolean myTurn;
	public boolean tie = false;
	public String[] board = { " ", " ", " ", " ", " ", " ", " ", " ", " " }; 
	
	public JButton a1, a2, a3, b1, b2, b3, c1, c2, c3;
	
	public SingleplayerAIHard() {
		myTurn = true;
	}
	
	
	@Override
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
	
	@Override
	public void reset() {
		playerWin = false;
		comWin = false;
		myTurn = true;
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
	
	@Override
	public void computerMove() {
		/**
		 * If Across
		 */
		if(board[0].equals("O") && board[1].equals("O") && board[2].equals(" ")) {
			a3.setText("O");
			board[2] = "O";
		}
		else if(board[0].equals("O") && board[2].equals("O") && board[1].equals(" ")) {
			a2.setText("O");
			board[1] = "O";
		}
		else if(board[0].equals(" ") && board[2].equals("O") && board[1].equals("O")) {
			a1.setText("O");
			board[0] = "O";
		}
		//B
		else if(board[3].equals("O") && board[4].equals("O") && board[5].equals(" ")) {
			b3.setText("O");
			board[5] = "O";
		}
		else if(board[3].equals("O") && board[4].equals(" ") && board[5].equals("O")) {
			b2.setText("O");
			board[4] = "O";
		}
		else if(board[3].equals(" ") && board[4].equals("O") && board[5].equals("O")) {
			b1.setText("O");
			board[3] = "O";
		}
		//C
		else if(board[6].equals(" ") && board[7].equals("O") && board[8].equals("O")) {
			c1.setText("O");
			board[6] = "O";
		}
		else if(board[6].equals("O") && board[7].equals(" ") && board[8].equals("O")) {
			c2.setText("O");
			board[7] = "O";
		}
		else if(board[6].equals("O") && board[7].equals("O") && board[8].equals(" ")) {
			c3.setText("O");
			board[8] = "O";
		}
		/**
		 * If Down
		 */
		else if(board[0].equals(" ") && board[3].equals("O") && board[6].equals("O")) {
			a1.setText("O");
			board[0] = "O";
		}
		else if(board[0].equals("O") && board[3].equals(" ") && board[6].equals("O")) {
			b1.setText("O");
			board[3] = "O";
		}
		else if(board[0].equals("O") && board[3].equals("O") && board[6].equals(" ")) {
			c1.setText("O");
			board[6] = "O";
		}
		// Line 2
		else if(board[1].equals(" ") && board[4].equals("O") && board[7].equals("O")) {
			a2.setText("O");
			board[1] = "O";
		}
		else if(board[1].equals("O") && board[4].equals(" ") && board[7].equals("O")) {
			b2.setText("O");
			board[4] = "O";
		}
		else if(board[1].equals("O") && board[4].equals("O") && board[7].equals(" ")) {
			c2.setText("O");
			board[7] = "O";
		}
		// Line 3
		else if(board[2].equals(" ") && board[5].equals("O") && board[8].equals("O")) {
			a3.setText("O");
			board[2] = "O";
		}
		else if(board[2].equals("O") && board[5].equals(" ") && board[8].equals("O")) {
			b3.setText("O");
			board[5] = "O";
		}
		else if(board[2].equals("O") && board[5].equals("O") && board[8].equals(" ")) {
			c3.setText("O");
			board[8] = "O";
		}
		/**
		 * Diagonal
		 */
		else if(board[0].equals(" ") && board[4].equals("O") && board[8].equals("O")) {
			a1.setText("O");
			board[0] = "O";
		}
		else if(board[0].equals("O") && board[4].equals(" ") && board[8].equals("O")) {
			b2.setText("O");
			board[4] = "O";
		}
		else if(board[0].equals("O") && board[4].equals("O") && board[8].equals(" ")) {
			c3.setText("O");
			board[8] = "O";
		}
		// Diagonal 2
		else if(board[2].equals(" ") && board[4].equals("O") && board[6].equals("O")) {
			a3.setText("O");
			board[2] = "O";
		}
		else if(board[2].equals("O") && board[4].equals(" ") && board[6].equals("O")) {
			b2.setText("O");
			board[4] = "O";
		}
		else if(board[2].equals("O") && board[4].equals("O") && board[6].equals(" ")) {
			c1.setText("O");
			board[6] = "O";
		}
		/**
		 * Check if the player is about to win
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		/**
		 * If Across
		 */
		else if(board[0].equals("X") && board[1].equals("X") && board[2].equals(" ")) {
			a3.setText("O");
			board[2] = "O";
		}
		else if(board[0].equals("X") && board[2].equals("X") && board[1].equals(" ")) {
			a2.setText("O");
			board[1] = "O";
		}
		else if(board[0].equals(" ") && board[2].equals("X") && board[1].equals("X")) {
			a1.setText("O");
			board[0] = "O";
		}
		//B
		else if(board[3].equals("X") && board[4].equals("X") && board[5].equals(" ")) {
			b3.setText("O");
			board[5] = "O";
		}
		else if(board[3].equals("X") && board[4].equals(" ") && board[5].equals("X")) {
			b2.setText("O");
			board[4] = "O";
		}
		else if(board[3].equals(" ") && board[4].equals("X") && board[5].equals("X")) {
			b1.setText("O");
			board[3] = "O";
		}
		//C
		else if(board[6].equals(" ") && board[7].equals("X") && board[8].equals("X")) {
			c1.setText("O");
			board[6] = "O";
		}
		else if(board[6].equals("X") && board[7].equals(" ") && board[8].equals("X")) {
			c2.setText("O");
			board[7] = "O";
		}
		else if(board[6].equals("X") && board[7].equals("X") && board[8].equals(" ")) {
			c3.setText("O");
			board[8] = "O";
		}
		/**
		 * If Down
		 */
		else if(board[0].equals(" ") && board[3].equals("X") && board[6].equals("X")) {
			a1.setText("O");
			board[0] = "O";
		}
		else if(board[0].equals("X") && board[3].equals(" ") && board[6].equals("X")) {
			b1.setText("O");
			board[3] = "O";
		}
		else if(board[0].equals("X") && board[3].equals("X") && board[6].equals(" ")) {
			c1.setText("O");
			board[6] = "O";
		}
		// Line 2
		else if(board[1].equals(" ") && board[4].equals("X") && board[7].equals("X")) {
			a2.setText("O");
			board[1] = "O";
		}
		else if(board[1].equals("X") && board[4].equals(" ") && board[7].equals("X")) {
			b2.setText("O");
			board[4] = "O";
		}
		else if(board[1].equals("X") && board[4].equals("X") && board[7].equals(" ")) {
			c2.setText("O");
			board[7] = "O";
		}
		// Line 3
		else if(board[2].equals(" ") && board[5].equals("X") && board[8].equals("X")) {
			a3.setText("O");
			board[2] = "O";
		}
		else if(board[2].equals("X") && board[5].equals(" ") && board[8].equals("X")) {
			b3.setText("O");
			board[5] = "O";
		}
		else if(board[2].equals("X") && board[5].equals("X") && board[8].equals(" ")) {
			c3.setText("O");
			board[8] = "O";
		}
		/**
		 * Diagonal
		 */
		else if(board[0].equals(" ") && board[4].equals("X") && board[8].equals("X")) {
			a1.setText("O");
			board[0] = "O";
		}
		else if(board[0].equals("X") && board[4].equals(" ") && board[8].equals("X")) {
			b2.setText("O");
			board[4] = "O";
		}
		else if(board[0].equals("X") && board[4].equals("X") && board[8].equals(" ")) {
			c3.setText("O");
			board[8] = "O";
		}
		// Diagonal 2
		else if(board[2].equals(" ") && board[4].equals("X") && board[6].equals("X")) {
			a3.setText("O");
			board[2] = "O";
		}
		else if(board[2].equals("X") && board[4].equals(" ") && board[6].equals("X")) {
			b2.setText("O");
			board[4] = "O";
		}
		else if(board[2].equals("X") && board[4].equals("X") && board[6].equals(" ")) {
			c1.setText("O");
			board[6] = "O";
		}
		else {
			boolean found = false;
			while(!found) {
				Random ran = new Random();
				int num = ran.nextInt(9);
				
				
				if(num == 0 && a1.getText().equals(" ")) {
					a1.setText("O");
					board[0] = "O";
					found = true;
				}
				else if(num == 1 && a2.getText().equals(" ")) {
					a2.setText("O");
					board[1] = "O";
					found = true;
				}
				else if(num == 2 && a3.getText().equals(" ")) {
					a3.setText("O");
					board[2] = "O";
					found = true;
				}
				else if(num == 3 && b1.getText().equals(" ")) {
					b1.setText("O");
					board[3] = "O";
					found = true;
				}
				else if(num == 4 && b2.getText().equals(" ")) {
					b2.setText("O");
					board[4] = "O";
					found = true;
				}
				else if(num == 5 && b3.getText().equals(" ")) {
					b3.setText("O");
					board[5] = "O";
					found = true;
				}
				else if(num == 6 && c1.getText().equals(" ")) {
					c1.setText("O");
					board[6] = "O";
					found = true;
				}
				else if(num == 7 && c2.getText().equals("" )) {
					c2.setText("O");
					board[7] = "O";
					found = true;
				}
				else if(num == 8 && c3.getText().equals(" ")) {
					c3.setText("O");
					board[8] = "O";
					found = true;
				}
				else if(!board[0].equals(" ") && !board[1].equals(" ") && !board[2].equals(" ") && !board[3].equals(" ") && !board[4].equals(" ") &&
						!board[5].equals(" ") && !board[6].equals(" ") && !board[7].equals(" ") && !board[8].equals(" ")) {
					found = true;
				}
			}
		}
	}// End of Computer Code.
	
	/**
	 * Check if someone won.
	 */
	@Override
	public void checkWin() {
		/**
		 * Computer first
		 */
		if(board[0].equals("O") && board[1].equals("O") && board[2].equals("O")) {
			comWin = true;
		}
		else if(board[0].equals("O") && board[2].equals("O") && board[1].equals("O")) {
			comWin = true;
		}
		else if(board[0].equals("O") && board[2].equals("O") && board[1].equals("O")) {
			comWin = true;
		}
		//B
		else if(board[3].equals("O") && board[4].equals("O") && board[5].equals("O")) {
			comWin = true;
		}
		else if(board[3].equals("O") && board[4].equals("O") && board[5].equals("O")) {
			comWin = true;
		}
		else if(board[3].equals("O") && board[4].equals("O") && board[5].equals("O")) {
			comWin = true;
		}
		//C
		else if(board[6].equals("O") && board[7].equals("O") && board[8].equals("O")) {
			comWin = true;
		}
		else if(board[6].equals("O") && board[7].equals("O") && board[8].equals("O")) {
			comWin = true;
		}
		else if(board[6].equals("O") && board[7].equals("O") && board[8].equals("O")) {
			comWin = true;
		}
		/**
		 * If Down
		 */
		else if(board[0].equals("O") && board[3].equals("O") && board[6].equals("O")) {
			comWin = true;
		}
		else if(board[0].equals("O") && board[3].equals("O") && board[6].equals("O")) {
			comWin = true;
		}
		else if(board[0].equals("O") && board[3].equals("O") && board[6].equals("O")) {
			comWin = true;
		}
		// Line 2
		else if(board[1].equals("O") && board[4].equals("O") && board[7].equals("O")) {
			comWin = true;
		}
		else if(board[1].equals("O") && board[4].equals("O") && board[7].equals("O")) {
			comWin = true;
		}
		else if(board[1].equals("O") && board[4].equals("O") && board[7].equals("O")) {
			comWin = true;
		}
		// Line 3
		else if(board[2].equals("O") && board[5].equals("O") && board[8].equals("O")) {
			comWin = true;
		}
		else if(board[2].equals("O") && board[5].equals("O") && board[8].equals("O")) {
			comWin = true;
		}
		else if(board[2].equals("O") && board[5].equals("O") && board[8].equals("O")) {
			comWin = true;
		}
		/**
		 * Diagonal
		 */
		else if(board[0].equals("O") && board[4].equals("O") && board[8].equals("O")) {
			comWin = true;
		}
		else if(board[0].equals("O") && board[4].equals("O") && board[8].equals("O")) {
			comWin = true;
		}
		else if(board[0].equals("O") && board[4].equals("O") && board[8].equals("O")) {
			comWin = true;
		}
		// Diagonal 2
		else if(board[2].equals("O") && board[4].equals("O") && board[6].equals("O")) {
			comWin = true;
		}
		else if(board[2].equals("O") && board[4].equals("O") && board[6].equals("O")) {
			comWin = true;
		}
		else if(board[2].equals("O") && board[4].equals("O") && board[6].equals("O")) {
			comWin = true;
		}
		/*
		 * 
		 * Check if the player won.
		 * 
		 */
		
		else if(board[0].equals("X") && board[1].equals("X") && board[2].equals("X")) {
			playerWin = true;
		}
		else if(board[0].equals("X") && board[2].equals("X") && board[1].equals("X")) {
			playerWin = true;
		}
		else if(board[0].equals("X") && board[2].equals("X") && board[1].equals("X")) {
			playerWin = true;
		}
		//B
		else if(board[3].equals("X") && board[4].equals("X") && board[5].equals("X")) {
			playerWin = true;
		}
		else if(board[3].equals("X") && board[4].equals("X") && board[5].equals("X")) {
			playerWin = true;
		}
		else if(board[3].equals("X") && board[4].equals("X") && board[5].equals("X")) {
			playerWin = true;
		}
		//C
		else if(board[6].equals("X") && board[7].equals("X") && board[8].equals("X")) {
			playerWin = true;
		}
		else if(board[6].equals("X") && board[7].equals("X") && board[8].equals("X")) {
			playerWin = true;
		}
		else if(board[6].equals("X") && board[7].equals("X") && board[8].equals("X")) {
			playerWin = true;
		}
		/**
		 * If Down
		 */
		else if(board[0].equals("X") && board[3].equals("X") && board[6].equals("X")) {
			playerWin = true;
		}
		else if(board[0].equals("X") && board[3].equals("X") && board[6].equals("X")) {
			playerWin = true;
		}
		else if(board[0].equals("X") && board[3].equals("X") && board[6].equals("X")) {
			playerWin = true;
		}
		// Line 2
		else if(board[1].equals("X") && board[4].equals("X") && board[7].equals("X")) {
			playerWin = true;
		}
		else if(board[1].equals("X") && board[4].equals("X") && board[7].equals("X")) {
			playerWin = true;
		}
		else if(board[1].equals("X") && board[4].equals("X") && board[7].equals("X")) {
			playerWin = true;
		}
		// Line 3
		else if(board[2].equals("X") && board[5].equals("X") && board[8].equals("X")) {
			playerWin = true;
		}
		else if(board[2].equals("X") && board[5].equals("X") && board[8].equals("X")) {
			playerWin = true;
		}
		else if(board[2].equals("X") && board[5].equals("X") && board[8].equals("X")) {
			playerWin = true;
		}
		/**
		 * Diagonal
		 */
		else if(board[0].equals("X") && board[4].equals("X") && board[8].equals("X")) {
			playerWin = true;
		}
		else if(board[0].equals("X") && board[4].equals("X") && board[8].equals("X")) {
			playerWin = true;
		}
		else if(board[0].equals("X") && board[4].equals("X") && board[8].equals("X")) {
			playerWin = true;
		}
		// Diagonal 2
		else if(board[2].equals("X") && board[4].equals("X") && board[6].equals("X")) {
			playerWin = true;
		}
		else if(board[2].equals("X") && board[4].equals("X") && board[6].equals("X")) {
			playerWin = true;
		}
		else if(board[2].equals("X") && board[4].equals("X") && board[6].equals("X")) {
			playerWin = true;
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
	@Override
	public boolean getPlayerWin() {
		return playerWin;
	}
	/**
	 * Get if the computer is won.
	 * @return
	 */
	@Override
	public boolean getComputerWin() {
		return comWin;
	}
	/**
	 * Get if there was a tie
	 * @return
	 */
	@Override
	public boolean getTie() {
		return tie;
	}


	@Override
	public boolean getMyTurn() {
		return myTurn;
	}


	@Override
	public void setMyTurn(boolean f) {
		myTurn = f;
		
	}


	@Override
	public JButton getA1() {
		// TODO Auto-generated method stub
		return a1;
	}


	@Override
	public JButton getA2() {
		// TODO Auto-generated method stub
		return a2;
	}


	@Override
	public JButton getA3() {
		// TODO Auto-generated method stub
		return a3;
	}


	@Override
	public JButton getB1() {
		// TODO Auto-generated method stub
		return b1;
	}


	@Override
	public JButton getB2() {
		// TODO Auto-generated method stub
		return b2;
	}


	@Override
	public JButton getB3() {
		// TODO Auto-generated method stub
		return b3;
	}


	@Override
	public JButton getC1() {
		// TODO Auto-generated method stub
		return c1;
	}


	@Override
	public JButton getC2() {
		// TODO Auto-generated method stub
		return c2;
	}


	@Override
	public JButton getC3() {
		// TODO Auto-generated method stub
		return c3;
	}


	@Override
	public void setA1(String s) {
		a1.setText(s);
		
	}


	@Override
	public void setA2(String s) {
		a2.setText(s);
		
	}


	@Override
	public void setA3(String s) {
		a3.setText(s);
		
	}


	@Override
	public void setB1(String s) {
		b1.setText(s);
		
	}


	@Override
	public void setB2(String s) {
		b2.setText(s);
		
	}


	@Override
	public void setB3(String s) {
		b3.setText(s);
		
	}


	@Override
	public void setC1(String s) {
		c1.setText(s);
		
	}


	@Override
	public void setC2(String s) {
		c2.setText(s);
		
	}


	@Override
	public void setC3(String s) {
		c3.setText(s);
		
	}


	@Override
	public String[] getBoard() {
		return board;
	}


	@Override
	public void setBoard(int num, String s) {
		board[num] = s;
		
	}
	
	@Override
	public String getBoardContent(int num) {
		return board[num];
	}


	@Override
	public String getTitle() {
		return "Tic-Tac-Toe | Singleplayer | Hard CPU";
	}
	
	
	
}
