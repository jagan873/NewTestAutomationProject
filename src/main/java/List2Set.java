import java.util.List;
import java.util.*;

public class List2Set {

	public static void main(String[] args) {
		List<String> l1 = null;
		l1.add("test1");
		l1.add("test1");
		l1.add("test2");

		System.out.println(l1);

		Set<String> s = null;
		for (int i = 0; i <= l1.size(); i++) {

			s.add(l1.get(i));
		}

		System.out.println(s);
		
		Map m1<Integer, String>;
		
		
	}

}
