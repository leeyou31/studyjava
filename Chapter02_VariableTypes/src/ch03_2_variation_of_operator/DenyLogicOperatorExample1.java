package ch03_2_variation_of_operator;

public class DenyLogicOperatorExample1 {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play; // ! ����ǥ�� �� ���� �����ڷμ� variable,����,�տ� ���� ��� not�̶�� ����� �����Ѵ�.
		System.out.println(play);
		
		play = !play;
		System.out.print(play);

	}

}
