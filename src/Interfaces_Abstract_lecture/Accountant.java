package Interfaces_Abstract_lecture;

public class Accountant extends Employee{


    public Accountant(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "TPS Reports have been drafted!";
    }


    public String morningMeeting() {
        return "Accountants have morning meetings beginning at 8:15AM and running until 8:45AM";
    }


    public String lunchTime() {
        return "Accountants take their lunch at their desk when they want to.";
    }


    public int dailyPay() {
        return 500;
    }
}
