package ch02_3_promotion_casting;

public class CastingExample1 {

	public static void main(String[] args) {
//		���� (�����) ����ȯ
//		:~ �ؼ��ϴ� ����� ��ȯ

		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);

//		����) 
		System.out.println((char)65);
//		Ȯ��(promotion) : int ----> double(x) �ڵ�
//		���(demotion) : double ----> int �ս�(o) ����.. 0.5 --> 0

		int iv = 127;
		iv = 1000000;
		byte bv = (byte)iv;

//		(char)<---------int....long...
		double dv = 3.14;
		iv = (int) dv;
		System.out.println(iv);
		
		// "781001-11111111
		int birth = 0;
		System.out.println("781001-11111111");
		
		
	}

}
