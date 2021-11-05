package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;

        for(int grade : this.grades){
            sum += grade;
        }

        return sum / this.grades.size();
    }

    public static void main(String[] args) {
        Student mcKenneth = new Student("mcKenneth");
        Student mcCody = new Student("mcCody");
        Student mcShanshan = new Student("mcShanshan");

        mcKenneth.grades.add(44);
        mcKenneth.grades.add(84);
        mcKenneth.grades.add(34);


        mcCody.grades.add(42);
        mcCody.grades.add(62);
        mcCody.grades.add(82);


        mcShanshan.grades.add(95);
        mcShanshan.grades.add(96);
        mcShanshan.grades.add(98);



        System.out.println("mcCody.getGradeAverage() = " + mcCody.getGradeAverage());
        System.out.println("The above were " + mcKenneth.getName() + "'s grade average");

        System.out.println("mcKenneth.getGradeAverage() = " + mcKenneth.getGradeAverage());
        System.out.println("The above were " + mcCody.getName() + "'s grade average");

        System.out.println("mcShanshan.getGradeAverage() = " + mcShanshan.getGradeAverage());
        System.out.println("The above were " + mcShanshan.getName() + "'s grade average");
    }



}
