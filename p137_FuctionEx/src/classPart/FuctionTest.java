package classPart;

public class FuctionTest {

	public static void main(String[] args) {
		//2���� ���� ���Ͽ� ����ϴ� �Լ��� �����Ѵ�.
		int num1;
		int num2;
		num1 = 10;
		num2 = 20;
		
		// add�Լ��� ������� ���� sum�̶�� ������ �����Ѵ�.
		int sum = add(num1, num2);
		int sum1 = oper4Kinds('*',num1, num2);
		
		
		System.out.println(num1 + " + " + num2 + " = " + sum + "�Դϴ�." );
	}
	//���� 2���� ������ �Ű������� ���Ͽ� ����ϴ� add�Լ��� �����.
	public static int add(int n1, int n2) {
		int result = n1 + n2 ;
		return result;
	}
	private static int oper4Kinds(char kind, int n1, int n2) {
		switch(kind) { //�̷��� ���ϰ� ���� ����� �ѹ��� ����� ���� �ʴ�.
		case '+':
			return n1 + n2;
		case '-':
			return n1 - n2;
		}
		return 0;
		
	}
	
	

}
