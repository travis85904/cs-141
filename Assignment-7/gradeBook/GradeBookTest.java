package gradeBook;

/*Travis Davis
 * Assignment 7
 * 
 * GradeBookTest is to demonstrate the GradeBook class.
 * 
 * We start by setting numStudents and numTests, using setStudents() and getTests().
 * setScores() uses a nested for loop to get the students name, and all their test scores based on how many
 * students and tests we said we wanted to have.
 * print() uses a nested for loop to print each students name, their average test score, and a letter grade
 * based on the average.
 */
import javax.swing.JOptionPane;

public class GradeBookTest {
	private static GradeBook grades;
	private static int numStudents;
	private static int numTests;

	public static void main(String[] args) {
		setNumStudents();
		setNumTests();
		grades = new GradeBook(numStudents, numTests);
		setScores();
		print();
	}

	private static void setNumStudents() {
		numStudents = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of students"));
	}

	private static void setNumTests() {
		numTests = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tests per student"));
	}

	public static void setScores() {
		for (int i = 0; i < numStudents; i++) {
			grades.setName(i, JOptionPane.showInputDialog("Enter the name for student number " + (i + 1)));
			for (int j = 0; j < numTests; j++) {
				grades.setScore(i, j, Double.parseDouble(
						JOptionPane.showInputDialog("Enter " + grades.getName(i) + "'s score for test number " + (j + 1))));
			}
		}
	}

	private static void print() {
		for (int i = 0; i < numStudents; i++) {
			System.out.print(grades.getName(i));
			System.out.print(": " + grades.getAverage(i));
			System.out.println(" " + grades.getLetterGrade(i));
		}
	}
}
