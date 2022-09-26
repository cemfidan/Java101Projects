public class Student {
	String studentName,studentNo;
    int classes;
    Course maths;
    Course phys;
    Course chem;
    double avarage;
    boolean isPass;


    Student(String studentName, String studentNo,int classes, Course maths, Course phys, Course chem) {
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.classes = classes;
        this.maths = maths;
        this.phys = phys;
        this.chem = chem;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkMidtermExam (int maths, int phys, int chem) {

    	if (0 <= maths && maths <= 100) {
            this.maths.midtermExam = maths;
        }
        if (0 <= phys && phys <= 100) {
            this.phys.midtermExam = phys;
        }
        if (0 <= chem && chem <= 100) {
            this.chem.midtermExam = chem;
        }

    }
    
    public void addBulkFinalExam (int maths, int phys, int chem) {

    	if (0 <= maths && maths <= 100) {
            this.maths.finalExam = maths;
        }
        if (0 <= phys && phys <= 100) {
            this.phys.finalExam = phys;
        }
        if (0 <= chem && chem <= 100) {
            this.chem.finalExam = chem;
        }

    }

    public void isPass() {
        this.isPass = isCheckPass();
        printNote();
        System.out.println("Avarage: " + this.avarage);
        if (this.isPass) {
        	System.out.println("Passed the Class.");
        } else {
            System.out.println("Failed in Class.");
        }
    }

    public void calcAvarage() {
    	 this.avarage = ((this.maths.midtermExam * 0.2 + this.maths.finalExam * 0.8) +
                 		(this.phys.midtermExam * 0.2 + this.phys.finalExam * 0.8) +
                 		(this.chem.midtermExam * 0.2 + this.chem.finalExam * 0.8)) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student: " + this.studentName);
        System.out.println("Maths Grade: " + (this.maths.midtermExam * 0.2 + this.maths.finalExam * 0.8));
        System.out.println("Physics Grade: " + (this.phys.midtermExam * 0.2 + this.phys.finalExam * 0.8));
        System.out.println("Chemistry Grade: " + (this.chem.midtermExam * 0.2 + this.chem.finalExam * 0.8));
    }
}
