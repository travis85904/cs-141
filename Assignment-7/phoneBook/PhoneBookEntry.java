/* Travis Davis
 * Assignment 7
 *
 * The PhoneBookEntry class does contain the accessor and constructor methods as required,
 * although they are not used because they are not needed.
 *
 * The constructor accepts 2 String args for name and number, and then sets local variables
 * for them
 *
 * toString() prints the local variables name and number in an easy to read format.
 */

package com.company;

public class PhoneBookEntry {
    private String name;
    private String number;

    public PhoneBookEntry(String name, String number) {
        this.name = name;
        this.number = number;
    }

    //not used
    public String getName() {
        return name;
    }
    //not used
    void setName(String name) {
        this.name = name;
    }
    //not used
    String getNumber() {
        return number;
    }
    //not used
    void setNumber(String number) {
        this.number = number;
    }

    public String toString() {
        return "Name: " + this.name
                + " | Phone number: " + this.number + "\n";
    }


}



