package ch02_4_print_the_variable_and_system;

	import java.util.Scanner;

		public class ScannerExample1 {

			public static void main(String[] args) throws Exception {
				Scanner scanner = new Scanner(System.in); // new �� ���� ���� ��ü�� �ȴ�. �츮�� �� �� �ְ� �ȴ�.
				String inputData;
				
				while(true) {
					inputData = scanner.nextLine();
					System.out.println("�Էµ� ���ڿ�: \"" + inputData + "\"");
					if(inputData.equals("q")) {
						break;
					}
				}
				System.out.println("����");
				
	}

}
