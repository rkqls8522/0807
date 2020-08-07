package basic0807_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		//영어단어와 한글단어를 저장
		HashMap<String,String> dic = new HashMap<String, String>();
		
		//3개의 (key, value)쌍을 dic에 저장
		dic.put("baby","아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		for(String i : dic.keySet())
			System.out.println("키값 : " + i + "\n값은 : " + dic.get(i));
		for(String i : dic.values()) System.out.println("값은 : " + i);
		System.out.println();
		
		//영어 단어를 입력받고 한글단어 검색
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("찾고 싶은 단어는?");
			String eng = sc.next();
			String kor = dic.get(eng);
			if(kor==null) System.out.println(eng+ " 가 없습니다.");
			else System.out.println(kor);
		}
		
		
		
		
		
		//dic 해시맵에 있는 모든 (key, value)쌍 출력
		Set<String> keys = dic.keySet();//모든 키를 Set컬렉션에 받아옴
		Iterator<String> it = keys.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		
		
	}

}
