package lab11_inheritance_abstraction;

import java.rmi.ServerError;

public class Person {

    private String name;
    private int age;
    private final char gender;


    public Person(String name, int age, char gender) {
       setName(name);
        setAge(age);
        if (! (gender == 'M' || gender == 'F') ){
            System.err.println("Invalid gender: "+ gender);
            System.exit(1);
        }
            this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name== null){
            System.err.println("Name of the person can not be null");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        if ( age <= 0 ) {
            System.err.println("Invalid age" + age);
            System.exit(1);
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }
    public void eat(String food){
        System.out.println(name + " is eating "+ food);

    }
    public void drink(){
        System.out.println(name+ " is drinking water");

    }

    public void sleep(){
        System.out.println(name+ " is sleeping early");

    }


    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

/*
1. Create a class named Person:
			Variables:
				name, age (final), gender

			Encapsulate all the fields
				Conditions:
					1. age can not be zero or negative
					2. gender can only be set to 'M' or 'T'
					3. name can not be null

			methods:
				eat(), drink(), sleep(), toString()

	2. Create the subclass of Person named Employee
			Extra variables:
				id, jobTitle, salary

			extra methods:
				work() (abstract)

			override the toString to include id, jobTitle, salary

	3. Create the following sub classes of the Employee:
			1. Tester
					extra methods:
						createTicket, dailyStandUp(), workFromHome()

			2. Developer
					extra methods:
						fixBug(), dailyStandUp(), workFromHome()

			3. BusinessAnalyst
					extra methods:
						analyze(), dailyStandUp(), workFromHome()

			4. ScrumMaster:
					extra methods:
						coaching(), dailyStandUp(), workFromHome()

			5. Teacehr:
					extra methods:
						teach(),workFromHome()

			6. Driver:
					extra methods:
						drive()

			7. Janitor:
 */
