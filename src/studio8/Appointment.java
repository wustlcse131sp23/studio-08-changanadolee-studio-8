package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;

	public Appointment(Date date , Time time) {
		this.date = date;
		this.time = time;
	}
	
	public static void main (String [] args) {
		Date string1 = new Date(01 , 15, 2023, true);
		Date string2 = new Date (01, 15, 2023, false);
		Date string3 = new Date (01	, 15, 2023, true);
		Date string4 = new Date (9, 13, 2019, false);
		Date string5 = new Date (03, 03, 2010, true);
		
		Time time1 = new Time(23 , 53, false);
		Time time2 = new Time(12, 47, true);
		Time time3 = new Time (5, 06, false);
		Time time4 = new Time (13, 27, false);
		Time time5 = new Time (21, 01, true);
		
		Appointment app1 = new Appointment(string1, time1);
		Appointment app2 = new Appointment(string2, time2);
		Appointment app3 = new Appointment(string3, time3);
				
		LinkedList<Appointment> Calendar = new LinkedList<Appointment>();
		Calendar.add(app1);
		Calendar.add(app2);
		Calendar.add(app3);
		System.out.println(Calendar);		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, time) && Objects.equals(date, other.time);
	}
	
}
