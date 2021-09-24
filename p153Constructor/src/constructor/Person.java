package constructor;

public class Person {
	private String name ;
	private float height ;
	private float weight ;
	
	//기본 생성자가 있습니다.
	
	//기본 생성자(생성 처리 절차를 구현한 힘수야)
	public Person() { //클래스를 생성할때 멤버 변수나 상수를 초기화시켜준다.
		name = "홍길동";
		height = 170;
		weight = 80;
	}
	
	public Person(String pName) { //pName : name에 대한 Parameter이다. 
		name = pName;  //직접 값을 입력받아 초기값을 정하는게 아니라 입력받은 값을 초기값으로 
		height = 170;
		weight = 80;
	}

	public Person(String name, float height, float weight) { 
		//위는 name만 받아왔고 얘는 매개 변수를 전부 외부에서 입력받음
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

	//오버로드 Over load
	@Override
	public String toString() { //들어있는 변수들을 하나의 문장으로 만들어준다.
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
}
