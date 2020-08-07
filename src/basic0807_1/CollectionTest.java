package basic0807_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {

		List<Integer> a1 = new ArrayList<>();
		a1.add(5);
		a1.add(4);
		a1.add(-1);
		a1.add(111);
		
		Iterator testA = a1.iterator();
		while(testA.hasNext())
			System.out.println(testA.next());
		
	}

}
