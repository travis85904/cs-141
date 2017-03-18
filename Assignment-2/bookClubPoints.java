
//Travis Davis

import javax.swing.JOptionPane;

public class bookClubPoints {

	public static void main(String[] args) {
		Integer points;
		Integer books = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of books you have purchased this month"));// gets books var
		switch (books) {
		case 0:// 0 books
			points = 0;// sets points variable
			JOptionPane.showMessageDialog(null, "You earned " + points + " points this month");// displays number of points earned
			break;
		case 1:// 1 book
			points = 5;
			JOptionPane.showMessageDialog(null, "You earned " + points + " points this month");
			break;
		case 2:// 2 books
			points = 15;
			JOptionPane.showMessageDialog(null, "You earned " + points + " points this month");
			break;
		case 3:// 3 books
			points = 30;
			JOptionPane.showMessageDialog(null, "You earned " + points + " points this month");
			break;
		default:// 4 or more
			points = 60;
			JOptionPane.showMessageDialog(null, "You earned " + points + " points this month");
			break;
		}

	}

}
