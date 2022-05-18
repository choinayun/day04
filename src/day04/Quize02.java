package day04;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int num;
		String home = null;
		String work = null;
		
		while(true) {
			
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록보기");
			
			num = input.nextInt();
			
			switch(num) {
				
				case 1 :
					System.out.println("우리집을 등록하세요");
					home = input.next();
					break;
					
				case 2 :
					System.out.println("회사를 등록하세요");
					work = input.next();
					break;
					
				case 3 : 
					if ( home != null && work != null) {
						System.out.println("우리집 : " + home);
						System.out.println("회사 : " + work);
				
					}else {
						System.out.println("등록 먼저 하세요");
					}
					
			}
	
		}
		
	}
	
}
