package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean twentyfourHours;

	public Time(int hour, int minute, boolean twentyfourHours) {
		this.hour = hour;
		this.minute = minute;
		this.twentyfourHours = twentyfourHours;
	}

	public String toString() {
		if ((twentyfourHours == false) && (hour > 12)) {
			return (hour - 12) + ":" + minute;
		} else {
			return hour + ":" + minute;
		}
	}

	public static void main(String[] args) {
		Time time1 = new Time(23 , 53, false);
		Time time2 = new Time(12, 47, true);
		Time time3 = new Time (5, 06, false);
		Time time4 = new Time (13, 27, false);
		Time time5 = new Time (21, 01, true);
		
		LinkedList<Time> list = new LinkedList<Time>();
		list.add(time1);
		list.add(time2);
		list.add(time3);
		list.add(time4);
		list.add(time5);
		
		System.out.println(list);

	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute, twentyfourHours);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute && twentyfourHours == other.twentyfourHours;
	}

}