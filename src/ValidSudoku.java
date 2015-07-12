import java.util.HashSet;

/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * 
 * The Sudoku board could be partially filled, where empty cells are filled with
 * the character '.'.
 * 
 * @author 1qa
 *
 */
public class ValidSudoku {
	public static void main(String[] args) {
		char[][] board = {
				{'9','.','.','6','.','.','.','.','.'},
				{'.','.','.','.','6','.','.','.','.'},
				{'.','.','.','.','.','1','.','3','.'},
				{'.','.','.','.','.','.','.','.','8'},
				{'.','.','.','.','.','8','.','.','.'},
				{'.','.','.','4','.','.','2','.','.'},
				{'.','.','.','.','.','.','.','.','1'},
				{'6','.','.','.','1','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'}};
		System.out.println(isValidSudoku(board));
	}
	public static boolean isValidSudoku(char[][] board) {
		HashSet<Character> set = new HashSet<Character>();
		int length = board.length;
		// row
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (board[i][j] == '.')
					continue;
				if (set.contains(board[i][j])) {
					return false;
				}
				set.add(board[i][j]);
			}
			set.clear();
		}
		// column
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (board[j][i] == '.')
					continue;
				if (set.contains(board[j][i])) {
					return false;
				}
				set.add(board[j][i]);
			}
			set.clear();
		}
		// submatrix
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if(j==3){
					System.out.println();
				}
				if (board[i][j] == '.')
					continue;
				for (int row = i / 3 * 3; row < i / 3 * 3 + 3; row++) {
					for (int col = j / 3 * 3; col < j / 3 * 3 + 3; col++) {
						if (board[row][col] == '.')
							continue;
						if (set.contains(board[row][col])) {
							return false;
						}
						set.add(board[row][col]);
					}
				}
				set.clear();
			}
		}
		return true;
	}
}
