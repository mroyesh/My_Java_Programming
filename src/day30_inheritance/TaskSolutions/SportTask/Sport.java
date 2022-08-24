package day30_inheritance.TaskSolutions.SportTask;

public class Sport {
    private String name, rules;
    private int numberOfPlayers, getNumberOfReferre;

    private String origin;


    public Sport(String name, String rules, int numberOfPlayers, int getNumberOfReferre, String origen) {
        setName(name);
        setRules(rules);
        setNumberOfPlayers(numberOfPlayers);
        setGetNumberOfReferre(getNumberOfReferre);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if(numberOfPlayers<=0){
            System.out.println("number of players can not set to"+ numberOfPlayers);
            System.exit(1);
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getGetNumberOfReferre() {
        return getNumberOfReferre;
    }

    public void setGetNumberOfReferre(int getNumberOfReferre) {
        if(getNumberOfReferre<+0){
            System.out.println("number of raferee can not set to"+ getNumberOfReferre);
            System.exit(1);
        }
        this.getNumberOfReferre = getNumberOfReferre;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void play(){
        System.out.println("Ali is plying "+name);
    }

    public String toString() {
        return getClass().getSimpleName()+
                ", Team name= '" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", getNumberOfReferre=" + getNumberOfReferre +
                '}';
    }
}






