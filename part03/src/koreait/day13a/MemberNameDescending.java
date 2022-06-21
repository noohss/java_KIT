package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

public class MemberNameDescending implements Comparator<Member>{
	
	@Override
	public int compare(Member o1, Member o2) {
//		String name1 = o1.getName();
//		String name2 = o2.getName();
//		return name2.compareTo(name1);
		return o2.getName().compareTo(o2.getName());
	}

}
