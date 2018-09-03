package me.ryandw11.tictactoe.util;

import javax.swing.JButton;

public interface Singleplayer {
	
	public boolean myTurn = true;
	
	public void computerMove();
	
	public void define();
	
	public void reset();
	
	public void checkWin();
	
	public boolean getPlayerWin();
	
	public boolean getComputerWin();
	
	public boolean getTie();
	
	public boolean getMyTurn();
	public void setMyTurn(boolean f);
	
	public JButton getA1();
	public JButton getA2();
	public JButton getA3();
	public JButton getB1();
	public JButton getB2();
	public JButton getB3();
	public JButton getC1();
	public JButton getC2();
	public JButton getC3();
	
	public void setA1(String s);
	public void setA2(String s);
	public void setA3(String s);
	public void setB1(String s);
	public void setB2(String s);
	public void setB3(String s);
	public void setC1(String s);
	public void setC2(String s);
	public void setC3(String s);
	
	public String[] getBoard();
	public String getBoardContent(int num);
	public void setBoard(int num, String s);
	
	public String getTitle();
	

}
