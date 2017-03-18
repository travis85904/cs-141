/*Travis Davis
 * 
 * The LoShu class uses several methods to determine if the array is a correct LoShu box.
 * 
 * checkFrequency() uses a boolean array to check how many times each number appears.
 * 
 * checkRows() and checkCols() use nested for loops to make sure that all the rows, collumns, 
 * add up to 15 in every direction.
 * 
 * checkDiags() uses array index to make sure that the diagonals sum is 15.
 * 
 * checkLoShu() makes sure that checkFrequency(), checkRows(), checkCols() and checkDiags() all return true.
 * 
 */
public class LoShu {
	private static int[][] loShu;

	public LoShu(int[][] ary) {
		loShu = ary;
	}

	public boolean checkLoShu() {
		if (checkCols(loShu) && checkRows(loShu) && checkDiags(loShu) && checkFrequency(loShu))
			return true;
		return false;
	}

	private boolean checkFrequency(int[][] loShu) {
		boolean[] appears = new boolean[9];
		for (int i = 0; i < appears.length; i++) {
			appears[i] = false;
		}
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				int num = loShu[row][col];
				if (num > 9 || num < 1)
					return false;
				if (appears[num - 1])
					return false;
				appears[num - 1] = true;
			}
		}
		return true;
	}

	private boolean checkRows(int[][] loShu) {
		int sum = 0;
		for (int row = 0; row < 3; row++) {
			sum = 0;
			for (int col = 0; col < 3; col++) {
				sum += loShu[row][col];
			}
			if (sum != 15)
				return false;
		}
		return true;
	}

	private boolean checkCols(int[][] loShu) {
		int sum = 0;
		for (int col = 0; col < 3; col++) {
			sum = 0;
			for (int row = 0; row < 3; row++) {
				sum += loShu[row][col];
			}
			if (sum != 15)
				return false;
		}
		return true;
	}

	private boolean checkDiags(int[][] loShu) {
		if (loShu[0][0] + loShu[1][1] + loShu[2][2] != 15)
			return false;
		if (loShu[2][0] + loShu[1][1] + loShu[0][2] != 15)
			return false;
		return true;
	}
}
