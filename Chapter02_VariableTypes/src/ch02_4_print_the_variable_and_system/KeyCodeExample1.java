package ch02_4_print_the_variable_and_system;

public class KeyCodeExample1 {

	public static void main(String[] args) throws Exception{

//	[Ű����κ��� �Է��� ������ ������ �����ϰ� ����ϱ�]
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("KeyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);

	}

}
