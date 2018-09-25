package assignment3;
import java.util.*;
/**Class comparer which implemets comparater
 * @author Shashi Kumar
 * @version Assignment 3
 * @since Due: 9/24/18
 */
public class Comparer implements Comparator<Employee>{
	/**It compares two employees Id of Employee objects */
	public int compare(Employee o1, Employee o2) {
		return o1.ID().compareTo(o2.ID());
	}

}