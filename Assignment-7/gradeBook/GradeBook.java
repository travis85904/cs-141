package com.company;

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
import java.util.stream.DoubleStream;

class GradeBook {
    private ArrayList<String> names = new ArrayList<String>();
    private double[][] scores;
    private int numTests;

    GradeBook(int students, int tests) {
        numTests = tests;
        scores = new double[students][tests];
    }

    void setName(int index, String name) {
        names.add(index, name);
    }

    String getName(int index) {
        return names.get(index);
    }

    void setScore(int nameIndex, int scoreIndex, double score) {
        scores[nameIndex][scoreIndex] = score;
    }

    //initialize accumulator "avg" to add sum of tests
    //sort the students test scores from low to high

    //if the student took more than 1 test, drop the students lowest score,
    //then get the sum of all test scores, and divide by number of tests - 1. (-1 because we dropped their lowest score.)
    //if student only took 1 test, we will return the score of that test.

    /*Changes:
     *got rid of redundant local variable score[]
     *replaced for loop with DoubleStream.of().sum(), got rid of unused variable avg
     */
    double getAverage(int nameIndex) {
        Arrays.sort(scores[nameIndex]);
        if (scores[nameIndex].length > 1) {
            scores[nameIndex][0] = 0;
            return DoubleStream.of(scores[nameIndex]).sum() / (numTests - 1);
        }
        return scores[nameIndex][0];
    }

    String getLetterGrade(int index) {
        if (getAverage(index) >= 90) {
            return "A";
        } else if (getAverage(index) >= 80) {
            return "B";
        } else if (getAverage(index) >= 70) {
            return "C";
        } else if (getAverage(index) >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
