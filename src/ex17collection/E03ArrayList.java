package ex17collection;

import java.util.ArrayList;

public class E03ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add(3,"워너원");
//		list.add(5,"인덱스를 건너뛸수없음");
		list.add(list.size(),"소녀시대2");
		list.add(list.size(),"방탄소년단");
		System.out.println("중복저장전 객체수:"+list.size());
		
		
		
		
		

	}

}
