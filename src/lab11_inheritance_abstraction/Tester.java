package lab11_inheritance_abstraction;

import java.util.concurrent.ForkJoinPool;

public final class Tester extends Employee implements ScrumMember, WFH {

    public Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is testing the apps");

    }

    public void creatTicket(){
        System.out.println(getName()+ " is creating tickets");
    }

    @Override
    public void dailyStandUp() {

    }

    @Override
    public void sprintPlanning() {

    }

    @Override
    public void workFromHome() {

    }
}
