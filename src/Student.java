public class Student {
    public String name;
    public String cohort;
    private double grade;
    private String studentDisclosure;

    public double shareGrade() {
        return grade;
    }

    public String shareDisclosure(){
        return studentDisclosure;
    }

    //Now, let's add a constructor - what is it? A METHOD OF OBJECT CREATION

    public Student(String studentName){
//        this.name = studentName;
//        this.cohort = "Unassigned";
//        System.out.println("Student constructor one complete");

        //Calling second constructor inside of constructor :O
        this(studentName, "Unassigned");
    }

    public Student(String studentName, String studentCohort){
        this.name = studentName;
        this.cohort = studentCohort;
//        System.out.println("Student constructor two complete");
    }

    public Student(String studentName, String studentCohort, double grade){
        this.name = studentName;
        this.cohort = studentCohort;
        this.grade = grade;

    }

    public Student(String studentName, String studentCohort, double grade, String studentDisclosure){
        this.name = studentName;
        this.cohort = studentCohort;
        this.grade = grade;
        this.studentDisclosure = studentDisclosure;

    }

    public static void main(String[] args) {
        //Before constructors: [similar feel to JS?]
//        Student mcStudent = new Student();
//        mcStudent.name = "Ronald";
//        mcStudent.cohort = "Golden Arches";
//
//        System.out.println(mcStudent.name + " is in the " + mcStudent.cohort + " cohort");

        //First constructor experiment:
        Student shanshan = new Student("Shanshan S.", "Marco");

        System.out.println("shanshan.name = " + shanshan.name + " shanshan.cohort = " + shanshan.cohort);

        //Second constructor experiment:
        Student kenneth = new Student("Kenneth H.");

        System.out.printf("%s is the student name and %s is their assigned cohort", kenneth.name, kenneth.cohort);

    Student mcKenneth = new Student("mcKenneth mcHowell", "mcDeimos", 88.8);

        System.out.println("mcKenneth.grade = " + mcKenneth.grade);
    }

}
