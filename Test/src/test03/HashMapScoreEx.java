package test03;
import java.util.*;


public class HashMapScoreEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이름과 점수를 저장할 HashMap 컬렉션 생성
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		//<String, Integer>();로 간략히 써도 됨
		
		// 5개의 점수 저장
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 : "+ javaScore.size());
		
		//모든 사람의 점수 출력. javaScore에 들어 있는 모든 (key, value) 쌍 출력
		Set<String> keys = javaScore.keySet(); //모든 key 를 가진 Set 컬렉션 리턴
		Iterator<String> it = keys.iterator(); //Set에 있는 모든 key를 순서대로 검색하는 Iterator 리턴
		
		while(it.hasNext()) {
			String name = it.next(); // 다음 키. 학생이름
			int score = javaScore.get(name); //점수 알아내기
			System.out.println(name + ":" + score);
		}
		
	}

}
