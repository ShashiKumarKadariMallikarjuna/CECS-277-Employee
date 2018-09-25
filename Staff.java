package assignment3;

import java.util.*;
/**Class Staff which is a subclass of employee class
 * @author Shashi Kumar
 *@version Assignment 3
 * @since Due: 9/24/18
 */
public class Staff extends Employee {
	private int HourlyRate;
	/**Constructor Staff which initiates the values*/
	public Staff() {
		super();
		HourlyRate=0;
	}
	/**Overloaded constructor method
	 * @param ln last name	
	 * @param fn first name
	 * @param ID Employee ID
	 * @param sex Sex
	 * @param hireDate  Hired Date
	 * @param hourlyRate  Hourly rate for the work
	 */
	public Staff(String ln, String fn, String ID, String sex, GregorianCalendar hireDate, int hourlyRate) {
		super(ln,fn,ID,sex,hireDate);
		HourlyRate=hourlyRate;
	}
	/** methods which returns monthly earning of the staff*/
	public double monthlyEarnings() {
		return HourlyRate*STAFF_MONTHLY_HOURS_WORKED;
	}
	/** it returns hourly rate 
	 * @return hourly rate
	 */
	public int hourlyrate() {
		return HourlyRate;
	}
	/** it replaces the hourly rate with new value
	 * @param hourly rate 
	 */
	public void setHourlyRate(int hr) {
		HourlyRate=hr;
	}
	/**it returns string of the different Staff details */
	public String toString() {
		if(this instanceof Partime) {
			return super.toString();
		}
		else
			return super.toString()+"\nFull Time\nMonthly Salary: $"+monthlyEarnings();
	}
	
}
