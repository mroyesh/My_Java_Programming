package day37_exceptions;

import Lab08_SplitterApp.Expense;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfCheeseTopping(numberOfPepperoniTopping);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getGetNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setGetNumberOfPepperoniTopping(int getNumberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost() {   /// calculate total cost of pizza and return it as double
        double totalPrice = 0;
        switch (size) {
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfPepperoniTopping + numberOfCheeseTopping);
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfPepperoniTopping + numberOfCheeseTopping);
                break;
            default:
                System.err.println("invalid size:" + size);
                break;
        }
        return totalPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof Pizza) ) {
            System.out.println("Invalid object" + obj);
            System.exit(1);
        }
        Pizza pizza = (Pizza) obj;
        if ( size == ((Pizza) obj).size ) {
            if ( numberOfPepperoniTopping == pizza.numberOfPepperoniTopping ) {
                return true;
            }
        }
        return false;
    }
}
