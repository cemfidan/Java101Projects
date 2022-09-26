import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = scanner.nextLine();
		
		System.out.print("Student Number: ");
		String number = scanner.nextLine();
		
		System.out.print("Class: ");
		int classes  = scanner.nextInt();
		
		System.out.print("Midterm Exam: ");
		int midtermExam = scanner.nextInt();
		
		System.out.print("Final Exam: ");
		int finalExam = scanner.nextInt();
		
		Course maths = new Course("Maths", "MATHS101", "MATHS");
        Course phys = new Course("Physics", "PHYS101", "PHYS");
        Course chem = new Course("Chemistry", "CHEM101", "CHEM");

        Teacher t1 = new Teacher("Thales", "90550000000", "MATHS");
        Teacher t2 = new Teacher("Isaac Newton", "90550000001", "PHYS");
        Teacher t3 = new Teacher("Walter White", "90550000002", "CHEM");

        maths.addTeacher(t1);
        phys.addTeacher(t2);
        chem.addTeacher(t3);

        Student student = new Student(name, number, classes, maths, phys, chem);
        student.addBulkMidtermExam(50,20,40);
        student.addBulkFinalExam(20,60,40);
        student.isPass();
        scanner.close();
	}

}
