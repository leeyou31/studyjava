package ch02_4_print_the_variable_and_system;

import java.util.Scanner;

public class VariableAndSystemMockingTest {

	public static void main(String[] args) {
//		// question 1.
//		String name = "���ڹ�";
//		int age = 25;
//		//print.out.in "println" method
//		
//		String tel1 = "010", tel2 ="123", tel3 = "4567";
//		
//		
//		System.out.println(("�̸�: " + name)+ "\n");
//		System.out.println(("����: " + age)+ "\n");
//		System.out.println(("��ȭ: " + tel1 +"-"+ tel2 +"-"+ tel3)+ "\n");
//		
//		System.out.println("\n\n");
//		//print.out.in "print" method
//		System.out.print(("�̸�: " + name) + "\n\n");
//		System.out.print(("����: " + age) + "\n\n");
//		System.out.print(("��ȭ: " + tel1 +"-" + tel2 + "-"+ tel3)+ "\n\n");
//		
//		//print.out.in "printf" method
//		System.out.printf("�̸�: %s\n\n", name);
//		System.out.printf("����: %d\n\n", age);
//		System.out.printf("��ȭ: %s-%s-%s\n\n", tel1, tel2, tel3);
//	
//		System.out.println("\n\n");
//		
//		// make it summerize of prinf method
//		System.out.printf("�̸�: %s\n\n ����: %d\n\n ��ȭ: %s-%s-%s\n\n",  name, age, tel1, tel2, tel3);
//
//	}
//
//		//question2.
//
//		public static void printOneTimesA() {
//			Scanner scanner = new Scanner(System.in);
//			
//			System.out.print("ù��° ��: ");			
//			String strNum1 = scanner.nextLine();
//			
//			System.out.print("�ι�° ��: ");
//			String strNum2 = scanner.nextLine();
//			
//			int num1 = Integer.parseInt(strNum1);
//			int num2 = Integer.parseInt(strNum2);
//			int result = num1 + num2;
//			System.out.println("���� ���: " + result);
//			
//		}
//	
//		//Question 3.
//		public static void printTwoTimesA() {
//		//	2021.07.23 ���� ���� § �ڵ� 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[�ʼ� ���� �Է�]");
		System.out.print("1. �̸�: ");
		String strNum1 = scanner.nextLine();
		
		System.out.print("2. �ֹι�ȣ �� 6 �ڸ�: ");
		String strNum2 = scanner.nextLine();
		
		System.out.print("3. ��ȭ��ȣ: ");
		String strNum3 = scanner.nextLine();
		
		strNum1 = "ȫ�浿";
		strNum2 = "123456";
		strNum3 = "010-123-1234";
		System.out.printf("[�Էµ� ����]\n1. �̸�:%s\n2. �ֹι�ȣ �� 6 �ڸ�: %s\n3. ��ȭ��ȣ: %s", strNum1, strNum2, strNum3);
		
//		System,
		// Answer for question 3.
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("[�ʼ� ���� �Է�]");
//		System.out.print("1. �̸�: ");
//		String name = scanner.nextLine();
//		
//		System.out.print("2. �ֹι�ȣ �� 6 �ڸ�: ");
//		String ssn = scanner.nextLine();
//		
//		System.out.print("3. ��ȭ��ȣ: ");
//		String tel = scanner.nextLine();
//		
//		System.out.println("�Էµ� ����]");
//		System.out.println("1. �̸�: " + name);
//		System.out.println("2. �ֹι�ȣ �� 6�ڸ�: " + ssn);
//		System.out.println("3. ��ȭ��ȣ: " + tel);
//		
//		
		}
	
}