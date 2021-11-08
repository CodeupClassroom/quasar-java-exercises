package Interfaces_Abstract_lecture;

public class Custodian extends Employee{
    public Custodian(String name, String department){
        super(name, department);
    }

    public String work() {
        return "Maintaining the building - cleaning up messes - restocking!";
    }


    public String morningMeeting() {
        return "Custodians have a direct report to the head of the maintenance department. They schedule meetings as necessary.";
    }


    public String lunchTime() {
        return "12:00 - 1:00PM";
    }


    public int dailyPay() {
        return 0;
    }
}
