package ch02_4_print_the_variable_and_system;

public class QStopExample { //QstopExample ���� Ŭ������ �����Ѵ�.
	public static void main(String[] args) throws Exception{ //���ڿ� ������ ������ ���ͷ� ���� ���� ���� �޼ҵ带 �����Ѵ�. �׸��� ���� ó���� �ִ� 
		int keyCode; // keyCode��� ������ Ÿ���� ������ �����Ѵ�.
		
		while(true) { //���࿡,���ǹ� while, ���� ��� ���� keyCode�� System.in.Read() �޼��带 �д´�. 
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode); // "keyCode: " + keycode�� ���ο� �࿡ ����϶�.
			if(keyCode == 113) { // == �����ڸ� >= �ٲٸ�.. 113���� �� ū int keyCode�� ���� �� ���α׷��� �����Ѵ�.
				break; // ���࿡, ���ǹ� if, keyCode ������ 113�� �´ٸ�, break...�� �ߴ��ض�.
			}
		}
	
		System.out.println("����"); //�׸��� "����"��� ���ͷ��� ���ο� �࿡ ����϶�.
	}
}


/******************************
* System.in.read()�� ������ Ű�ڵ带 �ϳ��� �б� ������ 2�� �̻��� Ű�� ���յ� �ѱ��� ���� �� ����.
* �׸��� Ű����κ��� �Էµ� ������ �� ���ڿ��� ���� ���Ѵ�.
* �׷��� �ڹٴ� Scanner��� Ŭ������ �����Ѵ�.
********************************/