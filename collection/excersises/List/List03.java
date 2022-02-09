import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class List03 {

	public static void printUsingListIterator(List<Integer> list) {
		ListIterator<Integer> listItr = list.listIterator();

		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}
	}

	public static void printUsingIterator(List<Integer> list) {
		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void printUsingEnumeration(List<Integer> list) {
		Enumeration<Integer> enu = Collections.enumeration(list);

		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}

	public static void main(String[] args) {
		List<Integer> vec = new Vector<>();

		vec.add(2);
		vec.add(17);
		vec.add(5);
		vec.add(84);
		vec.add(57);

		System.out.println("Printing values using Enumeration:");
		printUsingEnumeration(vec);

		System.out.println("Printing values using Iterator:");
		printUsingIterator(vec);

		System.out.println("Printing values using ListIterator:");
		printUsingListIterator(vec);
	}
}