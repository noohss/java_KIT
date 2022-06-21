package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		
		Random r = new Random();	// ���� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);	// ������ ���� �Է� �ޱ�
		int max = 10;	// �õ�Ƚ��
		int[] triallst = new int[max];	// 10���� ������ �����ϴ� �迭 ����
		
		System.out.println("���� ���߱� ���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�.");
		System.out.println("��, �޸��� ���纸����. (101 ~ 299)");
		int numComputer = r.nextInt(199) + 101;	// 101 ~ 299 ���� �ޱ�
		int numHuman;
		int i = 0;	// �迭�� index
		
		do {
			System.out.println("������ ���� �Է�(��ȸ : " + (max - i) + " +) ->"); // ��ȸ�� 10�� �Է��� ������ i��ŭ ����
			numHuman = sc.nextInt();	// ������ ���� �Է��ϱ�
			if(numComputer > numHuman) {	// numComputer�� ���� ������ ������ ���ں��� Ŭ��
				triallst[i] = numHuman;	// �Է¹��� ���ڸ� �迭�� ����
				i++;					// i�� 1�� ����
				System.out.println("�ƴմϴ�. �� ū ���Դϴ�.");
			}else if(numComputer < numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("�ƴմϴ�. �� ���� ���Դϴ�.");
			}
			
			if(i == max) break;
			
		} while (numComputer != numHuman);
		// numComputer == numHuman�̸� ���� �����. -> do~while ����
		
		if(i == max) {
			System.out.println("�� �޸� �Է� ���� : " + Arrays.toString(triallst));
			System.out.println("�־��� ��ȸ�� �� ���̽��ϴ�. ������ �ٽ� �����ϼ���.!! [���� " + numComputer + "]");
		}else {
			System.out.println("������~ ���߼̽��ϴ�. �������� �õ� Ƚ�� : " + (i+1));
		}
		sc.close();
	}
}
