package day04;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int num;
		String home = null;
		String work = null;
		
		while(true) {
			
			System.out.println("1. �츮�� ���");
			System.out.println("2. ȸ�� ���");
			System.out.println("3. ��Ϻ���");
			
			num = input.nextInt();
			
			switch(num) {
				
				case 1 :
					System.out.println("�츮���� ����ϼ���");
					home = input.next();
					break;
					
				case 2 :
					System.out.println("ȸ�縦 ����ϼ���");
					work = input.next();
					break;
					
				case 3 : 
					if ( home != null && work != null) {
						System.out.println("�츮�� : " + home);
						System.out.println("ȸ�� : " + work);
				
					}else {
						System.out.println("��� ���� �ϼ���");
					}
					
			}
	
		}
		
	}
	
}
