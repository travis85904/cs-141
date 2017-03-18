
/*Travis Davis
 * 
 * This class accepts a students test answers as an argument.
 * 
 * totalCorrect() and totalIncorrect() both use a for loop to check the students answers against answerKey and
 * determine how many indexes match.
 * 
 * passed() checks to see if totalCorrect return a value greater than or equal to 15.
 * 
 * questionsMissed() creates an int array with the numbers of the questions that were incorrect.
 * 
 */
import java.util.ArrayList;

public class DriverExam {
	private final char[] answerKey = { 'A', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C',
			'B', 'D', 'A' };
	private char[] studentAnswers;

	public DriverExam(char[] a) {
		studentAnswers = a;
	}

	int totalCorrect() {
		int totalCorrect = 0;
		for (int i = 0; i < studentAnswers.length; i++) {
			if (studentAnswers[i] == answerKey[i])
				totalCorrect += 1;
		}
		return totalCorrect;
	}

	int totalIncorrect() {
		int totalIncorrect = 0;
		for (int i = 0; i < studentAnswers.length; i++) {
			if (studentAnswers[i] != answerKey[i])
				totalIncorrect += 1;
		}
		return totalIncorrect;
	}

	public boolean passed() {
		if (totalCorrect() >= 15)
			return true;
		else
			return false;
	}

	public ArrayList<Integer> questionsMissed() {
		ArrayList<Integer> questionsMissed = new ArrayList<Integer>();
		for (int i = 0; i < studentAnswers.length; i++) {
			if (studentAnswers[i] != answerKey[i])
				questionsMissed.add(i + 1);
		}
		return questionsMissed;
	}
}
