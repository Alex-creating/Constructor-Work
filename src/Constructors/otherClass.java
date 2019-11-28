package Constructors;

public class otherClass {

	public static void main(String [] args) {
		Trainee luke = new Trainee(23, "Luke");
        luke.setAge(130);
		luke.printDetails();
		
		Trainee liam = new Trainee();
		liam.setAge(24);
	liam.setName("Liam");
		liam.printDetails();
		
	}
}
