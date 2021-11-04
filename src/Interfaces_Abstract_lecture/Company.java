package Interfaces_Abstract_lecture;

public class Company { //Haberdashery INC

    public static void main(String[] args) {
        Employee accountBot = new Accountant("numberBot", "Accounting");
        Employee cleanerBot = new Custodian("cleanerBot9000", "Maintenance");
        //Character myWarrior = new Warrior ("Mighty Ken", 500 (hp), 2 (mp)); //a game example!

//        System.out.println(accountBot.work());
//        System.out.println(accountBot.getName());
//        System.out.println(accountBot.getDepartment());
//
//        System.out.println(cleanerBot.work());
//        System.out.println(cleanerBot.getName());
//        System.out.println(cleanerBot.getDepartment());

        //How does our workday go?

        System.out.println(accountBot.getName() + " is reporting for business for the " + accountBot.getDepartment());
        System.out.println(cleanerBot.getName() + " is reporting for business for the " + cleanerBot.getDepartment());

        System.out.println("How do the morning meetings go:");
        System.out.println("accountBot's morning: "+ accountBot.morningMeeting());
        System.out.println("cleanerBot's morning:"+ cleanerBot.morningMeeting());

        System.out.println("What happens at lunchtime?");
        System.out.println("accountBot's lunch: " + accountBot.lunchTime());
        System.out.println("cleanerBot's lunch: " + cleanerBot.lunchTime());

        System.out.println("What kind of work did they do?");
        System.out.println("accountBot's work() = " + accountBot.work());
        System.out.println("cleanerBot's work() = " + cleanerBot.work());

        System.out.println("How much did they get paid?");
        System.out.println("accountBot.dailyPay() = " + accountBot.dailyPay());
        System.out.println("cleanerBot.dailyPay() = " + cleanerBot.dailyPay());


    }


}
