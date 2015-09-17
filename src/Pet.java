
public class Pet extends Animal {
	
	private String name;
	private int age; // in year
	private double weight; //in pounds
	
        // 오버라이딩
	public String toString() {
		return ("Name: " + name + " Age: " + age + " years"
				+ "\nWeight: " + weight + " pounds");
	}
	
	public Pet(String initialName, int initialAge, double initialWeight, String iniGender) {  //추가
		
		super(iniGender);  // 부모 클래스 생성자 초기화
		name = initialName;
		if ((initialAge < 0) || (initialWeight < 0)) {
			System.out.println("Error: Negative age or weight.");
			System.exit(0);
		} else {
			age = initialAge;
			weight = initialWeight;
		}
	}

	
	public Pet(String initialName, int initialAge, double initialWeight) {
		
		if( initialAge < 0 && initialWeight < 0 )
			System.exit(0);
		
		this.name = initialName;
		this.age = initialAge;
		this.weight = initialWeight;
	}
        // 오버로딩
	public Pet(String initialName) {
		name = initialName;
		age = 0;
		weight = 0;
	}
	
	public Pet( int initialAge) {
		name = "No name yet.";
		weight = 0;
		if (initialAge < 0) {
			System.out.println("Error: Negative age.");
			System.exit(0);
		} else
			age = initialAge;
	}
	public Pet() {
		name = "No name yet.";
		age = 0;
		weight = 0;
	}
	public void set(String newName, int newAge, double newWeight) {
		this.name = newName;
		this.age = newAge;
		this.weight = newWeight;
	}
	
	public void setAge( int newAge) {
		this.age = newAge;
	}
	
	public void setWeight( double newWeight) {
		this.weight = newWeight;
       }
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getWeight() {
		return this.weight;
	}
}
