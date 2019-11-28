package Constructors;

public class Trainee {
	private int age;
	private String name;

	public Trainee() {

	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age < 130 && age > 0) {
			this.age = age;
		} else {
			System.out.println("WRONG!");
		}}
		
		
		public String getName() {
			return this.name;
		}

		public void setName(String name) {

				this.name = name;
			
		
	}

	public Trainee(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void breathe() {
		System.out.println("sigh");
	}

	public void printDetails() {
		System.out.println("Age: " + this.age);
		System.out.println("Name: " + this.name);
	}

}
