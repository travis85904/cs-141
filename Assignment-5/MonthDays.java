//Travis Davis
public class MonthDays {

	private int month;
	private int year;
	private boolean leapYear;

	// contructor
	public MonthDays(int month, int year) {
		this.month = month;
		this.year = year;
	}

	// no-arg constructor
	public MonthDays() {
		month = 1;
		year = 1900;
	}

	// check for leap year
	public boolean leapYear() {
		if (year % 100 == 0 && year % 400 == 0) {
			leapYear = true;
		} else if (year % 100 != 0 && year % 4 == 0) {
			leapYear = true;
		} else
			leapYear = false;
		return leapYear;
	}

	// find out how many days in month
	public int getNumberOfDays() {
		switch (month) {
		case 1:
			return 31;
		case 2:
			if (leapYear() == true) {
				return 29;
			} else
				return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;

		}
		return 0;
	}

	// mutator for month
	public void setMonth(int m) {
		month = m;
	}

	// mutator for year
	public void setYear(int year) {
		this.year = year;
	}

	// accessor for month
	public int getMonth() {
		return month;
	}

	// accessor for year
	public int getYear() {
		return year;
	}

}
