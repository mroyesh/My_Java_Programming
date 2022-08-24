package day26_statics.takes;

import java.time.LocalDate;

public class Server {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;
    public LocalDate hireDate;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime, LocalDate hireDate) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
        this.hireDate = hireDate;
    }
    public void takeOrder(){
        System.out.println(name+" is taking order");
    }
    public void cleanTable(){
        System.out.println(name+ " is cleaning");
    }

    public String isFullTime(){
        return fullTime==true?" FullTime": "part-Time";
    }


    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                ", hireDate=" + hireDate +
                '}';
    }
}
