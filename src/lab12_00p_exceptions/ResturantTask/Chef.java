package lab12_00p_exceptions.ResturantTask;

public class Chef extends Employee{
    public Chef(String name, String id, String jobTitle, int age, char gender, double salary) {
        super(name, id, jobTitle, age, gender, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is cooking");
    }
    public void makeOrder(){
        System.out.println(getName()+ " is making the order");
    }

    public void washDishes(){
        System.out.println(getName()+ " is washing dishes");
    }
}

/*
4. Create a subclass of employee named Chef
			extra methods:
				makeOrder()
				washDishes()
 */
