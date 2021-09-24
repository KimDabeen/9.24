package callByValRef;

public class Comp {
	int age;

	public static void main(String[] args) {
		//Call by value
		int age;
		age = 22;
		
		yearPass(age); //23���
		yearPass(57); 
		
		System.out.println(age + "�� ����� ����"); //22���
		
		Comp cmp = new Comp(); //Comp�� cmp��� ��ü�� �����?? �⺻������ 0�Է�
		
		Comp idk = new Comp(); //Comp�ȿ� idk��� ��ü?�� �����.
		System.out.println(idk.age);//���� ���� idk���� age�� 0���� ���ִ�.
		//�̶� yearpass�� idk�� ������ idk.age��ü�� 1�� ���ϱ� ������ idk.age���� 1�� �ٲ��.
		
		
		yearPass(cmp); //1���
		System.out.println(cmp.age + "�� ����� ����"); 
		//1��� yearpass�Լ����� age�� 1�� Ŀ�������� ���������Ƿ� 0�� �ƴ� 1�� ���
	}

	private static void yearPass(int age) {
		//���⼭ age�� �տ��� ������ 22�� �ƴϰ� �޼ҵ忡 ���� �Ű������� �̸��̴�.
		age++; //���� �Ű������� ���� 1�� ���Ѵ�.
		System.out.println(age + "�� ����� ����"); //1�� ������ �Ű� ������ ����Ѵ�.
	}
	
	private static void yearPass(Comp obj) { //Comp�� ����ִ� obj�� �μ��� �޴´�.
		obj.age++; //Comp�ȿ� �ִ� �ֵ��� obj�� �̸� ���� ���߿��� age���� �������ڴ�.??
		//���⼭ age�� ���θ������ Comp�� ��ü?�ȿ� ����ִ� age�� ���ϴ� ���̹Ƿ� 
		//age++���ϸ� ������ age���� 1�� Ŀ�� ���·� ����ȴ�.
		System.out.println(obj.age + "�� ����� ����"); 
	}

}
