package ch02_1_variable;

public class VariableUseExample {

	public static void main(String[] args) {
		// ������ �Ҵ�� �� ������
		int x = 100;
		int y = 200;
		// x = 200, y=100
		System.out.println("x�� ��" + x);
		System.out.println("y�� ��" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x�� ��" + x);
		System.out.println("y�� ��" + y);
		
		//y = x;
		
		
	}
}
