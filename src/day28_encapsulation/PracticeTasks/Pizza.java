package day28_encapsulation.PracticeTasks;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
       setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if ( !size.equalsIgnoreCase("small") || !size.equalsIgnoreCase("medium") || !size.equalsIgnoreCase("large") ) {
            System.out.println("We only carry small, medium and large size");
            System.exit(1);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {

        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if ( numberOfCheeseTopping > 0 ) {
            if ( size.equalsIgnoreCase("small") && numberOfCheeseTopping > 3 ) {
                System.err.println("for size small max cheese topping is 3");
                System.exit(1);
            } else if ( size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 4 ) {
                System.err.println("for size medium max cheese topping is 4");
                System.exit(1);
            } else if ( size.equalsIgnoreCase("large") && numberOfCheeseTopping > 5 ) {
                System.err.println("for size large max cheese topping is 5");
                System.exit(1);
            }
        } else {
            System.out.println("Invalid number if cheese topping");
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }


    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if ( numberOfPepperoniTopping > 0 ) {
            if ( size.equalsIgnoreCase("small") && numberOfPepperoniTopping > 4 ) {
                System.err.println("max number of pepperoni for size small is 4");
                System.exit(1);
            } else if ( size.equalsIgnoreCase("medium") && numberOfPepperoniTopping > 5 ) {
                System.err.println("Max number of pepperoni topping of size medium is 5");
                System.exit(1);
            } else if ( size.equalsIgnoreCase("large") && numberOfPepperoniTopping > 6 ) {
                System.out.println("max number of pepperoni topping for size large is 6");
                System.exit(1);
            }
        }else {
            System.err.println("Invalid entry");
            System.exit(1);
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost() {
        if ( size.equalsIgnoreCase("small") ) {
            System.out.println(10 + (2 * numberOfCheeseTopping) + (2 * numberOfCheeseTopping));
        } else if ( size.equalsIgnoreCase("medium") ) {
            System.out.println(12 + (2 * numberOfCheeseTopping) + (2 * numberOfPepperoniTopping));
        } else if ( size.equalsIgnoreCase("large") ) {
            System.out.println(14 + (2 * numberOfCheeseTopping) + (2 * numberOfPepperoniTopping));
        }
        return calcCost();
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Total Cost=" + calcCost()+
                '}';
    }
}

