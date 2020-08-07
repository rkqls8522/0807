package basic0807_1;

import java.util.ArrayList;
import java.util.List;

public class java0807_1 {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.forEach(i->System.out.print(i + ","));
		
		
		
		
	}
}
