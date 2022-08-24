package lab09_classObjects_encapsulation.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {  // scrumTeam has A Tester
    private String PO, BA, SM;
    private ArrayList<Tester> testers = new ArrayList<>();
    private ArrayList<Developer> developers = new ArrayList<>();
    private int daysOfSprint;

    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {

        terminate(PO, "Invalid PO name"+PO);
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {

        terminate(BA, "Invalid name"+BA);
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        terminate(SM, "Invalid SM name"+SM);
        System.exit(1);

        this.SM = SM;
    }

    public int getDaysOfSprint() {
        return daysOfSprint;
    }

    public void setDaysOfSprint(int daysOfSprint) {
        if(daysOfSprint<=0){
            System.err.println("Invalid days of sprint"+daysOfSprint);

            System.exit(1);
        }
        this.daysOfSprint = daysOfSprint;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    private static void terminate(String agr, String err) {

        if ( agr == null || agr.isBlank() || agr.isEmpty() ) {
            System.err.println(err);
            System.exit(1);
        }

    }

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        setBA(BA);
        setPO(PO);
        setSM(SM);
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTester(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDeveloper( Developer developer){
        developers.add(developer);
    }
    public void addDeveloper(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));

    }
    public void removeTester( String id){
        getTesters().removeIf(p->p.getId().equals(id));
    }

    public void removeDeveloper( String id){
        developers.removeIf(p->p.getId().equals(id));
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }
}
