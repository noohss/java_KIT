package koreait.day03;

import java.util.Scanner;

public class C16_SwitchTest {
	public static void main(String[] args) {
		// switch문은 if ~ else if를 대신하는 명령문
		Scanner sc = new Scanner(System.in);
		int itemNo;
		int pay = 0;
		
		System.out.println("상품목록 : 1. 2200원🍕🍕 2. 1900원🍓🍓 3. 3600원🌷🌷 4. 2870원🍺🍺");
		System.out.print("상품을 선택해서 장바구니에 넣으세요. >>> ");
		itemNo = sc.nextInt();
		
		switch (itemNo) {		// 조건식 작성 했을 때와 같이 비교할 변수
		case 1:
			pay = 2200;
			break;			// 아래의 명령문들은 실행하지 않고 switch문 종료
		case 2:
			pay = 1900;
			break;
			
		case 3:
			pay = 3600;
			break;
			
		case 4:
			pay = 2870;
			break;

		default:		// case문에 해당되지 않은 값에 대해 실행
			System.out.println("상품 선택이 잘못 되었습니다.");
			pay = 9999999;
			break;
		}
		
		System.out.println("결제 금액 " + pay + "입니다." );
		
		// 위의 switch문을 if~ else if로 바꿔어서 실행하기
		if(itemNo == 1) {
			pay = 2200;
		}else if(itemNo == 2) {
			pay = 1900;
		}else if(itemNo == 3) {
			pay = 3600;
		}else if(itemNo == 4) {
			pay = 2870;
		}else {
			System.out.println("상품 선택이 잘못 되었습니다.");
			pay = 9999999;
		}
		System.out.println("결제 금액2 " + pay + "입니다." );
	}
}
