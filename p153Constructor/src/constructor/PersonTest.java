package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person ȫ�浿 = new Person(); //�����ڵ� �Լ���.
									// �����Ǿ��ִ� PersonŬ������ �ҷ��´�.
		ȫ�浿.setName("ȫ�浿");
		ȫ�浿.setHeight(199);
		System.out.println(ȫ�浿);
	
		
		Person lee = new Person("�̼���"); //PersonŬ������ �Է¹��� �̼����� �־ ����Ѵ�.
		System.out.println(lee);
		
		Person me = new Person("��ٺ�", 150, 55); //PersonŬ������ �Է¹��� �̼����� �־ ����Ѵ�.
		System.out.println(me);
	}

}
