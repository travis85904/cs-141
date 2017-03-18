/*Travis Davis
 * 
 * This program uses the LoShu class to determine if the grid is a true LoShu grid. It also uses the
 * printArray() method to print the array in a grid format.
 */
public class LoShuTest {
	static int[][] grid = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };

	public static void main(String[] args) {
		printArray(grid);
		LoShu newLoShu = new LoShu(grid);
		System.out.println(newLoShu.checkLoShu());
		// System.out.println(checkLoShu(grid));
	}

	private static void printArray(int[][] ary) {
		for (int row = 0; row < ary.length; row++) {
			System.out.println();
			for (int col = 0; col < ary[row].length; col++) {
				System.out.print(ary[row][col] + " ");
			}
		}
		System.out.println();
	}
}
