package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.jar.Attributes.Name;

public class C46_ArrayList {
	public static void main(String[] args) {
		int[] datas = {45,23,7,21,19,11,44};	// 배열은 선언할 때 배열의 크기를 정한다.
									// 배열은 기본형 데이터 타입 int, double, long... 또는 참조형 타입
		
		ArrayList<Integer> list = new ArrayList<>();
					// ArrayList는 크기가 동적.
					// 데이터 타입은 항상 참조형 타입. 기본형은 래퍼 클래스를 사용.
					// <E>는 제너릭(generic, 포괄적인) 타입이라고 부름. 모든 타입을 리스트에 담을 수 있다. 
					// 리스트에 저장하는 데이터를 요소(Element)라고 한다.
					// 주요 메소드 : add,get,size,remove
		
		String[] names = {"쯔위", "모모", "신비", "은하", "나나"};
		ArrayList<String> nameList = new ArrayList<>();
		
		// ArrayList에 데이터 추가는 add() 메소드를 사용.
		list.add(45);
		list.add(7);
		list.add(21);
		list.add(19);
		list.add(11);
		list.add(44);
		
		System.out.println("1. 첫번째 ArrayList<Integer> 출력");
		System.out.println(list);
		System.out.println("참고(배열) " + Arrays.toString(datas) + ", 배열크기 : " + datas.length);
		System.out.println("리스트의 크기 : " + list.size());
		
		nameList.add("쯔위");
		nameList.add("모모");
		nameList.add("은하");
		nameList.add("나나");
		
		// 크기 : 배열 - length
		//	 	 리스트 - size() 메소드
		System.out.println("\n2. 두번째 ArrayList<String> 출력");
		System.out.println(nameList);
		System.out.println("리스트의 크기 : " + nameList.size());	// 데이터 없을 때는 0
		
		// 추가 : add() 메소드
		System.out.println("\n3. 특정 위치에 데이터 추가");
		list.add(1, 23);	// (인덱스위치, 추가될 값) 단, 인덱스 위치는 리스트의 크기보다 작아야 함.
		System.out.println("add(1,23) 결과 : " + list);
		nameList.add(2, "신비");
		System.out.println("add(2,\"신비\") 결과 : " + nameList);
		
		// index로 데이터 가져오기 : get() 메소드
		System.out.println("\n4. 배열처럼 index 값으로 데이터 가져오기");
		System.out.println("get(3) : " + list.get(3));
		System.out.println("get(3) : " + nameList.get(3));
		
		// 삭제 : remove() 메소드
		System.out.println("\n5. 특정 위치의 데이터(요소) 제거");
		list.remove(4);
		System.out.println("remove(4) : " + list);
		nameList.remove(4);
		System.out.println("remove(4) : " + nameList);
		
		// 특정 값의 index 알아내기 :  배열 - Arrays.binarySearch()
		//						  리스트 - .indexOf()
		System.out.println("\n6. 특정 값 위치 알아내기 ('신비'는 몇번 인덱스?)");
		System.out.println("배열 : " + Arrays.binarySearch(names, "신비"));
		System.out.println("리스트 : " + nameList.indexOf("신비"));
		
		System.out.println("\n7. 6번의 실행 내용을 for문으로 구현");
		System.out.println("배열");
		int i;
		for(i = 0; i < names.length; i++) {
			if(names[i].equals("신비"))
				break;
		}	
		System.out.println("'신비'는 인덱스 : " + i);
		System.out.println("리스트");
		
		for(i = 0; i < nameList.size(); i++) {
			if(nameList.get(i).equals("신비"))
				break;
		}
		System.out.println("'신비'는 인덱스 : " + i);
		
	// '신비' 요소가 여러개일 때 리스트는 lastIndexOf 메소드로 마지막 일치 요소를 찾을 수 있다.
		
		System.out.println("\n8. contains 메소드");
		System.out.println("'나나'가 리스트에 있는가? " + nameList.contains("모모"));
		System.out.println("'다현'이 리스트에 있는가? " + nameList.contains("다현"));
			
	}
}

/*	배열 : 많은 양의 데이터를 저장하는 방법
 * 	
 * 	컬렉션(Collections) : 자료구조. 많은 양의 데이터를 저장하는 것이고 데이터 특징에 따라 
 * 						관리(저장, 읽기/쓰기)하는 차이가 있다.
 * 						데이터를 삽입/삭제 등의 알고리즘이 메소드로 구현되어 있음.
 * 		ㄴ ArrayList	클래스
 * 		ㄴ HashMap 클래스
 * 	
 */