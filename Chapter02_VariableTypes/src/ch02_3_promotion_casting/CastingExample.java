package ch02_3_promotion_casting;

public class CastingExample { //CastingExample�̶�� ����Ÿ�Կ��� Ŭ������ �����Ѵ�. �� Ŭ������ ��Ű�� ch02_3_promotion_casting�� �ҼӵǾ��ִ�.
	public static void main(String[] args) { // ���ڿ� ������ ���� �����Ǿ��ִ� �� ���� �޼ҵ带 �����Ѵ�. 
		int intValue = 44032; // intValue��� ������ ������ 44032��� ���� ������.
		char charValue = (char) intValue; // charValue��� ������ ������ intValue��� ������ ������ ���������� ����Ÿ�� ��ȯ�Ѵ�.
		System.out.println(charValue); // ���ο��࿡ charValue�� ����϶�.
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}
