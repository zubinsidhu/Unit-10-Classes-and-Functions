
public class TestCourse {
	public static void main(String[] args) {
		Course cse101 = new Course("Introduction to Java 1");
		cse101.addStudent("Alligator L.");
		cse101.addStudent("Bee M.");
		cse101.addStudent("Coyote N.");
		
		cse101.dropStudent("Alligator L.");

		System.out.println("\nCSE101: " + cse101 + "\nNumber of students registered: " + cse101.getNumberOfStudents());
		for (int i = 0; i < cse101.getNumberOfStudents(); i++) {
			System.out.println(cse101.getStudents()[i]);
		}
	}
}