package ch04_1_coditional_if_and_switch_statement;

public class SwitchPracticeExample {

	public static void main(String[] args) {
		int n = (int)(Math.random()*100);
		System.out.println(n);
		
		int num = n/10;
		System.out.println(num);
//		if(n>=0 && n <10) {
//			System.out.println("0�̻� 10�̸��� ��");
//		} else if(n>=10 && n <20) {
//			System.out.println("10�̻� 20�̸��� ��");
//		} else if(n>=20 && n <30) {
//			System.out.println("20�̻� 30�̸��� ��");
//		} else {
//			System.out.println("you put down the wrong value on variable");
//		}
		switch(num) {
		case 0:
			System.out.println("0�̻� 10�̸��� ��");
			break;
		case 1:
			System.out.println("10�̻� 20�̸��� ��");
			break;
		case 2:
			System.out.println("0�̻� 10�̸��� ��");
			break;
		default:
			System.out.println("���� Ȥ�� 30�̻��� ��");
		}
	
	}
}
