//Jisoo Kim 07/23/2022
//---------------------------------------------------------------------------
//
// 8 Queens Program
// This program solves the 8 Queens problem and shows the solved result.
//
// Author: Jisoo Kim
// Date: 07/23/2022
// Class: MET CS342
// Issues: None known
//
// Description:
// The 8 Queens are on the chess board, and no queen could capture each other. 
// The Queen can move 1-7 in any direction on the board.
// In this program, linked stack was used to solve the 8 queens problem.
//
//
// Assumptions:
// The program will show the 8 queens problem result.
//____________________________________________________________________________

//
// Class: ProgramDriver
//
// Description:
// This is the main class that runs the program. 
// It runs the methods in the QueensProblem.class.
public class ProgramDriver {

	public static void main(String[] args) {
		
		ProgramDriver pd = new ProgramDriver();
		pd.problemSolved();
	}
	
	/* problemSolved()     (check queens and print the result)
	 * input : QueensProblem
	 * output : print output
	 * return : none
	 * */
	private void problemSolved() {
		QueensProblem<Integer> q = new QueensProblem<>(); //Integer: for queen column number
		
		q.checkQueens();
		q.printOutput();
		
	}

}
