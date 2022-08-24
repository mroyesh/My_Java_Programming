package day25_constractors.PracticeTasks;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int getNumberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int getNumberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.getNumberOfPepperoniTopping = getNumberOfPepperoniTopping;
    }
    public double calcCost() {
        double totalPrice = 0;
        switch (size) {
            case 'S':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + getNumberOfPepperoniTopping);
                break;
            case 'M':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + getNumberOfPepperoniTopping);
                break;
            case 'L':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + getNumberOfPepperoniTopping);
                break;

        }
        return totalPrice;

    }

    public String toString() {
        return " Thank you for ordering Pizza!\n Bellow is your order information:\n" +
                " Size= " + size +
                "\n Number of cheese topping = " + numberOfCheeseTopping +
                "\n Number of pepperoni topping =" + getNumberOfPepperoniTopping +
                "\n Total Price= $" + calcCost() + "\n Enjoy!";
    }

}