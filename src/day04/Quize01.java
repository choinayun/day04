package day04;

import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		
		/*
		while(true) { // ��ȣ �ȿ��� ���ǽ�. ���� ��� ���ӹ����� ���� 
			System.out.println("����");
		}
		*/
		
		
		// ��¥�� �Է¹޾� 1���̸� '��' 2���̸� 'ȭ' ...
		// 7�� �̸� '��' 8�� '��' ���ڿ� ���� ������ ����ϼ��� 
		
		/*
		while(true) {
			
			Scanner input = new Scanner(System.in);
			
			int day;
			System.out.println("��¥�� �Է��ϼ���");
			day = input.nextInt();
			
			switch(day%7) {
				
				case 1 : System.out.println("��");break;
				case 2 : System.out.println("ȭ");break;
				case 3 : System.out.println("��");break;
				case 4 : System.out.println("��");break;
				case 5 : System.out.println("��");break;
				case 6 : System.out.println("��");break;
				case 0 : System.out.println("��");break;
					
			}
			
		}
		*/
		
		int num = 10, su = 0;
		char ch = 0;
		double dou = 0;
		
		String str = null;
		// String (���ڿ�) �� 0���� ���� �ʱ�ȭ �Ұ�
		// ù��° ���ڰ� �빮�ڷ� ������� �ڷ���(����)�� 0 ���� �ʱ�ȭ �Ұ� 
		// (ù��° ���ڰ� �ҹ��ڷ� ������� �ڷ����� 0���� ���� �ʱ�ȭ) 
		// null ������ ���� �ʱ�ȭ ���� 
		
		if(num == 10) {
			su = 100;
		}
		System.out.println(su); 
		
		// ������ ���� ���� : su �� ���� ���⶧�� 
		// su = 0; ���� �ʱ�ȭ ���ָ� ������ �ȳ��� 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
