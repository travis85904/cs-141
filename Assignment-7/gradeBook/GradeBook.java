package gradeBook;

/*Travis Davis
 * Assignment 7
 * 
 * The GradeBook class is started with a constructor class that accepts the number of student, number of tests,
 * and an array of test scores as arguments.
 * 
 * setName() accepts an int and a string as arguments to add the student names to an ArrayList called names.
 * getName() accepts an int to return an index from the Arraylist names.
 * setScore() accepts accepts 2 ints and a double to store the students test score in the scores array.
 * getAverage() accepts an int to get the average of a specific students test scores, then drops the lowest test score,
 * and returns an average based on the number of tests.
 * getLetterGrade returns a letter grade based on the students average test score as calculated in getAverage().
 */
import java.util.ArrayList;
import java.util.Arrays;

public class GradeBook {
	private ArrayList<String> names = new ArrayList<String>();
	private double[][] scores;
	private int numStudents, numTests;

	public GradeBook(int students, int tests) {
		numStudents = students;
		numTests = tests;
		scores = new double[numStudents][numTests];
	}

	void setName(int index, String name) {
		names.add(index, name);
	}

	public String getName(int index) {
		return names.get(index);
	}

	public void setScore(int nameIndex, int scoreIndex, double score) {
		scores[nameIndex][scoreIndex] = score;
	}

	public double getAverage(int nameIndex) {
		double avg = 0;
		double[] score = new double[numTests];
		for (int scoreIndex = 0; scoreIndex < numTests; scoreIndex++) {
			score[scoreIndex] = scores[nameIndex][scoreIndex];
		}
		Arrays.sort(score);
		if (score.length > 1) {
			score[0] = 0;
			for (int i = 1; i < score.length; i++) {
				avg += score[i];
			}
			return avg / (numTests - 1);
		} else
			return score[0];
	}

	public String getLetterGrade(int index) {
		String grade;
		if (getAverage(index) >= 90) {
			grade = "A";
		} else if (getAverage(index) >= 80) {
			grade = "B";
		} else if (getAverage(index) >= 70) {
			grade = "C";
		} else if (getAverage(index) >= 60) {
			grade = "D";
		} else
			grade = "F";
		return grade;
	}
}