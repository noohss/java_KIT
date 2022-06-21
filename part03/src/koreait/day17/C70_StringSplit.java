package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_StringSplit {
	public static void main(String[] args) {
		
		// String Ŭ������ split(�п���Ű��, �ɰ���) �޼ҵ� : ����Ÿ���� String[]
		
		String temp = "��� 90 88 79";
		String result[] = temp.split(" "); 		// ������ �������� ���ڿ��� �������� �ɰ���
		System.out.println("1. �ݺ��� ���� ���");
		System.out.println("index 0 : " + result[0]);
		System.out.println("index 0 : " + result[1]);
		System.out.println("index 0 : " + result[2]);
		System.out.println("index 0 : " + result[3]);
		System.out.println("result length : " + result.length);
		
		// for������
		System.out.println("2. �Ϲ����� for ���");
		for(int i = 0; i < result.length; i++) {
			System.out.println(String.format("result[%d] : %s", i, result[i]));
		}
		
		// ���� for��
		System.out.println("3. ���� for ���");
		for(String t : result)
			System.out.println("result ��� : " + t);
		
		String temp2 = "���, 90, 88, 79";
		result = temp2.split(",");
		System.out.println("4. split ���б�ȣ , ");
		for(String t : result)
			System.out.println("result ��� : " + t);
		
		temp2 = "���,, 90,, 88,, 79";
		result = temp2.split(",");
		System.out.println("5. split ���б�ȣ , ");
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result ��� : " + t);
		// result[1], result[3], result[5]
		
		result = temp2.split(",,");
		System.out.println("6. split ���б�ȣ ,, ");
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result ��� : " + t);
		
		// split�� ������ ���ڿ��� ���Խ� regex ���ڿ�(���Խ� ������ ����. �����)
		//		���Խ� ���� : [] �ȿ� ǥ���ϴ� ���� ���� �������� �Ǵ�(or)�� �ش��Ѵ�.
		temp2 = "���,90 88()79";
		result = temp2.split("[ ,()]");		// ���Խ� ���ڿ� : ���� ��ȣ�� ���� �Ǵ� , �Ǵ� ()
		System.out.println("7. split ���ڰ� ���Խ� ");
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result ��� : " + t);
		
		temp2 = "���,90,88,79";
		result = temp2.split(",", 2);
//		result = temp2.split(",", 6);
		System.out.println("8. split �ι�° ���� limit Ȯ��");
		// limit�� ���ϵǴ� �迭�� ũ��. ��, �ɰ����� �������� Ŀ�� ���� ����.
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result ��� : " + t);
		
		
		// �迭�� ������ �ڷᱸ�� : list
		// �迭�� List�� ��ȯ�ϴ� ���
		result = temp2.split(",");
		System.out.println("9. result �迭�� List ��ü�� ��");
		List<String> rlist = Arrays.asList(result);
		System.out.println(rlist);
		System.out.println("rlist size : " + rlist.size());
		for(String t : rlist)
			System.out.println("rlist ��� : " + t);
		
		// ���� rlist�� �迭�� ũ�⸸ŭ List�� �������� ������. (�߰�/����/����Ұ�)
//		rlist.add("test");		// ���� : ������ ũ���� ����Ʈ
//		rlist.remove(2);		// ����
//		rlist.add(2, "100");	// ����
		
		// ������ List�� �����
		System.out.println("10. ArrayList�� ���ڰ� �ִ� ������ �׽�Ʈ");
		List<String> rlist2 = new ArrayList<String>(rlist);
		System.out.println(rlist2);
		rlist2.add("test");
		rlist2.remove(2);
		rlist2.add(2, "100");
		System.out.println(rlist2);
		
		
		// Arrays.asList�� �׽�Ʈ������ �Ǵ� ������ ���� ����Ʈ ������ ���
		List<Integer> ilist = Arrays.asList(1,2,6,9,100);
		System.out.println("11. Arrays.asList Ȱ��");
		System.out.println(ilist);
	}
}
