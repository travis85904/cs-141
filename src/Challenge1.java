
//Travis Davis

import javax.swing.JOptionPane;

public class Challenge1 {

	static String name, age, address;

	public static void main(String[] args) {

		name = JOptionPane.showInputDialog("What is your name?");// asks user for their name
		age = JOptionPane.showInputDialog("How old are you?");// asks for age
		address = JOptionPane.showInputDialog("What is your address?");// asks for address

		System.out.println("My name is " + name + " and I am " + age + " years old.");// prints name and age
		System.out.println("My address is " + address);// prints address

	}

}