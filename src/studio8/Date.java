package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean holiday;

	/**
	 * The input parameter variables will be assigned to the instance variables
	 * 
	 * @param month
	 * @param day
	 * @param year
	 */
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}

	public String toString() {
		if (holiday == true) {
			return month + "/" + day + "/" + year + " is a holiday.";
		} else {
			return month + "/" + day + "/" + year;
		}
	}


	public static void main(String[] args) {
		Date string1 = new Date(01 , 15, 2023, true);
		Date string2 = new Date (01, 15, 2023, false);
		Date string3 = new Date (01	, 15, 2023, true);
		Date string4 = new Date (9, 13, 2019, false);
		Date string5 = new Date (03, 03, 2010, true);
	
	LinkedList<Date> list = new LinkedList<Date>();
		list.add(string1);
		list.add(string2);
		list.add(string3);
		list.add(string4);
		list.add(string5);
		
		System.out.println(list);

		HashSet<Date> set = new HashSet <Date>();
		set.add(string1);
		set.add(string2);
		set.add(string3);
		System.out.println(set);
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
}
