package method;

public class Test03WithInstructor {

	public static void main(String[] args) {
		// 1000���� �ڿ��� �߿��� 2�� ������� 7�� ����� ���� ���,
		//�� ������ ������ ���...
		// (while)�� �̿�
		
		int num = 1;
		int sum = 0; // be sure make the sum value to be initalized.
		
		while (num <= 1000) {
			if (num%2 == 0 && num%7 == 0) {
			System.out.println(num);
			sum += num;
			
			}
		}
		
		System.out.println("����: " + sum);
	}

}
