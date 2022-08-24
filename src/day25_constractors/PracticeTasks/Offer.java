package day25_constractors.PracticeTasks;

public class Offer {
    public String Location, companyName, jobTitle;
    public double salary;
    public boolean hasBenefits, hasPTO, isWFH,ifFullTime;

    public Offer(String location, String companyName, String jobTitle, double salary, boolean hasBenefits, boolean hasPTO, boolean isWFH, boolean ifFullTime) {
        Location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefits = hasBenefits;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.ifFullTime = ifFullTime;
    }

    public String toString() {
        return "Offer{" +
                "Location='" + Location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefits=" + hasBenefits +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", ifFullTime=" + ifFullTime +
                '}';
    }
}
