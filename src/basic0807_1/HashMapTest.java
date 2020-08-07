package basic0807_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		//����ܾ�� �ѱ۴ܾ ����
		HashMap<String,String> dic = new HashMap<String, String>();
		
		//3���� (key, value)���� dic�� ����
		dic.put("baby","�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		for(String i : dic.keySet())
			System.out.println("Ű�� : " + i + "\n���� : " + dic.get(i));
		for(String i : dic.values()) System.out.println("���� : " + i);
		System.out.println();
		
		//���� �ܾ �Է¹ް� �ѱ۴ܾ� �˻�
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("ã�� ���� �ܾ��?");
			String eng = sc.next();
			String kor = dic.get(eng);
			if(kor==null) System.out.println(eng+ " �� �����ϴ�.");
			else System.out.println(kor);
		}
		
		
		
		
		
		//dic �ؽøʿ� �ִ� ��� (key, value)�� ���
		Set<String> keys = dic.keySet();//��� Ű�� Set�÷��ǿ� �޾ƿ�
		Iterator<String> it = keys.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		
		
	}

}
