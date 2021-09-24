package constructor;

public class Person {
	private String name ;
	private float height ;
	private float weight ;
	
	//�⺻ �����ڰ� �ֽ��ϴ�.
	
	//�⺻ ������(���� ó�� ������ ������ ������)
	public Person() { //Ŭ������ �����Ҷ� ��� ������ ����� �ʱ�ȭ�����ش�.
		name = "ȫ�浿";
		height = 170;
		weight = 80;
	}
	
	public Person(String pName) { //pName : name�� ���� Parameter�̴�. 
		name = pName;  //���� ���� �Է¹޾� �ʱⰪ�� ���ϴ°� �ƴ϶� �Է¹��� ���� �ʱⰪ���� 
		height = 170;
		weight = 80;
	}

	public Person(String name, float height, float weight) { 
		//���� name�� �޾ƿ԰� ��� �Ű� ������ ���� �ܺο��� �Է¹���
		super();
		this.name = name;
		this.height = height;
		this.weight = weight; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	//�����ε� Over load
	@Override
	public String toString() { //����ִ� �������� �ϳ��� �������� ������ش�.
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
}
