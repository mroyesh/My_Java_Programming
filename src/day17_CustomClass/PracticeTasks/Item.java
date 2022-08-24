package day17_CustomClass.PracticeTasks;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;

    public void setInfo(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(double unitPrice, int quantity) {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Name of the item: " +
         name + "\n Quantity: =" + quantity + "\n unitPrice: = " + unitPrice + "\nTotal cost:= " + calcCost(unitPrice, quantity);
    }
}