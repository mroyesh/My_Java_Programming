package day18_garbageCollection;
public class Pizza {

    public char size;
    public int numberOfCheese, numberOfPepperoni;


    public void setInfo(char size, int numberOfCheese, int numberOfPepperoni) {
        this.size = size;
        this.numberOfCheese = numberOfCheese;
        this.numberOfPepperoni = numberOfPepperoni;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheese=" + numberOfCheese +
                ", numberOfPepperoni=" + numberOfPepperoni +
                '}';
    }

    public double calcCost() {
        double totalCost=0;
        switch (size) {
            case 's':
            case 'S':
                totalCost = 10 + 2 * (numberOfCheese + numberOfPepperoni);
                break;
            case 'm':
            case 'M':
                totalCost = 12 + 2 * (numberOfPepperoni + numberOfCheese);
                break;
            case 'l':
            case 'L':
                totalCost = 14 + 2 * (numberOfCheese + numberOfPepperoni);
                break;
            default:
                System.err.println("Invalid size" + size);
        }
        return totalCost;
    }
}






