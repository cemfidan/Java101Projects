public class Course {
	Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int midtermExam;
    int finalExam;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.midtermExam = 0;
        this.finalExam = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Transaction is successful.");
        } else {
            System.out.println(t.name + " Academician can not teach this course.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println("Academician of " + this.name + " course: " + courseTeacher.name);
        } else {
            System.out.println("No Academician has been assigned to the " + this.name +  " course.");
        }
    }
}
