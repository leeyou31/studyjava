package ch02_1_variable;

	public class VariableScopeExample {
		// ��Ű�� ���� VariableScopeExample�̶�� Ŭ������ �����Ѵ�.
		public static void main(String[] args) {
		// �����̶�� ���ڿ�[] ���� �޼��带 �����Ѵ�. 
			int v1=15; // ������ ������ v1�̸� v1���� 15�̴�.
			if(v1>10) { // ���� v1 ���� > ���� 10���� Ŭ ���
				int v2; //������ ������ v2�̴�.
				v2 = v1 -10; //v2 ������ v1 -10���� �����Ǿ��ִ�.
			}
			//int v3 = v1 + v2 + 5;// ������ ���� v3�� v1���� v2���� �׸��� �� 5�� ���� ���̴�.
	}
}
