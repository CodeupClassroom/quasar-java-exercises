package grades;

import java.util.ArrayList;

public class Student {
    private String name; //a student's name
    private ArrayList<Integer> grades; //a student's grades

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>(); //A new student arrives - let's make sure they have an area to store their grades
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;//A bucket to store the sum of grades

        for(int grade : this.grades){
            sum += grade;
        }

        return sum / this.grades.size();
    }

    public static void main(String[] args) {
//        Student mcKenneth = new Student("mcKenneth");
//        Student mcJackie = new Student("mcJackie");
//        Student mcPatric = new Student("mcPatric");
//
//        mcKenneth.addGrade(88);
//        mcKenneth.addGrade(75);
//        mcKenneth.addGrade(90);
//
//        mcJackie.addGrade(92);
//        mcJackie.addGrade(100);
//        mcJackie.addGrade(80);
//
//        mcPatric.addGrade(78);
//        mcPatric.addGrade(83);
//        mcPatric.addGrade(95);
//
//        System.out.println("mcKenneth.grades = " + mcKenneth.grades);
//        System.out.println("mcJackie.grades = " + mcJackie.grades);
//        System.out.println("mcPatric.grades = " + mcPatric.grades);
//        System.out.println("-~-~-~ Grade Averages ~-~-~-");
//        System.out.println("mcKenneth.getGradeAverage() = " + mcKenneth.getGradeAverage());
//        System.out.println("mcJackie.getGradeAverage() = " + mcJackie.getGradeAverage());
//        System.out.println("mcPatric.getGradeAverage() = " + mcPatric.getGradeAverage());

    }


}
