package day04;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		// 정수 
		int select;
		System.out.println("숫자를 입력");
		select = input.nextInt();
		
		switch(select) {
		
			case 1 : System.out.println("1입력");break;
			case 2 : System.out.println("2입력");break;
			case 3 : System.out.println("3입력");break;
				default : System.out.println("그 외의 값 입력");
			
		}
		
		// 문자
		char ch;
		System.out.println("문자를 입력");
		ch = (char)System.in.read(); 	//예외처리
		
		switch(ch) {
		
			case 'a' : System.out.println("a 입력");break;
			case 'A' : System.out.println("A 입력");
			
		}
		
		// 문자열 
		String s;
		System.out.println("문자열 입력");
		s = input.next();
		
		switch(s) {
		
			case "안녕" : System.out.println("안녕 입력");break;
			case "그래" : System.out.println("그래 입력");break;
		
		}
		
		System.out.println("다음 문장들 실행");
		

		
	}
}
