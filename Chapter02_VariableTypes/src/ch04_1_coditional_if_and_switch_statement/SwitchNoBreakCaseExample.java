package ch04_1_coditional_if_and_switch_statement;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[���� �ð�: " + time + " ��]");
		
		switch(time) {
			case 8:
				System.out.println("����մϴ�.");
				break;
			case 9:
				System.out.println("ȸ���մϴ�.");
				break;
			case 10:
				System.out.println("������ ���ϴ�.");
				break;
			case 11:
				System.out.println("�ܱ��� �����ϴ�.");
				break;
		}
		

	}

}
