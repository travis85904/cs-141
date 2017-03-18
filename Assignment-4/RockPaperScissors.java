
//Travis Davis
import java.util.Random;

import javax.swing.JOptionPane;

public class RockPaperScissors {
	// creating a random number for computer choice
	static Random rand = new Random();
	// int randomNum = rand.nextInt((max - min) + 1) + min;
	static int randomNum;
	static String[] choices = { "Rock", "Paper", "Scissors" };
	static String compChoice;
	static String userChoice;

	public static void main(String[] args) {
		// loop if computer and user both choose the same
		do {
			try {
				randomNum = rand.nextInt((3 - 1) + 1) + 1;
				// if randomNum in range, run program
				if (randomNum >= 1 && randomNum <= 3) {
					getUserChoice();
					setCompChoice();
					checkWinner();
				} else
					throw new Exception();
				// throws exception and quits if randomNum is not in range
			} catch (Exception e) {
				System.out.println("Exception: randomNum out of range...\n\nPlease contact your System Administrator...");
				System.exit(0);
			}
		} while (userChoice == compChoice);
	}

	public static void getUserChoice() {
		// gets users choice via a drop down menu
		userChoice = (String) JOptionPane.showInputDialog(null, "Choose now", "Game", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
	}

	public static void setCompChoice() {
		// set computer choice
		switch (randomNum) {
		case 1:
			compChoice = "Rock";
			break;
		case 2:
			compChoice = "Paper";
			break;
		case 3:
			compChoice = "Scissors";
			break;
		default:
			System.out.println("There was an error with compChoice...");
			break;
		}

	}

	public static void checkWinner() {
		// check for winner and display results
		if (compChoice.equals(userChoice)) {
			JOptionPane.showMessageDialog(null, "Both chose " + userChoice + "! The game is a tie! Please try again!");
		} else if (compChoice == "Rock" && userChoice == "Paper") {
			JOptionPane.showMessageDialog(null, "The computer chose " + compChoice + " and you chose " + userChoice + ". You win!");
		} else if (compChoice == "Rock" && userChoice == "Scissors") {
			JOptionPane.showMessageDialog(null, "The computer chose " + compChoice + " and you chose " + userChoice + ". The computer won.");
		} else if (compChoice == "Paper" && userChoice == "Rock") {
			JOptionPane.showMessageDialog(null, "The computer chose " + compChoice + " and you chose " + userChoice + ". The computer won.");
		} else if (compChoice == "Paper" && userChoice == "Scissors") {
			JOptionPane.showMessageDialog(null, "The computer chose " + compChoice + " and you chose " + userChoice + ". You win!");
		} else if (compChoice == "Scissors" && userChoice == "Rock") {
			JOptionPane.showMessageDialog(null, "The computer chose " + compChoice + " and you chose " + userChoice + ". The computer won.");
		} else if (compChoice == "Scissors" && userChoice == "Paper") {
			JOptionPane.showMessageDialog(null, "The computer chose " + compChoice + " and you chose " + userChoice + ". You win!");
		}

	}

}
