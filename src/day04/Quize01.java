package day04;

import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		
		/*
		while(true) { // 괄호 안에는 조건식. 참일 경우 종속문장이 실행 
			System.out.println("실행");
		}
		*/
		
		
		// 날짜를 입력받아 1일이면 '월' 2일이면 '화' ...
		// 7일 이면 '일' 8일 '월' 숫자에 맞춰 요일을 출력하세요 
		
		/*
		while(true) {
			
			Scanner input = new Scanner(System.in);
			
			int day;
			System.out.println("날짜를 입력하세요");
			day = input.nextInt();
			
			switch(day%7) {
				
				case 1 : System.out.println("월");break;
				case 2 : System.out.println("화");break;
				case 3 : System.out.println("수");break;
				case 4 : System.out.println("목");break;
				case 5 : System.out.println("금");break;
				case 6 : System.out.println("토");break;
				case 0 : System.out.println("일");break;
					
			}
			
		}
		*/
		
		int num = 10, su = 0;
		char ch = 0;
		double dou = 0;
		
		String str = null;
		// String (문자열) 은 0으로 변수 초기화 불가
		// 첫번째 글자가 대문자로 만들어진 자료형(변수)은 0 으로 초기화 불가 
		// (첫번째 글자가 소문자로 만들어진 자료형은 0으로 변수 초기화) 
		// null 값으로 변수 초기화 진행 
		
		if(num == 10) {
			su = 100;
		}
		System.out.println(su); 
		
		// 오류가 나는 이유 : su 에 값이 없기때문 
		// su = 0; 변수 초기화 해주면 오류가 안난다 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
