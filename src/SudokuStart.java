
/*  Class containing the main method to create a GUI
 * 
 *  Author: Muskan Gupta
 *  
 *  This program creates a GUI to input values in a sudoku table,
 *  then solve the puzzle using recursive backtracking.
 *  Also includes sample puzzles for testing
 * 
 * 
*/
public class SudokuStart {
	public static void main (String args[]){
		GUI gui = new GUI();
		gui.createGUI();
	}
}

// cd "c:\Users\acer\5th SEM\sudokku\sudoku-solver"
// javac -d bin -sourcepath src src/me/tacchino/sudoku/*.java

// java -cp bin me.tacchino.sudoku.SudokuStart

