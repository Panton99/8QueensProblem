//Jisoo Kim 07/23/2022


//
// Class: QueensProblem
//
// Description:
// This class uses LinkedStack.class for finding a valid place for queen on each row and column.
// It has top(), checkQueens(), isNotConflict(), and printOut() methods.	
// 
public class QueensProblem<T> {
	LinkedStack<Integer> s = new LinkedStack<Integer>();
	//cur is current column number 
	private int cur = 0;
	
	
	/* top()     (to set the first row value to 0 on stack)
	 * input : 0
	 * output : set the first linked stack value to 0
	 * return : none
	 * */
	public void top() { 
		//set the queen on the first row and column (0,0)
		s.push(0);
	}
	
	/* checkQueen()     (check if it is conflict with each other by going forward of column on each row)
	 * input : cur
	 * output : 8 linked stack full of values
	 * return : none
	 * */
	public void checkQueens() {
		
		top();  //first row stack is set
		
		boolean success = false;
		
		while (!success && !s.isEmpty()) { //until stack is full and not empty
			
			if (cur > 7) { //there is no valid place for the queen, we should go back 
				cur = s.pop(); //pop the previous result (column number)
				cur = cur + 1;  //go to next column of the previous row
			}
			if (isNotConflict() && cur < 8) { //if there is no conflict and cur is on the board
				s.push(cur); //push the cur value (column number)
				cur = 0; //set to 0 for the next row 
				
			}  
			cur++;  //move column +1
			if (s.size() == 8) {  //when stack is full, it is succeeded
				success = true;
			}
	
		}
	}
	
	/* isNotConflict()     (check column number to see if it has a diagonal or vertical match)
	 * input : cur
	 * output : none
	 * return : true if there is no match with diagonal or vertical condition.
	 * */
	public boolean isNotConflict() { 
		
		for (int i = 0 ; i < s.size(); i++) {
			//Note: nth linked node goes opposite way of i. so nth node i --> size - i - 1 
			
			if (cur == s.getNthNode(s.size() - i - 1)) { //when the two is in the same column
				return false;
			}
			if ((s.size() - i) == (cur - s.getNthNode(s.size() - i - 1))) { //checking diagonal (positive)
				return false;	
			}
			if ((i - s.size()) == (cur - s.getNthNode(s.size() - i - 1))) { //checking diagonal (negative)
				return false;	
			}
		}
		return true;  //true if there is no conflict
	}
	
	/* printOutput()     (print the output of valid queen result by 8*8)
	 * input : node value
	 * output : Q or blank
	 * return : none
	 * */
	public void printOutput() {
		System.out.println("     8 Queens Problem result     ");
		System.out.println("+---+---+---+---+---+---+---+---+");
		
		for (int i = s.size() - 1; i >= 0; i--) {  //show the 2d array 8*8 dimension
			for (int j = 0; j < 8; j++) {   //get the nth node value to print the result
				if (s.getNthNode(i) == j) {  //set the queen when match the stack value
					if (j == 7) { //when queen is on the 8th column, go to new line
						System.out.print("| Q |\n");
						System.out.println("+---+---+---+---+---+---+---+---+");
					}else {
					System.out.print("| Q "); //column 1 ~ 6
					}
				
				} else if (j == 7) { //when there is no match with the stack value and 8th column, blank and new line
					System.out.print("|   |\n");
					System.out.println("+---+---+---+---+---+---+---+---+");
				
				} else { //when there is no match with the stack value, just blank
					System.out.print("|   ");
				}
				
			}
		}
		
	}

}
