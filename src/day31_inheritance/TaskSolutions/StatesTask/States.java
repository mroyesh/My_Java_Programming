package day31_inheritance.TaskSolutions.StatesTask;

public class States {
    private String name, abbreviation, politicalParty,governor, senator;
    private double population, stateTax;

    public States(String name, String abbreviation, String politicalParty,
                  String governor, String senator, double population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        if(name==null){
            System.out.println("Invalid name"+ null);
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()|| name.isBlank()){
            System.out.println("Name can not be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        if(abbreviation== null){
            System.out.println("name can not be "+ null);
            System.exit(1);
        }
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation.isEmpty()|| abbreviation.isBlank()){
            System.out.println("Abbreviation can not be empty or blank");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        if(politicalParty== null){
            System.out.println("political party can not be "+ null);
            System.exit(1);
        }
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty.isEmpty()|| politicalParty.isBlank()){
            System.out.println("political party can not be empty or blank");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        if(senator== null){
            System.out.println("Governor can not be: "+null);
            System.exit(1);
        }
        return governor;
    }

    public void setGovernor(String governor) {
        if(governor.isEmpty()|| governor.isBlank()){
            System.out.println("Governor can not be empty or blank");
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        if(senator==null){
            System.out.println("Senator can not be: "+ null);
            System.exit(1);
        }
        return senator;
    }

    public void setSenator(String senator) {
        if( senator.isBlank()|| senator.isEmpty()){
            System.out.println("Senator can not be blank or empty");
            System.exit(1);
        }
        this.senator = senator;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        if( population<=0){
            System.out.println("population can not be zero or negative"+ population);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax<=0){
            System.out.println("State tax can no set to zero or negative");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
