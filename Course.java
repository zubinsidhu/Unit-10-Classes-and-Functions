public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) { this.courseName = courseName;} 
	public String getCourseName() { 
		return courseName; 
	}
	
	public void addStudent(String student) {
		if (numberOfStudents == students.length) 
			increaseSize(); 
		students[numberOfStudents] = student; 
		numberOfStudents++;
	}
		
	private void increaseSize() {
		String[] temp = new String[students.length * 2 + 1];
		System.arraycopy(students, 0, temp, 0, students.length);
		students = temp;
	}
		
		
	
	public void dropStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				for (int j = i + 1; j < numberOfStudents; j++)
					students[j - 1] = students[j]; 
				numberOfStudents--;
			}
			break;
		}
	} 

	public String[] getStudents() { 
		//return students;
		String[] students_new = new String[numberOfStudents];
		for (int i=0; i < numberOfStudents; i++) {
			students_new[i] = students[i];
		}
		return students_new;
	}
	
	
	public int getNumberOfStudents() { 
		return numberOfStudents; 
	}
	
	public void clear() {
		for (int i=0; i < numberOfStudents; i++) {
			students[i] = null;
		}
		numberOfStudents=0;
	}
}
			