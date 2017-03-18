
/*Travis Davis
 * 
 * This program is to test the DriverExam class, and get input for the test.
 * 
 * getInput() uses a foor loop to get the user to input all of the answers they gave for the test.
 * It also uses a try catch block incase the user does not input an answer for one of the questions.
 */
import java.util.Arrays;

import javax.swing.JOptionPane;

public class DriverExamTest {
	private static char[] studentAnswers = new char[20];
	private static DriverExam newTest = new DriverExam(studentAnswers);

	public static void main(String[] args) {
		getInput();
		studentPassed();
		print();
	}

	public static void getInput() {
		for (int i = 0; i < 20; ++i) {
			try {
				studentAnswers[i] = Character
						.toUpperCase(JOptionPane.showInputDialog("Enter the answer to question " + (i + 1)).charAt(0));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You must enter a response!");
				--i;
			}
		}
	}

	private static void studentPassed() {
		if (newTest.passed()) {
			System.out.println("You passed!");
		} else {
			System.out.println("You did not pass!");
		}
	}

	private static void print() {
		System.out.println(newTest.passed());
		System.out.println("You missed the following questions: " + newTest.questionsMissed());
		System.out.println("Total correct: " + newTest.totalCorrect());
		System.out.println("Total incorrect: " + newTest.totalIncorrect());
		System.out.println("Student answers: " + Arrays.toString(studentAnswers));
	}
}
