package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.jar.Attributes.Name;

public class C46_ArrayList {
	public static void main(String[] args) {
		int[] datas = {45,23,7,21,19,11,44};	// �迭�� ������ �� �迭�� ũ�⸦ ���Ѵ�.
									// �迭�� �⺻�� ������ Ÿ�� int, double, long... �Ǵ� ������ Ÿ��
		
		ArrayList<Integer> list = new ArrayList<>();
					// ArrayList�� ũ�Ⱑ ����.
					// ������ Ÿ���� �׻� ������ Ÿ��. �⺻���� ���� Ŭ������ ���.
					// <E>�� ���ʸ�(generic, ��������) Ÿ���̶�� �θ�. ��� Ÿ���� ����Ʈ�� ���� �� �ִ�. 
					// ����Ʈ�� �����ϴ� �����͸� ���(Element)��� �Ѵ�.
					// �ֿ� �޼ҵ� : add,get,size,remove
		
		String[] names = {"����", "���", "�ź�", "����", "����"};
		ArrayList<String> nameList = new ArrayList<>();
		
		// ArrayList�� ������ �߰��� add() �޼ҵ带 ���.
		list.add(45);
		list.add(7);
		list.add(21);
		list.add(19);
		list.add(11);
		list.add(44);
		
		System.out.println("1. ù��° ArrayList<Integer> ���");
		System.out.println(list);
		System.out.println("����(�迭) " + Arrays.toString(datas) + ", �迭ũ�� : " + datas.length);
		System.out.println("����Ʈ�� ũ�� : " + list.size());
		
		nameList.add("����");
		nameList.add("���");
		nameList.add("����");
		nameList.add("����");
		
		// ũ�� : �迭 - length
		//	 	 ����Ʈ - size() �޼ҵ�
		System.out.println("\n2. �ι�° ArrayList<String> ���");
		System.out.println(nameList);
		System.out.println("����Ʈ�� ũ�� : " + nameList.size());	// ������ ���� ���� 0
		
		// �߰� : add() �޼ҵ�
		System.out.println("\n3. Ư�� ��ġ�� ������ �߰�");
		list.add(1, 23);	// (�ε�����ġ, �߰��� ��) ��, �ε��� ��ġ�� ����Ʈ�� ũ�⺸�� �۾ƾ� ��.
		System.out.println("add(1,23) ��� : " + list);
		nameList.add(2, "�ź�");
		System.out.println("add(2,\"�ź�\") ��� : " + nameList);
		
		// index�� ������ �������� : get() �޼ҵ�
		System.out.println("\n4. �迭ó�� index ������ ������ ��������");
		System.out.println("get(3) : " + list.get(3));
		System.out.println("get(3) : " + nameList.get(3));
		
		// ���� : remove() �޼ҵ�
		System.out.println("\n5. Ư�� ��ġ�� ������(���) ����");
		list.remove(4);
		System.out.println("remove(4) : " + list);
		nameList.remove(4);
		System.out.println("remove(4) : " + nameList);
		
		// Ư�� ���� index �˾Ƴ��� :  �迭 - Arrays.binarySearch()
		//						  ����Ʈ - .indexOf()
		System.out.println("\n6. Ư�� �� ��ġ �˾Ƴ��� ('�ź�'�� ��� �ε���?)");
		System.out.println("�迭 : " + Arrays.binarySearch(names, "�ź�"));
		System.out.println("����Ʈ : " + nameList.indexOf("�ź�"));
		
		System.out.println("\n7. 6���� ���� ������ for������ ����");
		System.out.println("�迭");
		int i;
		for(i = 0; i < names.length; i++) {
			if(names[i].equals("�ź�"))
				break;
		}	
		System.out.println("'�ź�'�� �ε��� : " + i);
		System.out.println("����Ʈ");
		
		for(i = 0; i < nameList.size(); i++) {
			if(nameList.get(i).equals("�ź�"))
				break;
		}
		System.out.println("'�ź�'�� �ε��� : " + i);
		
	// '�ź�' ��Ұ� �������� �� ����Ʈ�� lastIndexOf �޼ҵ�� ������ ��ġ ��Ҹ� ã�� �� �ִ�.
		
		System.out.println("\n8. contains �޼ҵ�");
		System.out.println("'����'�� ����Ʈ�� �ִ°�? " + nameList.contains("���"));
		System.out.println("'����'�� ����Ʈ�� �ִ°�? " + nameList.contains("����"));
			
	}
}

/*	�迭 : ���� ���� �����͸� �����ϴ� ���
 * 	
 * 	�÷���(Collections) : �ڷᱸ��. ���� ���� �����͸� �����ϴ� ���̰� ������ Ư¡�� ���� 
 * 						����(����, �б�/����)�ϴ� ���̰� �ִ�.
 * 						�����͸� ����/���� ���� �˰����� �޼ҵ�� �����Ǿ� ����.
 * 		�� ArrayList	Ŭ����
 * 		�� HashMap Ŭ����
 * 	
 */