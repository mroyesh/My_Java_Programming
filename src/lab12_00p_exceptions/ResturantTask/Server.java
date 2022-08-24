package lab12_00p_exceptions.ResturantTask;

public class Server extends Employee {
    public Server(String name, String id, String jobTitle, int age, char gender, double salary) {
        super(name, id, jobTitle, age, gender, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is serving customer");

    }

    public void takeOrder() {
        System.out.println(getName() + " is taking orders");

    }

    public void cleanTable() {
        System.out.println(getName() + " is cleaning tables");

    }

    public Chef promoteChef() {
        System.out.println("having an issue");
        return promoteChef();
    }
}
