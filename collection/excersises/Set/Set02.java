import java.util.Iterator;
import java.util.TreeSet;

public class Set02 {
	TreeSet<String> treeSet = new TreeSet<>();

	public void reverse() {
		this.treeSet = (TreeSet<String>) treeSet.descendingSet();
	}

	public void doesExist(String str) {
		if (treeSet.contains(str)) {
			System.out.println(str + " exists.");
		} else {
			System.out.println(str + " does not exists.");
		}
	}

	public void print() {
		Iterator<String> itr = treeSet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void add(String str) {
		treeSet.add(str);
	}

	public static void main(String[] args) {
		Set02 treeSet = new Set02();

		treeSet.add("Amit");
		treeSet.add("Ram");
		treeSet.add("Suresh");
		treeSet.add("Himesh");
		treeSet.add("Tanu");

		// 1. reverse Elements
		treeSet.reverse();
		// 2. iterate the elements
		treeSet.print();
		// 3. Check if element exists
		treeSet.doesExist("Ram");
	}
}
